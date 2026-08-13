package queue;
//연습문제
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class ParkingMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("주차 가능 대수 입력 : ");
        int parkingSize = sc.nextInt();

        // 네가 만든 Queue 객체 생성
        MyQueueMove parkingQueue = new MyQueueMove(parkingSize);

        // 차량별 주차 시간을 저장
        HashMap<Character, LocalDateTime> parkingTime = new HashMap<>();

        while (true) {

            System.out.println();
            System.out.println("========== 주차 관리 ==========");
            System.out.println("0. 주차여부 확인");
            System.out.println("1. 자동차 주차");
            System.out.println("2. 자동차 출차");
            System.out.println("3. 만차여부");
            System.out.println("4. 종료");
            System.out.print("메뉴 선택 : ");

            int menu = sc.nextInt();

            switch (menu) {

            // =============================
            // 0. 주차여부 확인
            // =============================
            case 0:

                if (parkingQueue.isEmpty()) {
                    System.out.println("주차된 자동차가 없습니다.");
                } else {

                    System.out.println("현재 주차 차량");
                    parkingQueue.showQueue();

                    DateTimeFormatter formatter =
                            DateTimeFormatter.ofPattern("HH:mm:ss");

                    for (Character car : parkingTime.keySet()) {
                        System.out.println(
                                car + " 차량 주차시간 : "
                                + parkingTime.get(car).format(formatter)
                        );
                    }
                }

                break;

            // =============================
            // 1. 자동차 주차
            // =============================
            case 1:

                if (parkingQueue.isFull()) {
                    System.out.println("주차장이 만차입니다.");
                    break;
                }

                System.out.print("차량 고유 문자 입력 : ");
                char car = sc.next().charAt(0);

                // 동일 차량이 이미 존재하는지 확인
                if (parkingTime.containsKey(car)) {
                    System.out.println("이미 주차되어 있는 차량입니다.");
                    break;
                }

                parkingQueue.enqueue(car);

                // 현재 시간을 주차시간으로 저장
                parkingTime.put(car, LocalDateTime.now());

                System.out.println(car + " 차량 주차 완료");

                break;

            // =============================
            // 2. 자동차 출차
            // =============================
            case 2:

                if (parkingQueue.isEmpty()) {
                    System.out.println("주차된 자동차가 없습니다.");
                    break;
                }

                System.out.print("출차할 차량 고유 문자 입력 : ");
                char outCar = sc.next().charAt(0);

                // 차량이 주차되어 있는지 확인
                if (!parkingTime.containsKey(outCar)) {
                    System.out.println("해당 차량은 주차되어 있지 않습니다.");
                    break;
                }

                // 주차 시작 시간
                LocalDateTime startTime = parkingTime.get(outCar);

                // 현재 시간
                LocalDateTime now = LocalDateTime.now();

                // 주차 시간 계산
                long minutes =
                        Duration.between(startTime, now).toMinutes();

                System.out.println(
                        "주차 경과 시간 : " + minutes + "분"
                );

                /*
                 * 1시간 미만
                 */
                if (minutes < 60) {

                    /*
                     * 가장 먼저 주차한 자동차만 출차 가능
                     */
                    if (parkingQueue.peek() == outCar) {

                        parkingQueue.dequeue();
                        parkingTime.remove(outCar);

                        System.out.println(
                                outCar + " 차량 출차 완료"
                        );

                    } else {

                        System.out.println(
                                "주차 후 1시간이 지나지 않았습니다."
                        );

                        System.out.println(
                                "먼저 주차된 차량이 있어 출차할 수 없습니다."
                        );
                    }

                /*
                 * 1시간 이상
                 */
                } else {

                    /*
                     * 원하는 차량이 맨 앞에 올 때까지
                     * 앞 차량을 꺼내서 뒤로 이동
                     */
                    while (parkingQueue.peek() != outCar) {

                        char moveCar = parkingQueue.dequeue();

                        parkingQueue.enqueue(moveCar);

                        System.out.println(
                                moveCar
                                + " 차량 이동 → 출차 순서가 뒤로 밀림"
                        );
                    }

                    // 원하는 차량 출차
                    parkingQueue.dequeue();

                    parkingTime.remove(outCar);

                    System.out.println(
                            outCar + " 차량 출차 완료"
                    );
                }

                break;

            // =============================
            // 3. 만차 여부
            // =============================
            case 3:

                if (parkingQueue.isFull()) {
                    System.out.println("현재 주차장은 만차입니다.");
                } else {
                    System.out.println("현재 주차 가능합니다.");
                    System.out.println(
                            "현재 주차 차량 수 : "
                            + parkingQueue.size()
                            + "대"
                    );
                }

                break;

            // =============================
            // 4. 종료
            // =============================
            case 4:

                System.out.println("주차관리 프로그램을 종료합니다.");

                sc.close();

                return;

            default:

                System.out.println(
                        "0 ~ 4 사이의 번호를 입력해주세요."
                );
            }
        }
    }
}
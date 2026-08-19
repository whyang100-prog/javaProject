package exam.algo.parking;

import java.util.LinkedList;
import java.util.Scanner;

public class ParkingMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 주차 가능한 최대 차량 수
        System.out.print("주차 가능 대수 입력 : ");
        int maxSize = sc.nextInt();

        // 차량 고유 문자를 저장하는 LinkedList
        LinkedList<Character> parking = new LinkedList<>();

        while (true) {

            System.out.println("\n====== 주차 관리 ======");
            System.out.println("0. 주차여부 확인");
            System.out.println("1. 자동차 주차");
            System.out.println("2. 자동차 출차");
            System.out.println("3. 만차여부");
            System.out.println("4. 종료");
            System.out.print("메뉴 선택 : ");

            int menu = sc.nextInt();

            switch (menu) {

            // 0. 주차여부 확인
            case 0:

                if (parking.isEmpty()) {
                    System.out.println("주차된 차량이 없습니다.");
                } else {
                    System.out.println("현재 주차 차량 : " + parking);
                }

                break;

            // 1. 자동차 주차
            case 1:

                if (parking.size() >= maxSize) {
                    System.out.println("주차장이 만차입니다.");
                    break;
                }

                System.out.print("차량 고유 문자 입력 : ");
                char car = sc.next().charAt(0);

                // 이미 주차되어 있는 차량인지 확인
                if (parking.contains(car)) {
                    System.out.println("이미 주차된 차량입니다.");
                    break;
                }

                System.out.println("현재 주차 상태 : " + parking);
                System.out.print("주차할 위치 입력(0 ~ "
                        + parking.size() + ") : ");

                int position = sc.nextInt();

                if (position < 0 || position > parking.size()) {
                    System.out.println("잘못된 위치입니다.");
                    break;
                }

                // 원하는 위치에 차량 삽입
                parking.add(position, car);

                System.out.println(car + " 차량 주차 완료");
                System.out.println("현재 주차 상태 : " + parking);

                break;

            // 2. 자동차 출차
            case 2:

                System.out.print("출차할 차량 고유 문자 입력 : ");
                char outCar = sc.next().charAt(0);

                // 차량 존재 여부 확인
                if (parking.contains(outCar)) {

                    parking.remove(Character.valueOf(outCar));

                    System.out.println(outCar + " 차량 출차 완료");
                    System.out.println("현재 주차 상태 : " + parking);

                } else {
                    System.out.println("해당 차량은 주차되어 있지 않습니다.");
                }

                break;

            // 3. 만차여부
            case 3:

                if (parking.size() >= maxSize) {
                    System.out.println("현재 주차장은 만차입니다.");
                } else {
                    System.out.println(
                            "주차 가능 : "
                            + (maxSize - parking.size())
                            + "대"
                    );
                }

                break;

            // 4. 종료
            case 4:

                System.out.println("프로그램을 종료합니다.");
                sc.close();
                return;

            default:
                System.out.println("잘못된 메뉴입니다.");
            }
        }
    }
}
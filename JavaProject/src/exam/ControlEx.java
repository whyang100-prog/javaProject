package exam;

import java.util.Scanner;

public class ControlEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;        // 상품번호
        int price = 0;  // 가격
        int qty;        // 주문수량
        int total;      // 주문금액
        int discount;   // 할인액
        int pay;        // 총지불액
        String name = "";

        System.out.println("******** 상품 정보 ********");
        System.out.println("1 노트북 : 1,200,000원");
        System.out.println("2 디지털카메라 : 400,000원");
        System.out.println("**************************");

        System.out.print("상품번호 입력 : ");
        num = sc.nextInt();

        switch (num) {
        case 1:
            name = "노트북";
            price = 1200000;
            break;

        case 2:
            name = "디지털카메라";
            price = 400000;
            break;

        default:
            System.out.println("잘못 입력하였습니다. 종료합니다.");
            sc.close();
            return;
        }

        System.out.print("주문 수량 입력 : ");
        qty = sc.nextInt();

        // 주문금액
        total = price * qty;

        // 할인액 계산
        if (total >= 1000000) {
            discount = total * 10 / 100;
        } else if (total >= 500000) {
            discount = total * 5 / 100;
        } else {
            discount = 0;
        }

        // 총지불액
        pay = total - discount;

        System.out.println("\n******** 주문 내용 ********");
        System.out.println("상품명 : " + name);
        System.out.println("가격 : " + price + "원");
        System.out.println("주문 수량 : " + qty + "개");
        System.out.println("주문액 : " + total + "원");
        System.out.println("할인액 : " + discount + "원");
        System.out.println("총지불액 : " + pay + "원");

        sc.close();
    }
}
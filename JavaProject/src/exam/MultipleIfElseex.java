package exam;
import java.util.Scanner;
public class MultipleIfElseex {
public static void main(String[] args) {
	int num1,num2,num3;
	Scanner sc=new Scanner(System.in);
	
	System.out.print("숫자1 입력:");
	num1=sc.nextInt();
	System.out.print("숫자2 입력:");
	num2=sc.nextInt();
	System.out.print("숫자3 입력:");
	num3=sc.nextInt();
	
	if (num1 >= num2 && num1 >= num3) {
	    System.out.println("가장 큰 수 : " + num1);
	}
	else if (num2 >= num1 && num2 >= num3) {
	    System.out.println("가장 큰 수 : " + num2);
	}
	else {
	    System.out.println("가장 큰 수 : " + num3);
	}
	//&&는 모든 조건이 참
	// ||는 하나만 참이어도 참
	//1이 가장 큰경우,2가 가장 큰 경우 ,3이 가장 큰경우
}
}

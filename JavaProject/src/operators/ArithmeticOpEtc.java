package operators;
import java.util.Scanner;
public class ArithmeticOpEtc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//산술 연산
		int num1,num2;
		
		
		System.out.println("점수1 입력: ");
		num1=sc.nextInt();//참조변수가 가지고 있는 기능 중 에 nextInt라는 기능을 쓰겠다라는 뜻임
		//키보드를 통해 입력된 값은 int형 변환후 반환,문자 입력시 오류 발생됨
		System.out.println("점수2 입력: ");
		num2=sc.nextInt();
		
		System.out.println();//콘솔에서 커서 아래로 내림
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);//정수/정수 -> 정수로 반환
		System.out.println(num1%num2);//나눈 나머지 정수로 반환
		
	}

}

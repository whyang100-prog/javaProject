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
		
		
		//결과값 산출시 Overflow 주의
		//Overflow는 연산 후에 결과 값이 너무 커서 저장 범위를 초과하는 경우 Overflow 발생
		//이런경우 에러가 나오는게 아니라 에러없이 쓰리기값(잘못된 값)이 저장됨
		int x=1000000;
		int y=1000000;
		
		int z = x*y;//조단위 수치가 저장되어야함(int에는 조단위가 저장될 수 가 없음,못하면 못한다고 에러메시지를 보내주면 좋은데 그냥 쓰레기 값이 나와버림~)
		//-727379968=쓰레기값 즉 Overflow가 발생
		//연산결과가 커질 것을 예상할 수 있다면 데이터 타입의 크기를 확장해야 함
		System.out.println(z);

		
		
		//Nan연산 Infinity 연산도 주의할 것 
		//System.out.println(10/0);//실행오류(run time오류)가 발생
		//System.out.println(10/0.0);//Infinity 
		
		//System.out.println(10%0);//by zero로 나눈면 안돼요 라는  건알려줌
		System.out.println(10%0.0);// Nan
		
		//문자열 연결 연산자 (+):피연산자 중 문자열이 있으면 문자열 결합
		System.out.println(10+20+"30");//산술연산 후 결합연산
		System.out.println("30"+10+20);//처음부터 결합연산이기때문에 ++두개의 기호 모두 결합댐
		
		
		
		
	}

}

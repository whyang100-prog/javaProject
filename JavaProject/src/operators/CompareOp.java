package operators;

public class CompareOp {

	public static void main(String[] args) {
		//비교 연산자
		//대소: < ,<, =>, >=
		//동등:== ,!= ->가중치를 가지고 있는 데이터에 대해서 동등 비교
		
		int num1=10; int num2=10;
		
		boolean result1 = num1 == num2; //두 변수 값이 같으면 true 반환
		System.out.println(num1 != num2);//두 변수 값이 같지 않으면 true 반환
		
		char char1='A';//아스키코드 :65
		char char2='B';//아스키코드 :66
		System.out.println(char1>char2);//문자타입이지만 결국 정수형으로 비교함, 즉 문자타입은 가중치가 있다라고 볼수있음

		//문자열 비교
		//자바에서는 문자열을 비교할때 문자열이 제공하는 메소드를 비교하는게 좋음
		String pass="1234";
		String userPass="1234";
		
		System.out.println(pass == userPass);//결과가 올바르게 나오더라도 문자열의 비교는 비교연산자를 쓰지 않는다.
		//왜 안되냐? 문자열 클래스할때 알려줄게 ~^^
		
		//문자열의 비교는 문자열 메소드 equals() 메소드 사용
		System.out.println(pass.equals(userPass));
	}

	
	
}

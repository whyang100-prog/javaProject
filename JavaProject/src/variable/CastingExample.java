package variable;

public class CastingExample {
public static void main(String[] args) {
	//강제 타입 변환
	int intValue =44032;//가 라는 글자의 유니코드
	char charValue = (char)intValue; //강제형변환 기호 :(타입)
	System.out.println(charValue);
	
	intValue=103029770;
	byte byteValue=(byte)intValue;
	System.out.println(byteValue);//10이라는 값으로 데이터 손실 발생
	
	double doubleValue=3.14;
	intValue=(int)doubleValue;
	System.out.println(intValue);//3이라는 값으로 소수점 이하 데이터 손실 발생
	
}
}

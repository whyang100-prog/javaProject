package variable;

public class OperationPromotion {
	
public static void main(String[] args) {
	//연산식에서의 자동 타입 변환
	byte byteValue1=10;
	byte byteValue2=20;
	
	//정수연산일 경우 int 타입이 기본 타입 (int는 4byte)
	//byte byteValue3=byteValue1+byteValue2;//더한 결과가 int type임 -타입 불일치 오류 발생
	int intValue34=byteValue1+byteValue2;
	
	char charValue1='A';
	char charValue2=1;
	
	
	//char도 정수이므로 연산결과는 int 형 ->컴파일 오류 발생
	//char charVaalue3=charValue1+charValue2;
	int charValue23=charValue1+charValue2;
	System.out.println(charValue23); //int 형 변수 값 출력
	System.out.println((char)charValue23); //char형 출력
	
	int intValue3 = 10;
	int intValue4 = intValue3/4;//자바의 나누기연산 ->int/int면 결과는 정수로 반환 즉, int로 반환
	System.out.println(intValue4);//10/4 ->2를 반환(실수 결과를 원하면 연산 자체를 실수 연산을 해야함)
	
	int intValue5=10;
	//int intValue6=intValue5/4.0;//int /double ->double형으로 int가 자동형변환 발생 
	double dValue6=intValue5/4.0;//정수 / 실수 ->실수 결과 반환
	System.out.println(dValue6);
	
	
	
  }
}

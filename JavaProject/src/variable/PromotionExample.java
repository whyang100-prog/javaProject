package variable;

public class PromotionExample {
public static void main(String[] args) {
	//자동 형변환
	byte byteValue = 10;
	int intValue =byteValue; //1byte ->4byte byteValue의 리터럴이 대입되는 시점에 정수타입으로 확장

	char charValue='가';
	intValue=charValue; //묵시적 자동 형변환 2byte->4byte
	
	intValue=500;
	long longValue=intValue; //4byte -> 8byte 자동 형변환
	
	double doubleValue=intValue; //
	System.out.println(doubleValue);
	
	
	
	
			
	
}

}

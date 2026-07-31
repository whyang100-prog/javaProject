package classinfo;

public class Car {
	//클래스 구성요소 필드(속성,변수)+메소드(기능,함수)
	//필드
	String carNo;
	String carName;
	String carMaker;
	int carYear;
	int carCc;
	
	int x=0;
	int y=0;
	
	//일반연산코드는 class에 표현 불가능\
	//y+=x
	//메소드:객체를 통해 어디서든 접근 가능(public),반환값 없음 :void 
	//퍼블릭 쓰면 클래스 외부에서 마음대로 사용할 수 있습니다 라는 의미를 가짐
	//클래스에서 필요한 연산은 메소드 내부에서 진행
	public void showCarInfo() {
		System.out.println("차량번호:"+carNo);
	}
	
	
	

}

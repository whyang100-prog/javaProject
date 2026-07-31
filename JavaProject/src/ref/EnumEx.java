package ref;

public class EnumEx {

	
	public static void main(String[] args) {
		// 열거타입 사용
		//열거형도 타입이므로 변수를 선언하고 사용을 할 수 있음
		Week today=null;
		today = Week.SUNDAY;//Sunday,sunDay,sunD,일요일
		
		Week week1= Week.SUNDAY;
		
		//todat와 week1은 같은 열거객체 참조
		System.out.println(today == week1);//true 반환 동일객체 참조

	}

}

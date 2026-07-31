package extendex.poly2;

public class DriveEx {

	public static void main(String[] args) {
		//매개변수의 다형성
		Driver driver = new Driver();
				
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);//파라미터가 superclass로 형변환 발생
		driver.drive(taxi);


	}

}

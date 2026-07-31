package anonymousex.Interfacesex;

public class Aonymous {
    //인터페이스 타입의 필드 초기값으로 익명 구현 객체 사용
	IRemoteControl field=new IRemoteControl(){

		@Override
		public void turnOn() {
			System.out.println("Tv를 겹니다");
		}

		@Override
		public void turnOff() {
			System.out.println("Tv를 끕니다");
		}
		
	};
}

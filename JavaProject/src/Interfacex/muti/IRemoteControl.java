package Interfacex.muti;

public interface  IRemoteControl {
	//상수필드 선언 :선언과 동시에 반드시 초기화
	//[public static final] 데이터타입 필드명 =값
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		}else {
			System.out.println("무음 해제합니다");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}


	


}

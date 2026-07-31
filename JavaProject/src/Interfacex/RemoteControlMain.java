package Interfacex;

public class RemoteControlMain {

	public static void main(String[] args) {
		//인터페이스도 다형성 사용가능
		//인터페이스 참조 변수
		IRemoteControl rc = null;
		
		//구현 클래스 Televisuion 객체를 인터페이스 참조변수에 대입
		rc=new Television();
		rc.turnOn();
		rc.setVolume(10);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();
        
        System.out.println("-------");
        //구현 클래스 Audio 객체를 인터페이스 참조변수에 대입
        rc=new Audio();
        rc.turnOn();
        rc.setVolume(12);
        rc.setMute(true);
        rc.turnOff();
        
        IRemoteControl.changeBattery();
	}

}

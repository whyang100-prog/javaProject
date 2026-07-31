package Interfacex;

public class SamsungPhone implements IsmartPhone {
	
	String name;
	
	public Iphone() {
		name="아이폰";
	}
	
	public SamsungPhone() {
		name="삼성폼";
	}

	@Override
	public void sendCall() {
		System.out.println(name+"으로 전화를 겁니다");
		
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sedSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		
	}
	


}

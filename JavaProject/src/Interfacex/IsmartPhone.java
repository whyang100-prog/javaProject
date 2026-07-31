package Interfacex;

//interface 이름은 관례적으로 대문자 I를 앞에 포함시킴 이름의 첫글자도 대문자로 포함
//IAnimal
public interface IsmartPhone {
	//구현클래스에서 필수구현해야하는 메소드의 원형(선언부)
	// 생성자함수는 포함할 수 없음 - 인터페이스는 객체인스턴스 생성할 수 없음
	public void sendCall();
	public void receiveCall();
	public void sedSMS();
	public void receiveSMS();

	//구성요소 2 상수필드
	

}

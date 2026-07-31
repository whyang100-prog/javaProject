package extendex.abstractex;

public class Dog extends Animal {
     //추상클래스 상속받은 경우 추상 메서드는 반드시 구현
	@Override
	
	public void sound() {
		System.out.println("멍멍");
		
	}

}

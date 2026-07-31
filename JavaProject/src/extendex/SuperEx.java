package extendex;

class SuperClass{
	int x;
	int y;
	
	public SuperClass(){
		x=5;
		y=10;
	}
}
class SubClass extends SuperClass{
	int x;
	
	public SubClass(){
		x=10;
	}
	
	public void show() {
		System.out.println(x); //SubClass에 x필드가 있음 :SubClass의 x가 출력
		System.out.println(y);//SubClass에 y필ㄹ드가 없음:SubClass의y가 출력
		//super 클래스의 x 출력
		System.out.println("super의 x:"+super.x);//Super와Sub가 필드명이 중복되는 경우 Super가 포함하는 필드를 의미
		System.out.println("sub의 x:"+this.x); //Sub클래스의 x필드를 명시적으로 표현
		System.out.println("super의 y:"+super.x); 


		
	}
}

public class SuperEx {

	public static void main(String[] args) {
		// super this 활용 예시
		SubClass sc = new SubClass();
        sc.show();
	}

}

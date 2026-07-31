package extendex;

public class Child extends Parent{
	private int c;
	
	public void setChild() {
		//p=10;//The field Parent.p is not visible(private이어서 상속되지 않음)
		c=20;
		p3=50;//p3가 public이기 때문에 동일패키지 혹은 패키지가 달라도 상속되어져서 접근이 가능함
	}
	
	public void showChild() {
		//상속받은 클래스에서 super클래스 상속된 기능 사용 가능
		showParent();//부모 클래스 메소드 사용
		System.out.println("부모클래스 p2:"+p2);//자식 클래스에서 부모 클래스 필드 접근 :default 접근제한 동일패키지여서 접근이 가능함
		System.out.println("자식 클래스 c:"+c);
		
	}

}

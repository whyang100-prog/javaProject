package exception.classcast;

public class Child2 {

	public static void main(String[] args) {
		//상속관계에 있는 두 클래스
		Child child =new Child();
		Child2 child2
		Parent parent;
		
		parent = child;
		
		//Parent 클래스를 Child 클래스와 Child2클래스가 상속
		child2 = (Child2)parent;//
		
	}

}

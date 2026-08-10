package ramda.localvar;

public class UsingThiss {
	public int outterField = 10;
	public int field =100;
	
	class Inner {
		int innerField =20;
		int field = 200;
		
		void method() {
			//로컬 변수 람다식 구현
			MyFunctingInterface fi= ()->{
			
				System.out.println("outterField"+outterField);
				System.out.println("outterField"+outterField);

			};
			fi.method();
		}
	}

}

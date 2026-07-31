package extendex.Override;

public class Calcultor {
	@Override
	double areaCircle(double r) {
		System.out.println("Calcultor 객체의 areaCircle() 실행");
		return r*r*3.141592;
	}

}

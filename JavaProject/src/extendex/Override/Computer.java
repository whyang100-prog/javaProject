package extendex.Override;

public class Computer extends Calcultor {
	@Override
		double areaCircle(double r) {
			System.out.println("Calcultor 객체의 areaCircle() 실행");
			return Math.PI *r *r;
	}
}

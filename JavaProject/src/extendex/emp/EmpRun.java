package extendex.emp;

public class EmpRun {

	public static void main(String[] args) {
		// Manger 정보 저장 및 출력
		Manger mg=new Manger();//서브클래스 객체 생성

		mg.setManger();
		mg.showMangerInfo();
	}

}

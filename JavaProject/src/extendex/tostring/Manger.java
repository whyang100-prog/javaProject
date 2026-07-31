package extendex.tostring;

public class Manger extends Employee{
	//매개변수가 있는 생성자만 super class가 명시하고 있는 경우

	private String position;
	
	public Manger(String empNo,String name,String part,String position) {
		super(empNo,name,part);
		this.position=position;
	}
	@Override
	public String toString() {//Manger 본연 필드 값 뿐만 아니라 일반적인 사원정보까지 출력
		//super 참조 : 상속받은 상위클래스 인스턴스를 의미
		return super.toString()+"\t|"+position;
		
	}

}

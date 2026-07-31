package extendex.instarray;

public class PersonMain {
	public static void main(String[] args) {
		
	
	//3명의 정보를 처리
	
	Person[] p = new Person[3]; // 래퍼런스 배열
	
	System.out.println("****개인정보 입력****");
	for(int i=0; i<p.length;i++) {
		p[i]=new Person();
		p[i].input();
	}
	}

}

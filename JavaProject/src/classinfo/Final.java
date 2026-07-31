package classinfo;

public class Final {
	//인스턴스에 적용되는 final모든 클래스 공유 불가
   final String nation="korea";
   final String ssn;
   final String name;
   
   public Final(String ssn,String name) {
	   this.ssn=ssn;
	   this.name=name;
   }
}

package extendex.access1;

public class DDD extends extendex.acces.AAA{
	//서로 다른 패키지의 클래스 상속
	public DDD() {
		field1=10; //super class AAA의 필드(public)
		//field2=10; //super class AAA의 필드(defalut)-상속받아도 다른 패키지 사용 불가능
		//field3=10; //super class AAA의 필드(private)-상속받아도 사용 불가능
		field1=10; //super class AAA의 필드(protected) -상속 받은 경우 다른 패키지 사용 가능

		
	}

}

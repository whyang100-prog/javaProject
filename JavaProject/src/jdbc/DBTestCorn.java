package jdbc;


//1.필요패키지 import ,db연결 관련 모든 기느 java.sql 패키지에 있음
import java.sql.Connection; //db 연결 관련 인터페이스
import java.sql.DriverManager; //Connection 구현 객체 반환해줌
public class DBTestCorn {

	public static void main(String[] args) {
		// db 연결 test
		Connection con = null;
		
		//외부 자원 활용 :try ~catch 구문 안에서 진행되거나 throws
		try {
			//dbms 연결 관련 코드
			// JDBC DRIVER 클래스의 객체 생성 :런타임 시 JDBC드라이버 로드(자동 로드 :생략 가능)
			//Class forName("oracle.jdbc.driver.OracleDriver");
			//접속 변수 생성
			//"oracle 접속 종류:@dbms주소(도메인,ip):포트:sid 또는  포트/서비스name
			String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
			String user ="sql_select" ;
			String pwd = "1234";
			//2Connection interface 참조변수에 구현객체 대입(db 접속 후 접속 객체 반환) ->DriverMager
			con = DriverManager.getConnection(url,user,pwd);
			//db 접속 실패하면 catch, 저장값은 null
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		if(con !=null) {
			System.out.println("DB연결 성공");
		}else {
			System.out.println("DB연결 실패");
		}
		
		
	}
}

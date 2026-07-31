package codition;
import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		
		int score=85;
		//if 문(조건이 참인경우 실행문장만 확인함)
		if(score>=90)
			System.out.println("등급이 A입니다");//if영역 중괄호가 없어서 밑에는 영역에 안들어감
		    System.out.println("언제 실행되는 문장인가요?");//if영역 아님 즉,참이든 거짓이든 걍 반환댐
		    
		    if(score>=80) {
				System.out.println("등급이 B입니다");//if영역 
			    System.out.println("언제 실행되는 문장인가요?");//if영역
		    }
		    
		//if~else 문(조건이 참인경우 거짓인 경우 각각 실행문장을 확인)
		    if(score>=90)
		    	System.out.println("등급이 A 입니다");
		    else
		    	System.out.println("등급이 A가  아닙니다");
		    System.out.println("언제 실행되는 문장인가요?");//조건이 참일때만 실행되는 문장(x)
		    
		    if(score>=90) {
		    	System.out.println("등급이 A 입니다");
		    System.out.println("이 문장은 실행되나요?");
		    }
		    else
		    	System.out.println("등급이 A가  아닙니다");
		    System.out.println("언제 실행되는 문장인가요?");//조건이 참일때 실행? 조건이 거짓일 때 실행?
		
		    //다중if-else
		    Scanner sc =new Scanner(System.in);
		    char grade;
		    
		    System.out.println("점수 입력(0~100):");
		    score=sc.nextInt();
		    
		    if(score>=90)
		    	grade='A';
		    else if(score>=80)
		    	grade='B';
		    else if(score>=70)
		    	grade='C';
		    else if(score>=60)
		    	grade='D';
		    else 
		    	grade='F';
		    
		    System.out.println("성적:"+ grade);
		    
		    
		    //중첩 if : 특별한 기능은 아니고 코드 구조를 의미
		    score=sc.nextInt();
		    String grade1;
		    if(score>90) {
		    	if(score>=90)
		    		grade1="A+";
		    	else
		    		grade1="A";
		    }else {
		    	if(score>=85)
		    		grade1="B+";
		    	else
		    		grade1="B";
		    }
		    
		    sc.close();
		 
		    
		   
	}

}

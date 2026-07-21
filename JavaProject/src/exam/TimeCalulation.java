package exam;
import java.util.Scanner;
public class TimeCalulation {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int second,hours,minutes,sec,remain;
	
	
	   System.out.println("시간 입력 (초):");
	   second=sc.nextInt();
	   hours=second/3600;
	   remain = second % 3600;
	   
	   minutes = remain / 60;
	   sec=remain%60;
	   
	   System.out.println(second + "초는 "
               + hours + "시간 "
               + minutes + "분 "
               + sec + "초입니다.");

       sc.close();
	   
	   
	   
}
}

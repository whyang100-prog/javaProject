package loop;

public class For {
public static void main(String[] args) {
	//for(초기식;조건식;증감식){반복문장}
	int i;//main메소드 내 어디에서든 사용 가능
	for(i=1;i<10;i++) {
		System.out.println(i);
	}
	System.out.println("i 최종 값 : ");
	System.out.println(i);
	
	for(int j = 20; j<=30; j+=2) {
		System.out.println(j);
	}
	//System.out.println("j 최종 값 : ");
	//System.out.println(j);//for문 안에 int j는 for문 안에서만 작동 즉 j는 for문 내부의 지역변수
	
	//1~100까지 더한 값을 확인
	//누적값 구하기 sum은 누적변수
	int k,sum=0;
	for(k=1;k<=100;k++) {
		//sum=0이렇게 넣으면 작동안댐 왜냐하면 계속 0으로 해버리니까
		sum+=k;
	}
	System.out.println("1~"+(k-1)+"합:  "+sum);
	
}
}

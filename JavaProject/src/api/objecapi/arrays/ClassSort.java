package api.objecapi.arrays;

import java.util.Arrays;

public class ClassSort {

	public static void main(String[] args) {
		Member m1 =new Member("홍길동");
		Member m2 =new Member("김유현");
		Member m3 =new Member("신경빈");
		Member[] members = {m1,m2,m3};
		
		Member2 m12 =new Member2("홍길동");
		Member2 m22 =new Member2("김유현");
		Member2 m33 =new Member2("신경빈");
		Member2[] members2 = {m12,m22,m33};
		
		Arrays.sort(members);
		
		for(Member member : members) {
			System.out.println(member.name);
		}

		
		



	}

}

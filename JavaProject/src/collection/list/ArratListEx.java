package collection.list;

import java.util.ArrayList;

public class ArratListEx {

	public static void main(String[] args) {
		//제너릭 타입이 아닌 ArrayList
		ArrayList ar= new ArrayList();
		//list.add(객체)객체를 현재 list에서 비어있는 첫번째 원소에 저장
		ar.add(100);
		ar.add("홍길동");
		ar.add(6.777);
		ar.add("자바");
		
		//list.get(index) 해당 index 원소의 값을 반환
		//list.size() :list 원소 수 반환
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println();
		//list.add(inex,값)
		ar.add(0,"변경");
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}


	}

}

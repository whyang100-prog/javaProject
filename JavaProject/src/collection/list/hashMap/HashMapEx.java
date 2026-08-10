package collection.list.hashMap;

import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		//Map <key ,value>
		Map<String,Integer> map= new HashMap();
		
		//Map의 key는 중복될 수 없음 중복키가 put되면 해당 key의 value가 put된 value로 수정
		
		//객체 저장: put(key,value)
		map.put("김길동", map);

	}

}

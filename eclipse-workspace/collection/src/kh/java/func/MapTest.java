package kh.java.func;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapTest {
	public void mapTest1() {

		ArrayList<String> list = new ArrayList<>();
		list.add("hi");
		list.add("hello");
		list.add("bye");
		list.add("hi");
		System.out.println(list.get(1));

		//정수를 통해서 문자열을 관리하는 맵생성
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "hi");
		map.put(1,"hello");
		map.put(2,"bye");
		map.put(3,"hi");
		map.put(5,"hi");
		System.out.println(map);
	}
	
	public void mapTest2() {
		HashMap<String, String> map = new HashMap<String, String>();
		//put(key,value) : map에 데이터를 삽입하는 메소드
		map.put("one", "hi");
		System.out.println(map);
		map.put("two", "hello");
		map.put("three", "bye");
		System.out.println(map);
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));
		map.put("two", "집");
		System.out.println(map.get("two"));
		System.out.println(map);
		map.put("zero", "hi");
		System.out.println(map.get("four"));
		//containskey(param) : 매개변수로 받은 데이터가 key로 사용중이면 true, 아니면 false
		
		boolean bool1 = map.containsKey("one");
		boolean bool2 = map.containsKey("four");
		System.out.println(bool1);
		System.out.println(bool2);
		
		//remove(key) : 키값에 해당하는 데이터를 삭제
		
		map.remove("one");
		System.out.println(map);
		// map에 있는 모든 데이터를 꺼내오고 싶은 경우
		//keySet() : 모든 키값은 Set형태로 반환
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(map.get(key));
		}
	}

}

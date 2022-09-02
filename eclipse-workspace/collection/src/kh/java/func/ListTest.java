package kh.java.func;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

import javax.swing.plaf.multi.MultiListUI;

public class ListTest {
	public void listTest1() {
		// 길이가 3인 문자열 배열선언

		String arr[] = new String[3];
		arr[0] = "hi";
		arr[1] = "hello";
		arr[2] = "bye";

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ". " + arr[i]);
		}
		System.out.println("----------------------------------");
		//ArrayList로 처리
		//ArrayList는 객체 생성시 배열로 관리할 자료형은 제네릭으로 지정
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("리스트 길이 : " + list.size());
		list.add("hi"); // 리스트 가장 뒤에 데이터 추가
		System.out.println("리스트 길이 : " + list.size());
		list.add("hello");
		System.out.println("리스트 길이 : " + list.size());
		list.add("bye");
		System.out.println("리스트 길이 : " + list.size());
		list.add("good");
		System.out.println("리스트 길이 : " + list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ". " + list.get(i));
		}
	}

	public void listTest2() {
		Scanner sc = new Scanner(System.in);
		// 정수를 저장하는 리스트 생성
		ArrayList<Integer> list = new ArrayList<>();
		while (true) {
			System.out.print("리스트에 추가할 숫자 입력 : ");
			int num = sc.nextInt();
			list.add(num); // 입력받은 수를 리스트에 추가
			System.out.print("한번 더 입력 하시겠습니까?[y/n] : ");
			String sel = sc.next();
			if (sel.toLowerCase().equals("n")) {
				break;
			}
		}
		for (int i = 0; i > list.size(); i++) {
			int num = list.get(i);
			System.out.println(num);
		}
		//foreach
		for (int num : list) {
			System.out.println(num);
		}
	}

	public void listTest3() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(100);
		list.add(55);
		list.add(80);
		System.out.println(list);
		// get(index) : 해당 인덱스에 위치한 객체를 가져오는 메소드
		System.out.println(list.get(2));

		// add(param1) : 매개변수로 전달된 값을 리스트 가장 뒤에 추가
		list.add(15);
		System.out.println(list);
		// add(param1,param2) : 첫번째 매개변수 위치에, 두번째 매개변수 위치에 값추가
		list.add(3, 200);
		System.out.println(list);

		//set(param1, param2);
		list.set(1, 15);
		System.out.println(list);

		//remove
		list.remove(2);
		System.out.println(list);

		//contains(param1) : 매개변수로 전달한 값이 리스트에 존재하는지 확인하여 결과 리턴
		System.out.println(list.contains(15));
		System.out.println(list.contains(546));

		//clear(); 모든 index 삭제
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
	
	}
}
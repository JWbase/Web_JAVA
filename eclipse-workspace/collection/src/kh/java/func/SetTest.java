package kh.java.func;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest {

	public void setTet() {
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println("set의 길이 : " + set.size());
		set.add(10);
		System.out.println("set의 길이 : " + set.size());
		System.out.println(set);
		set.add(20); // 데이터 추가를 시도하고 그 결과 리턴
		System.out.println(set);
		set.add(30);
		System.out.println(set);
		set.add(20);
		System.out.println(set);
		boolean bool1 = set.add(20);
		System.out.println(bool1);
		boolean bool2 = set.add(40);
		System.out.println(bool2);
		//		set.remove(40); // 매개변수로 바은 데이터와 일치하는 value값을 받아 삭제
		System.out.println(set);

		// set은 index로 관리하지 않기 때문에 꺼내는 방법이 필요

		// 1. foreach
		for (Integer num : set) {
			System.out.println(num);
		}

		// 2. ArrayList를 이용한 방법
		//Set에 저장된 데이터와 동일한 타입을 저장 할 수 있는 ArrayList를 생성
		ArrayList<Integer> list = new ArrayList<>(set);
		System.out.println(list);

		//3. 반복자(iterator)를 이용한 방법

		Iterator<Integer> iter = set.iterator();

		//hasNext() : 꺼내올값 남아 있으면 True // False 리턴
		//next() : 값 한개를 꺼내옴

		while (iter.hasNext()) {
			Integer num = iter.next();
			System.out.println(num);
		}
	}

	public void lotto() {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> userNum = new HashSet<Integer>();

		while (userNum.size() < 6) {
			System.out.print("사용자 번호 입력[1~45] : ");
			int num = sc.nextInt();
			if (num > 0 && num < 46) {
				boolean bool = userNum.add(num);
				if (!bool) {
					System.out.println("중복된 숫자입니다.");
				}
			} else {
				System.out.println("1 ~ 45 사이 숫자를 입력하세요.");
			}
		}
		ArrayList<Integer> userList = new ArrayList<Integer>(userNum);
		Collections.sort(userList);
		System.out.println(userList);
	}

}

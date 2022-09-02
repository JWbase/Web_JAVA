package kh.java.func;

import java.util.Random;
import java.util.StringTokenizer;

public class StringClass {
	public void test1() {
		//문자열 변경을 위한 StringBuffer사용
		// import 안하는 조건
		// 1) 같은 패키지 내 클래스
		// 2) java.lang패키지 소속의 클래스인 경우
		StringBuffer sb = new StringBuffer();
		System.out.println("문자열 길이 : " + sb.length());
		sb.append("hi"); // 현재 저장된 문자열에 매개변수로 전달한 문자를 추가
		System.out.println(sb.toString());
		sb.append(" 안녕");
		System.out.println(sb.toString());
		sb.append(" test");
		System.out.println(sb.toString());
		sb.insert(3, "삽입구문");
		// 첫번째 매개변수 위치에, 두번째 매개변수 값을 삽입
		System.out.println(sb.toString());
		sb.insert(7, " 여기 ");
		System.out.println(sb.toString());
		//문자열 중 0번째 부터 2번째 앞까지를 수정구문으로 대체
		sb.replace(0, 2, "수정구문");
		System.out.println(sb.toString());
		sb.delete(5, 8);
		System.out.println(sb.toString());
		sb.reverse();
		System.out.println(sb.toString());

		Random r = new Random();
		StringBuffer joinCode = new StringBuffer();
		for (int i = 0; i < 6; i++) {
			int num = r.nextInt(10); // 0 ~ 9 중 랜덤수
			joinCode.append(num);
		}
		System.out.println("회원가입 코드 [" + joinCode.toString() + "]");
	}

	public void test2() {
		String str = "이정우/서울/안타까움/광명/하이루";
		String[] arr = str.split("/");
		System.out.println("배열길이 : " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		String str1 = "AbcdEfg";
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
	}
	
	public void test3() {
		String str = "이정우/서울/안타까움/광명";
		StringTokenizer sT = new StringTokenizer(str, "/");
		
		while(sT.hasMoreTokens()) {
			String str1 = sT.nextToken();
			System.out.println(str1);
		}
//		System.out.println("지금 토큰이 남아 있는지 체크 : " + sT.hasMoreTokens());
//		System.out.println("남아있는 토큰 수 : " + sT.countTokens());
//		String str1 = sT.nextToken(); // 토큰 중 가장 앞 토큰을 꺼내온다.
//		System.out.println(str1);
//		System.out.println("지금 토큰이 남아 있는지 체크 : " + sT.hasMoreTokens());
//		System.out.println("남아있는 토큰 수 : " + sT.countTokens());
//		String str2 = sT.nextToken();
//		System.out.println(str2);
//		System.out.println("지금 토큰이 남아 있는지 체크 : " + sT.hasMoreTokens());
//		System.out.println("남아있는 토큰 수 : " + sT.countTokens());
//		String str3 = sT.nextToken();
//		String str4 = sT.nextToken();
//		System.out.println(str3);
//		System.out.println(str4);
//		System.out.println("지금 토큰이 남아 있는지 체크 : " + sT.hasMoreTokens());
//		System.out.println("남아있는 토큰 수 : " + sT.countTokens());
	}
}
package kh.java.func;

public class Func {

	public void print1() {
		// 정수 1 출력
		System.out.println(1);
		// 실수 1 출력
		System.out.println(1.0);
		// 문자 1 출력
		System.out.println('1');
		// 문자열 1 출력
		System.out.println("1");
	} // print method 종료 괄호

	public void print2() {

		System.out.println(1 + 1); // 2
		System.out.println(1.0 + 1.0); // 2.0
		System.out.println('1' + '1'); // '1'에 해당하는 숫자인 49+49로 연산되어 결과는 98
		System.out.println("1" + "1"); // 11

		System.out.println(1 - 1); // 0
		System.out.println(1.0 - 1.0); // 0
		System.out.println('1' - '1'); // 0
		System.out.println("1" - "1"); // 문자열은 숫자연산이 아니므로 +이외의 연산이 불가능
	}

	public void print3() {

		System.out.println(1 + 1.1); // 1.0 + 1.1 = 2.1
		System.out.println(1 + '1'); // 1 + 49 = 50
		System.out.println(1.1 + '1'); // 1.1 + 49.0 = 50.1
	}

	public void print4() {
		// 문자열은 다른자료형과도 + 연산만 가능
		// 문자열은 우선순위가 높아서 다른자료형이 모두 문자열로 변경
		System.out.println(1 + "1"); // "1" + "1" = "11"
		System.out.println(1.0 + "1"); // "1.0" + "1" = "1.01"
		System.out.println('1' + "1"); // "1" + "1" = "11"
	}

	public void print5() {
		System.out.println("Hello" + 10); // Hello10
		System.out.println(10 + "Hello"); // 10Hello
		System.out.println(10 + 20 + "Hello"); // 30Hello
		System.out.println(10 + (20 + "Hello")); // 1020Hello
	}
} // Func class 종료 광호

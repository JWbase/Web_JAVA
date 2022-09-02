package kh.java.func;

import java.util.Scanner;

public class MethodTest {

	public void test6() {
		int num = 100;
		System.out.println("num : " + num);
		test7(num); // 매개변수로 기본형 데이터를 전송 시 값을 복사 한 후 전달
		System.out.println("num : " + num);
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr1 = arr;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// 참조형데이터를 매개변수로 전달하면 주소값이 전달 -> 얉은 복사
		test8(arr);
		System.out.println(arr[2]);
		test9(arr[2]);
		System.out.println(arr[2]);
	}

	public void test7(int num) {
		num += 100;
		System.out.println("test7 : " + num);
	}

	public void test8(int[] arr) {
		arr[2] = 100;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void test9(int num) {
		num += 300;
	}

	public void test5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		// 입력받은 두 수의 합을 출력
		// 입력받은 두 수를 합쳐주는 메소드를 호출하고 결과를 받음
		int sum = add(num1, num2);
		System.out.println("입력받은 두 수의 합은 : " + sum);
		// 입력받은 두 수의 나누기 결과를 받아오는 메소드 생성
		// 나누기결과는 실수타입으로 메소드이름 : div

		System.out.print("첫번째 정수 입력 : ");
		int num3 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num4 = sc.nextInt();

		double div = div(num3, num4);
		System.out.println("입력받은 두 수의 합은 : " + div);

		div2(num1, num2);
	}

	public void div2(int num1, int num2) {
		double result = (double) num1 / num2;
		System.out.println(result);
	}

	public double div(double num1, double num2) {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		double result = num1 / num2;
		return result;
	}

	public int add(int su1, int su2) {
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		int sum = su1 + su2;
		return sum;

	}

	public void test1() {

		System.out.println("test1메소드 입니다.");
		test2(); // 같은 클래스내에서 다른메소드 실행 할 수 있음.
		int num = test4();
		System.out.println(num);

		// camel표기법에 ();로 끝나면 method, ()가 없으면 variable
		// 패키지가 같으면 import 할 필요 없다.
	}

	public void test2() {
		System.out.println("test2메소드 입니다.");
		return;
		// System.out.println("return 다음은 code를 쓸 수 없어요");
	}

	public int test4() {
		return 100;
	}
}
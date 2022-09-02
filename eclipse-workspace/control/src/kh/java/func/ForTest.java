package kh.java.func;

import java.util.Scanner;

public class ForTest {

	public void test1() {
		// "안녕하세요" 3회 반복출력
		for (int i = 0; i < 3; i++) {
			System.out.println("안녕하세요");
		}
	}

	public void test2() {

		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 출력하시겠습니까?");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("안녕하세요");
		}
	}

	public void test4() {
		System.out.println("2단 입니다.");
		for (int i = 0; i < 9; i++) {
			System.out.println("2 * " + (i + 1) + " = " + 2 * (i + 1));
			System.out.printf("%d * %d = %d\n" ,2, i+1, 2*(i+1));
		}
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단을 출력하시겠습니까?");
		int num = sc.nextInt();
		System.out.println(num + "단 입니다.");

		for (int i = 0; i < 9; i++) {
			System.out.println(num + " * " + (i + 1) + " = " + num * (i + 1));
			System.out.printf("%d * %d = %d\n", num, i+1, num * (i+1));
		}
	}

	public void test6() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("정수 값을 입력하시오 : ");
			//int num = sc.nextInt();
			sum += sc.nextInt();
		}
		System.out.println("입력한 5개의 정수의 합 : " + sum);
	}

	public void test7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();

		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		System.out.println(num1 + " ~ " + num2 + "의 정수의 합 : " + sum);
	}

	public void test8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("짝수들의 합은 : " + sum);
	}
	
	public void test9() {
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j <3; j++) {
				System.out.println("i:" + i + " j:" + j);
			}
		}
	}
	
	public void test10() {
		for (int i=2; i<=9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%d\t", i,j,i*j);
			}
			System.out.println();
		}
	}
	
	public void test11() {
		for (int i = 1; i<=9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d*%d=%d\t", j, i, j*i);
			}
			System.out.println();
		}
	}
}

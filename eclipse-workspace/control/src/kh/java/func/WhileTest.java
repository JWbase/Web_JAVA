package kh.java.func;

import java.util.Scanner;

public class WhileTest {

	public void test1() {
		// for(초기값;조건식;증감문)
		// for(int i=0;i<5;i++)
		// 초기값설정
		int i = 0;
		while (i < 5) {
			System.out.println("안녕하세요");
			// 증감문
			i++;
		}
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("몇번 출력하시겠습니까?");
		int num = sc.nextInt();
		int i = 0;
		while (i < num) {
			i++;
			System.out.println("안녕하세요");
		}
	}

	public void test3() {
		System.out.println("2단 입니다.");
		int i = 0;
		while (i < 9) {
			i++;
			System.out.printf("2 * %d = %d\n", i + 1, 2 * (i + 1));
		}
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단을 출력하시겠습니까?");
		int dan = sc.nextInt();
		System.out.println(dan + "단 입니다.");
		int i = 0;
		while (i < 9) {
			i++;
			System.out.printf("%d * %d = %d\n", dan, i + 1, dan * (i + 1));
		}
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		while (i < 6) {
			System.out.print("정수 값을 입력하시오 : ");
			i = sc.nextInt();
			i++;
			sum += i;
		}
		System.out.println("입력한 5개의 정수의 합 : " + sum);
	}

	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		int i = num1;
		int sum = 0;
		while (i <= num2) {
			i++;
			sum += i;
		}
		System.out.printf("%d ~ %d의 정수의 합 : %d", num1, num2, sum);
	}

	public void test7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int i = 0;
		int sum = 0;

		while (i <= num) {
			i++;
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("짝수들의 합은 : " + sum);
	}

	public void test8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		/*
		 * while (num == 10) { System.out.println("10을 입력하셨네요"); num++; }
		 */

		do {
			System.out.println("10을 입력하셨네요");
			num++;
		} while (num == 10);
	}

	public void test9() {

		// for 무한루프
//		for(;;) {
//			System.out.println("안녕하세요");
//		}

		while (true) {
			System.out.println("안녕하세");
		}
	}

	public void test10() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("안녕하세요");
			System.out.println("한번 더 출력 할까요(1. yes / 2. no) ? ");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("OK !");
			} else if (select == 2) {
				break;
			}
			System.out.println("반복문 마지막부분");
		}
		System.out.println("반복문종료 시 실행되는 코드");
	}

	public void test11() {

		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println("i : " + i);
			System.out.println("1/ 2/ 3 중 하나를 선택하세요 : ");
			int select = sc.nextInt();
			if(select == 1) {
				break;
			} else if(select == 2) {
				continue;
			} else {
				System.out.println("그 외 나머지");
			}
			System.out.println("반복분 마지막 부분");
		}
		System.out.println("반복문 끝나면 출력되는 문구");
	}
}
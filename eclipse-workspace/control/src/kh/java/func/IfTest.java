package kh.java.func;

import java.util.Scanner;

public class IfTest {

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 10을 입력해보세요 : ");
		int num = sc.nextInt();
		if (num == 10) {
			System.out.println("잘했어요!");
		}
		// 입력값이 10이 아니면 "10 입력하라니깐요?" 출력
		if (num != 10) {
			System.out.println("10 입력하라니깐요?");
		}
		System.out.println("끝!!!!!!");
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		// 입력받은 정수가 홀수면 "홀수입니다."
		// 입력받은 정수가 짝우면 "짝수입니다."
		// 홀수/짝수 구분방법
		// -> 숫자를 2로 나눴을때 나머지 값이 0 or 1
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		if (num % 2 != 0) {
			System.out.println("홀수입니다.");
		}
	}

	public void test3() {

		Scanner sc = new Scanner(System.in);
		System.out.println("======== 숫자 구별 프로그램 ========");
		System.out.print("임의의 정수를 입력 하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.printf("당신이 입력한 수 %d은(는) 양수입니다.", num);
		}
		if (num == 0) {
			System.out.printf("당신이 입력한 수 %d은 0입니다.", num);
		}
		if (num < 0) {
			System.out.printf("당신이 입력한 수 %d은(는) 음수입니다.", num);
		}
	}

	public void test4() {

		Scanner sc = new Scanner(System.in);
		System.out.println("======== 두수 비교 프로그램 ========");
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();

		if (num1 < num2) {
			System.out.println(num1 + "<" + num2);
			System.out.println("두번째 수가 더 큽니다.");
		}
		if (num1 == num2) {
			System.out.println(num1 + "=" + num2);
			System.out.println("두 수가 같습니다.");
		}
		if (num1 > num2) {
			System.out.println(num1 + ">" + num2);
			System.out.println("첫번째 수가 더 큽니다.");
		}
	}

	public void test5() {

		Scanner sc = new Scanner(System.in);
		System.out.println("======== 계산기 프로그램 ========");
		System.out.print("연산자를 입력하세요( +, -, *, / )");
//		char oper = sc.next().charAt(0);
		String oper = sc.next();
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();

		if (oper.equals("+")) {
			int sum = num1 + num2;
			System.out.printf("%d+%d=%d", num1, num2, sum);
		}
		if (oper.equals("-")) {
			int sub = num1 - num2;
			System.out.printf("%d-%d=%d", num1, num2, sub);
		}
		if (oper.equals("*")) {
			int multi = num1 * num2;
			System.out.printf("%d*%d=%d", num1, num2, multi);
		}
		if (oper.equals("/")) {
			double div = (double) num1 / num2;
			System.out.printf("%d/%d=%f", num1, num2, div);
		}
	}

	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int result = num % 2;
		if (result == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

	public void test7() {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		String str;
		if (num % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		System.out.println(str);
	}

	public void test8() {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if (num > 1000) {
			System.out.println("1000보다 큰 수 입니다.");
		} else if (num > 100) {
			System.out.println("100보다 큰 수 입니다.");
		} else if (num > 10) {
			System.out.println("10보다 큰 수 입니다.");
		}
	}

	public void test9() {

		Scanner sc = new Scanner(System.in);
		System.out.println("======== 놀이공원 프로그램 ========");
		System.out.print("입장하실 총 인원은 몇명입니까? : ");
		int num1 = sc.nextInt();
		System.out.print("어른은 몇명입니까?(1인당 150000원) : ");
		int num2 = sc.nextInt();
		System.out.print("아이는 몇명입니까?(1인당 5000원) : ");
		int num3 = sc.nextInt();
		if (num1 == num2 + num3) {
			System.out.println("지불하실 총 금액은 " + (num2 * 15000 + num3 * 5000) + "원 입니다.");
		} else {
			System.out.println("인원수가 맞지 않습니다.");
		}
	}

	public void test10() {

		Scanner sc = new Scanner(System.in);
		System.out.println("======== 퀴즈 프로그램 ========");
		System.out.println("첫번째 퀴즈");
		System.out.print("사과는 영어로 무엇일까요 (1. apple, 2.스티브 잡스)? : ");
		int num1 = sc.nextInt();
		int correct = 0;
		if (num1 == 1) {
			System.out.println("정답!!!");
			correct++;
		} else {
			System.out.println("땡!!");
		}

		System.out.println("두번째 퀴즈");
		System.out.print("바나나는 길어 길으면 기차 기차는 (1. 비싸, 2.빨라)? : ");
		int num2 = sc.nextInt();
		if (num2 == 2) {
			System.out.println("정답!!!");
			correct++;
		} else {
			System.out.println("땡!!");
		}
		System.out.println("총 " + correct + "문제를 맞췄습니다.");
	}

	public void test11() {

		Scanner sc = new Scanner(System.in);
		System.out.println("======== 심리테스트 ========");
		System.out.print("당신은 술을 좋아합니까(1. yes, 2. no)? : ");
		int num1 = sc.nextInt();
		if (num1 == 1) {
			System.out.print("당신은 담배를 피웁니까(1. yes, 2. no)? : ");
			int num2 = sc.nextInt();
			if (num2 == 1) {
				System.out.println("담배는 건강에 좋지 않습니다.");
			} else {
				System.out.println("술은 간에 좋지 않습니다.");
			}
		} else {
			System.out.print("당신은 이성친구가 있습니까(1. yes, 2. no)? : ");
			int num3 = sc.nextInt();
			if (num3 == 1) {
				System.out.println("올..ㅋ");
			} else {
				System.out.println("힘내요 ㅠㅠ");
			}
		}
	}

	public void test12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======== 대/소문자 변환 프로그램");
		System.out.print("문자입력 : ");
		
		char ch = sc.next().charAt(0);
		
		System.out.println("===== 결과 =====");
		if ('A' <= ch && ch <= 'Z') {
			System.out.println("대문자를 입력 하였습니다.");
			System.out.println("소문자로 변환 : " + (char) (ch^32)); //XOR연산으로 이용하면 대소문자 변경가능
		} else if ('a' <= ch && ch <= 'z') {
			System.out.println("소문자를 입력 하였습니다.");
			System.out.println("대문자로 변환 : " + (char) (ch^32));
		} else {
			System.out.println("잘못입력하셨습니다. 영문자를 입력해주세요.");
		}
	}

	public void test13() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		System.out.println("===== 결 과 =====");
			//만약 내부 실행코드가 1000line이면 공통부분 묶는다.
		if (num == 0 || (num %3!=0 && num %4!=0)) {
			System.out.println("[" + num + "] 은(는) 3의 배수도 4의 배수도 아닙니다.");
		} else if(num %3 == 0 && num %4 == 0) {
			System.out.println("[" + num + "] 은(는) 3의 배수이면서 4의 배수입니다.");
		} else if (num %3 == 0) {
			System.out.println("[" + num + "] 은(는) 3의 배수입니다.");
		} else if (num %4 == 0) {
			System.out.println("[" + num + "] 은(는) 4의 배수입니다.");
		}
	}
}
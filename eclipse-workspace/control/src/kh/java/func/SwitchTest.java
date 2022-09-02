package kh.java.func;

import java.util.Scanner;

public class SwitchTest {

	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 3 사이의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("1111111111");
			break;
		case 2 :
			System.out.println("2222222222");
			break;
		case 3 :
			System.out.println("3333333333");
			break;
		default :
			System.out.println("??????????");
			break;
		}
		/*
		if(num == 1) {
			System.out.println("1111111111");
		} else if(num == 2) {
			System.out.println("2222222222");
		} else if(num == 3) {
			System.out.println("3333333333");
		} else {
			System.out.println("??????????");
		}
		*/
	}
	
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str = sc.next();
		switch(str) {
		case "aa" :
			System.out.println("aaaaaaaaaa");
			break;
		case "bb" :
			System.out.println("bbbbbbbbbb");
			break;
		}
	}
	
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일수를 알고싶은 달을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println(month+"월달은 31일까지 있습니다.");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println(month+"월달은 30일까지 있습니다.");
			break;
		case 2 :
			System.out.println(month+"월달은 28일까지 있습니다.");
			break;
		default :
			System.out.println("잘못 입력 하셨습니다.");
			break;
		}
	}
	
	public void test4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("장학금 지불 시스템입니다");
		System.out.print("학점을 입력하세요(A,B,C,D,F) : ");
		char score = sc.next().charAt(0);
		
		switch(score) {
		case 'A' :
			System.out.println("수고하셨습니다. 장학금을 100% 지급해드리겠습니다.");
			break;
		case 'B' :
			System.out.println("아쉽군요. 장학금을 50% 지급해드리겠습니다.");
			break;
		case 'C' :
			System.out.println("장학금을 바라시면 좀더 열심히 해주세요.");
			break;
		case 'D' :
			System.out.println("크흠......");
			break;
		case 'F' :
			System.out.println("학사경고입니다!!!!");
			break;
		default :
			System.out.println("학점을 잘못 입력하셨습니다.");
			break;
		}
	}
	
	public void test5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 계산기 프로그램 =========");
		System.out.print("연산자를 입력하세요(+,-,*,/) : ");
		char ch = sc.next().charAt(0);
		System.out.print("첫번째 정수를 입력 하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력 하세요 : ");
		int num2 = sc.nextInt();
		
		switch(ch) {
		case '+' :
			System.out.println(num1 +"+" + num2 + "=" + num1 + num2);
			break;
		case '-' :
			System.out.println(num1 +"-" + num2 + "=" + num1 + num2);
			break;
		case '*' :
			System.out.println(num1 +"*" + num2 + "=" + num1 * num2);
			break;
		case '/' :
			System.out.println(num1 +"/" + num2 + "=" + (float) num1 / num2);
			break;
		default :
			System.out.println("연산자를 잘못 입력하셨습니다.");
			break;
		}
	}
}

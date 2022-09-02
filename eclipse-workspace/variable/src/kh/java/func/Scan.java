package kh.java.func;

import java.util.Scanner;

public class Scan {

	public void scan1() {

		// 키보드로 값을 입력 받는 방법
		// 1) import java.util.Scanner;

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열부터 입력해볼까요 : ");
		String str = sc.nextLine();
		System.out.println(str);

		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("입력한 두 수의 합은 : " + sum);
		System.out.print("실수를 입력하세요 : ");
		double dNum = sc.nextDouble();
		// 문자열 입력 받는 방법
		// 1. sc.next() 띄어쓰기를 처리 할 수 없음
		// 2. sc.nextLine() : 띄어쓰기를 포함한 문자열 입력

		System.out.println("첫번째 문자열을 입력하세요 : ");
		String str1 = sc.next();
		System.out.println(str1);
		System.out.print("두번째 문자열을 입력하세요 : ");
		sc.nextLine(); // 버퍼에 남아있는 엔터 제거하는 용도
		String str2 = sc.nextLine();
		System.out.println(str2);

		// 문자 입력받기

		System.out.print("문자를 입력하세요 : ");

		// 문자열로 입력받은 후 첫번째 글자를 문자형태로 추출
		char ch = sc.next().charAt(2);
		System.out.println(ch);
	}

	public void scanExam1() {
		Scanner sc = new Scanner(System.in);
		// 이름, 나이, 키, 몸무게, 성별, 주소

		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println(name);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println(age);
		sc.nextLine();
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		System.out.println(address);
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		System.out.println((int)height);
		System.out.print("몸무게를 입력하세요 : ");
		double weight = sc.nextDouble();
		System.out.printf(" %.1f\n ", weight);
		System.out.print("성별을 입력하세요 : ");
		char sex = sc.next().charAt(0);
		System.out.println(sex);
	}

	public void scanExam2() {

		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력 : ");
		int kors = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int mats = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int engs = sc.nextInt();
		int sum = kors + mats + engs;
		double avg = (double) sum / 3;
		System.out.printf("당신 성적의 총 합은 %d점이고 평균은 %.2f 입니다!", sum, avg);
	
	}
	
	public void scanExam3() {
		int a = 10;
		int b= 10;
		int c;
		c = (a++) + (++b) + a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}
}

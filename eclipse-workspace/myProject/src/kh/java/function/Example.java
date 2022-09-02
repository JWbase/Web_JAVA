package kh.java.function;

import java.util.Scanner;

public class Example {

	public void exam1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번 째 정수 입력 : ");
		int fir = sc.nextInt();

		System.out.print("두번 째 정수 입력 : ");
		int sec = sc.nextInt();

		System.out.println("========== 결과 ==========");

		int sum = fir + sec;
		int sub = fir - sec;
		int mul = fir * sec;
		int div1 = fir / sec;
		int div2 = fir % sec;

		System.out.println("더하기 결과 : " + (fir + sec));
		System.out.println("더하기 결과 : " + sum);
		System.out.println("빼기 결과 : " + (fir - sec));
		System.out.println("빼기 결과 : " + sub);
		System.out.println("곱하기 결과 : " + (fir * sec));
		System.out.println("곱하기 결과 : " + mul);
		System.out.println("나누기 몫 : " + (fir / sec));
		System.out.println("나누기 몫 : " + div1);
		System.out.println("나누기 나머지 : " + (fir * sec));
		System.out.println("나누기 나머지 : " + div2);
	}

	public void exam2() {

		Scanner sc = new Scanner(System.in);
		System.out.print("가로 길이 입력 : ");
		double wid = sc.nextDouble();

		System.out.print("세로 길이 입력 : ");
		double ver = sc.nextDouble();

		System.out.println("========== 결과 ==========");

		double area = wid * ver;
		double round = 2 * (wid + ver);

		System.out.printf("면적 : %.2f \n", area);
		System.out.printf("둘레 : %.1f", round);
	}
	
	public void exam3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어단어 입력 : ");
		String eng = sc.next();
		System.out.println("첫번째 문자 : " + eng.charAt(0));
		System.out.println("두번째 문자 : " + eng.charAt(1));
		System.out.println("세번째 문자 : " + eng.charAt(2));
	}
}

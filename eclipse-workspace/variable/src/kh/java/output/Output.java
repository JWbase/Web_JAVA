package kh.java.output;

public class Output {

	public static void main(String[] args) {

		int num1 = 100;

		long num2 = 999900000000L;

		float fNum = 486.520f;

		double dNum = 5697.890123;

		char ch = 'A';

		String str = "Hello JAVA";

		boolean bool = true;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(bool);

		String name = "이정우";
		int age = 31;
		String sex = "남";
		String address = "광명";
		String phonNumber = "01093430170";
		String e_Mail = "leejw306@naver.com";
		
		System.out.println("이름\t나이\t성별\t지역\t전화번호\t이메일\t");
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("%s\t%d\t%s\t%s\t%s\t%s\t\n",name, age ,sex ,address, phonNumber, e_Mail);
		System.out.println("-------------------------------------------------------------------");
		
		name = "조병현";
		age = 36;
		sex = "남";
		address = "서울";
		phonNumber = "01092756693";
		e_Mail = "chobhyun@naver.com";
		
		System.out.printf("%s\t%d\t%s\t%s\t%s\t%s\t\n",name, age ,sex ,address, phonNumber, e_Mail);
		
	}
		

}

package kh.java.func;

public class Variable {
	public void var1() {
		// 변수를 선언하는 방법 : 자료형 변수명;
		// 1. 논리형 변수를 선언
		boolean bool;

		// 2. 문자형 변수 선언
		char ch;

		// 3. 정수형 변수 선언(byte, short, int, long)
		int num;

		// 4. 실수형 변수 선언(float, double)
		double dNum;

		// 변수에 데이터를 저장하는 방법 -> 대입연산자 사용(=)
		// a = b; -> b라는 값을 a변수에 대입

		num = 10;
		System.out.println(num);

		// 문자형 변수에 A 대입 후 출력
		ch = 'A';
		System.out.println(ch);

		// 논리형 변수에 true 대입 후 출력
		bool = true;
		System.out.println(bool);

		// 실수형 변수에 3.14 대입 후 출력
		dNum = 3.14;
		System.out.println(dNum);

		System.out.println(num + dNum);

		long lNum; // int 4byte, long 8byte
		lNum = 1000L;
		System.out.println(lNum); // float 4byte, double 8byte

		float fNum;
		fNum = 3.14f;

	}

	public void var2() {
		double dNum1 = 3.14;
		System.out.println(dNum1);
		System.out.println(dNum1);
		System.out.println(dNum1);
		dNum1 = 10.265;
		System.out.println(dNum1);
		dNum1 = 100.222;
		System.out.println(dNum1);
		// 상수형 변수 선언(상수 표현을 위해 변수명은 모두 대문자)
		final double PI = 3.14;
		System.out.println(PI);
		// PI = 1.11; // 상수는 한번 선언한 변수의 값을 변경 X
	}

	public void var3() {
		String str1;
		str1 = "안녕하세요";
		System.out.println(str1);
		str1 = "안녕히가세요";
		System.out.println(str1);

	}

	public void var4() {
		int num = 2147483647;
		long result = (long) num + 1;
		System.out.println(result); // 2147483648
	}

	public void print() {
		// System.out.print("안녕하세요 ");
		// System.out.print("제이름은 ");
		// System.out.print("이정우 입니다.");
		// 변수3개 선언(이름 - String, 나이 - int, 주소 - String)

		String name = "이정우";
		int age = 31;
		String address = "광명";

		// 제 이름은 이정우고 나이는 31살 사는 곳은 광명입니다.
		// System.out.println();
		// System.out.print();

		System.out.println("제 이름은 " + name + "고 나이는 " + age + "살 사는 곳은 " + address + "입니다.");
		System.out.print("제 이름은 " + name);
		System.out.print("고 나이는 " + age);
		System.out.print("살 사는 곳은 " + address);
		System.out.println("입니다.");
		
		System.out.printf("제 이름은 %s고 나이는 %d살 사는 곳은 %s입니다.", name, age, address);
		
		System.out.println();
		System.out.printf("%.2f", 3.14274972515);
		System.out.println();
		
		// 제 이름은 "이정우" 입니다.
		
		System.out.println("안녕\t하세요.");
		System.out.println("안녕\n하세요.");
		System.out.println("중간에 엔터를 넣고 싶으면 \\n 사용하세요.");
	}
}

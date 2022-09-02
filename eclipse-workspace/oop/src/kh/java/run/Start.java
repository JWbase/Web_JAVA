package kh.java.run;

import kh.java.func.MethodTest;
import kh.java.func.Rabbit;
import kh.java.func.TV2;
import kh.java.func.TestClass;
import kh.java.func.TestClass1;
import kh.java.func.TV;

import java.util.Scanner;

import kh.java.func.Animal;
import kh.java.func.Bclass;
import kh.java.func.Cafe;
import kh.java.func.Dog;
import kh.java.func.Ticketting;


public class Start {

	public static void main(String[] args) {
		
		TestClass1 tc = new TestClass1();
		TestClass tc2 = new TestClass1();
		tc2.testFunction2();
		
//		Dog dog1 = new Dog();
//		dog1.breath(); // animal에서 만든 메소드
//		dog1.hunting(); // Dog에서 만든 메소드
//		
//		Dog dog = new Dog();
//		Animal dog2 = (Animal)dog; // UpCasting
//		dog2.breath();
//		((Dog)dog2).hunting(); // DownCasting
//		
//		Rabbit rabbit1 = new Rabbit();
//		Animal rabbit2 = (Animal) rabbit1;
//		rabbit2.breath();
//		((Rabbit)rabbit2).jump();
//		
//		Rabbit rabbit4 = (Rabbit)dog2;
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("문자열입력 : ");
		String str = sc.next().toLowerCase().charAt(0);
		if(str.equals("a"))
		*/
		
		// 객체 생성하는 방법
		// 1) 패키지 다른경우 import
		// 2) new 클래스명(); -> 클래스형태대로 메모리에 데이터 생성 후 주소 리턴
		// -> 주소를 TV형태의 변수에 저장
		
//		TV tv1 = new TV();
//		TV2 tv2 = new TV2();
//		TV2 tv3 = new TV2(300);
//		
//		Ticketting t = new Ticketting();
//		t.start();
//		
//		System.out.println(tv1.power);
//		System.out.println(tv2.isPower());
//		tv1.power = true;
//		tv2.setPower(true);
//		tv1.ch = 100;
//		tv2.setCh(100);
//		System.out.println(tv1.ch);
//		System.out.println(tv2.getCh());
//		tv1.size = 100;
//		System.out.println(tv1.size);
//		System.out.println(tv2.getSize());
	}
}
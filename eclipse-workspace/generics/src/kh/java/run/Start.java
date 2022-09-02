package kh.java.run;

import kh.java.func.Animal;
import kh.java.func.AnimalMgr1;
import kh.java.func.AnimalMgr2;
import kh.java.func.Cat;
import kh.java.func.GenericeEx;
import kh.java.func.Dog;

public class Start {

	public static void main(String[] args) {
		Cat c1 = new Cat(200);
		Dog d1 = new Dog(300);
		
		AnimalMgr2<Cat> am1 = new AnimalMgr2<Cat>(c1);
		AnimalMgr2<Dog> am2 = new AnimalMgr2<Dog>(d1);
		
		Cat c1 = am1.getDate();
		Dog d1 = am2.getDate();
		System.out.println("a1 HP : " + c1.getHp());
		System.out.println("a2 HP : " + d1.getHp());
		c1.catFuntion();
		d1.dogFunction();
		/*
		//AnimalMgr1 객체 생성
		AnimalMgr1 am1 = new AnimalMgr1(c1);
		AnimalMgr1 am2 = new AnimalMgr1(d1);
		Animal a1 = am1.getData(); // c1
		Animal a2 = am2.getData(); // d1

		System.out.println("a1 HP : " + a1.getHp());
		System.out.println("a2 HP : " + a2.getHp());

		((Cat) a1).catFuntion();
		((Dog) a2).dogFunction();

		 */
	}
}

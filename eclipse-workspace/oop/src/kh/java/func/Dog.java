package kh.java.func;

public class Dog extends Animal {

	public void hunting() {
		System.out.println("사냥!");
	}
	
	@Override
	public void breath() {
		System.out.println("낑낑");
	}
}
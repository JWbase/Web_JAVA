package kh.java.func;

public class Bclass extends Aclass {
	int num1;

	public void test() {
	}

	public Bclass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bclass(int num, String str) {
		super(num, str);
		// TODO Auto-generated constructor stub
	}

	public Bclass(int num1) {
		super();
		this.num1 = num1;
	}

	public Bclass(int num, String str, int num1) {
		super(num, str);
		System.out.println("B생성자");
		this.num1 = num1;
	}

	@Override
	public void overTest() {
		System.out.println("B클래스 메소드");
	}
}
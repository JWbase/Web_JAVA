package kh.java.func;

public class Aclass {
	private int num;
	private String str;
	
	public Aclass() {
		super();
		System.out.println("A기본생성자");
	}
	
	public Aclass(int num, String str) {
		super();
		System.out.println("A매개변수생성자");
		this.num = num;
		this.str = str;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getStr() {
		return str;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public void overTest() {
		System.out.println("A클래스 메소드");
	}
}
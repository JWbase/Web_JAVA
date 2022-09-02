package kh.java.func;

public class TV2 {
	
	//TV2 클래스의 전역변수에 외부 직접접근을 막기 위해 private 접근제어지시자 사용 -> 정보은닉
	private int size;
	private boolean power;
	private int ch;
	private int vol;
	
	// 생성자
	// 생성자를 만들지 않으면 JVM이 자동으로 생성자를 생성
	public TV2() {
		this.size = 100;
	}
	// 생성자도 오버로딩 가능
	public TV2(int size) {
		this.size = size;
	}
	
	
	// 정보은닉을하게되면 외부에서 변수를 사용할 수 없음
	// 변수의 데이터를 대입하고, 값을 가져올 수 있는 메소드를 생성
	// -> getter, setter
	
	// getter변수의 데이터를 보여주는 목적
	public int getSize() {
		return size;
	} // getter 만드는 방식
	
	public int getCh() {
		return ch;
	}
	
	public int getVol() {
		return vol;
	}
	
	public boolean isPower() {
		return power;
	} // boolean형은 메소드 이름 앞에 is를 붙여야한다.
	
	// setter : 메소드를 통해서 전역변수에 값을 대입
	
	public void setCh(int ch) {
		this.ch = ch;
	}
	
	public void setVo(int vol) {
		this.vol = vol;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
}
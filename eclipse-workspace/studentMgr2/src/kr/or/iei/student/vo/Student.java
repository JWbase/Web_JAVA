package kr.or.iei.student.vo;

public class Student {
	private String name;
	private int age;
	private String addr;

	// 데이터가 되는 클래스 (VO)
	// 기본생성자, 모든변수값을 저장 할 수 있는 매개변수 생성자
	// getter, setter

	// 기본생성자
	public Student() {

	}

	// 매개변수가 있는 생성자
	public Student(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	} // Student(매개변수) 생성자 종료

	// getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddr() {
		return addr;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
} // CLass Student 종료
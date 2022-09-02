package kr.or.iei.point.vo;

public class Point {

	// 매개변수 선언

	private String name;
	private String grade;
	private int point;

	// 기본 생성자
	public Point() {

	}

	// 매개변수 생성자

	public Point(String grade, String name, int point) {
		this.grade = grade;
		this.name = name;
		this.point = point;
	}

	// getter 생성

	public String getGrade() {
		return grade;
	}

	public String getName() {
		return name;
	}

	public int getPoint() {
		return point;
	}

	// setter 생성

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setPoint(int point) {
		this.point = point;
	}
} // Point class end

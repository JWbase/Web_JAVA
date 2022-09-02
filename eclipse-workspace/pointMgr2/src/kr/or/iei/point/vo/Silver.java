package kr.or.iei.point.vo;

public class Silver {

	private String grade;
	private String name;
	private int point;

	public Silver() {

	}

	public Silver(String grade, String name, int point) {
		this.grade = grade;
		this.name = name;
		this.point = point;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// 출력을 위해 getBouns를 두고 값을 바꾼다.
	public double getBonus() {
		return point * 0.02;
	}
}
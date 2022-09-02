package kr.or.iei.point.vo;

public class Gold extends Grade {

	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return 0.05 * getPoint();
	}

	public Gold() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gold(String grade, String name, int point) {
		super(grade, name, point);
		// TODO Auto-generated constructor stub
	}

}

package kr.or.iei.point.vo;

public class Silver extends Grade {

	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return 0.02 * getPoint();
	}

	public Silver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Silver(String grade, String name, int point) {
		super(grade, name, point);
		// TODO Auto-generated constructor stub
	}

}

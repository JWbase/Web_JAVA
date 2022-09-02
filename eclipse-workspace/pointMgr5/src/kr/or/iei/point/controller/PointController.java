package kr.or.iei.point.controller;

import kr.or.iei.point.view.PointView;
import kr.or.iei.point.vo.Gold;
import kr.or.iei.point.vo.Grade;
import kr.or.iei.point.vo.Silver;
import kr.or.iei.point.vo.Vip;
import kr.or.iei.point.vo.Vvip;

public class PointController {

	private Grade[] members;
	private int index;
	private PointView view;

	public PointController() {
		super();
		members = new Grade[40];
		view = new PointView();
	}

	public void main() {
		while (true) {
			int sel = view.showMenu();

			switch (sel) {
			case 1:
				insertMember();
				break;
			case 2:
				printAllMember();
				break;
			case 3:
				printOneMember();
				break;
			case 4:
				updateMember();
				break;
			case 5:
				deleteMember();
				break;
			case 0:
				return;
			default:
				break;
			}
		}
	} // main() end

	public void insertMember() {
		Grade g = view.insertMember();
		switch (g.getGrade()) {
		case "silver":
			members[index++] = g;
			break;
		case "gold":
			members[index++] = new Gold(g.getGrade(), g.getName(), g.getPoint());
			break;
		case "vip":
			members[index++] = new Vip(g.getGrade(), g.getName(), g.getPoint());
			break;
		case "vvip":
			members[index++] = new Vvip(g.getGrade(), g.getName(), g.getPoint());
		}
		view.successInsertMember();
	} // insertMember() end

	public void printAllMember() {
		view.printAllMember(members, index);
	} // printAllMember() end

	public void printOneMember() {

		int result = searchMember(view.insertPrintOneMember());

		if (result == -1) {
			view.noSearchMember();
		} else {
			Grade g = members[result];
			view.printOneMember(g);
		}
	} // printOneMember()

	public void updateMember() {

		int result = searchMember(view.searchUpdateMember());

		if (result == -1) {
			view.noSearchMember();
		} else {
			Grade g = view.UpdateMember();
			switch (g.getGrade()) {
			case "silver":
				members[result] = new Silver(g.getGrade(), g.getName(), g.getPoint());
				break;
			case "gold":
				members[result] = new Gold(g.getGrade(), g.getName(), g.getPoint());
				break;
			case "vip":
				members[result] = new Vip(g.getGrade(), g.getName(), g.getPoint());
				break;
			case "vvip":
				members[result] = new Vvip(g.getGrade(), g.getName(), g.getPoint());
				break;
			}
		}
		view.successUpdateMember();
	} // updateMember()

	public void deleteMember() {
		int result = searchMember(view.deleteMember());

		if (result == -1) {
			view.noSearchMember();
		} else {
			for (int i = result; i < index - 1; i++) {
				members[i] = members[i + 1];
			}
			index--;
		}
		view.successDeleteMember();
	}

	public int searchMember(String name) {
		for (int i = 0; i < index; i++) {
			Grade g = members[i];
			if (name.equals(g.getName())) {
				return i;
			}
		}
		return -1;
	} // searchMember(String name) end

} // PointController Class end
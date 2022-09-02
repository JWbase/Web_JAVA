package kr.or.iei.point.controller;

import java.util.ArrayList;

import kr.or.iei.point.view.PointView;
import kr.or.iei.point.vo.Grade;

public class PointController {

	private PointView view;
	private ArrayList<Grade> grades;

	public PointController() {
		super();
		view = new PointView();
		grades = new ArrayList<Grade>();
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
	} // main() 메소드 끝

	public void deleteMember() {
		String name = view.getName("삭제");
		int searchIndex = searchMember(name);
		if (searchIndex == -1 ) {
			view.noSearchMember();
		} else {
			grades.remove(searchIndex);
		}
	}

	public void updateMember() {
		String name = view.getName("수정");
		int searchIndex = searchMember(name);
		if (searchIndex == -1) {
			view.noSearchMember();
		} else {
			Grade g = view.updateMember();
			grades.set(searchIndex, g);
		}

	}

	public void printOneMember() {
		String name = view.getName("조회");
		int searchIndex = searchMember(name);

		if (searchIndex == -1) {
			view.noSearchMember();
		} else {
			Grade g = grades.get(searchIndex);
			view.printOneMember(g);
		}
	}

	private int searchMember(String name) {
		for (int i = 0; i < grades.size(); i++) {
			Grade g = grades.get(i);
			if (name.equals(g.getName())) {
				return i;
			}
		}
		return -1;
	}

	public void printAllMember() {
		view.printAllMember(grades);
	}

	public void insertMember() {
		Grade g = view.insertMember();
		grades.add(g);
	}
}
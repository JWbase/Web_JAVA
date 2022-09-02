package kr.or.iei.point.controller;

import java.util.HashMap;

import kr.or.iei.point.view.PointView;
import kr.or.iei.point.vo.Grade;

public class PointController {

	private PointView view;
	private HashMap<String, Grade> grades;

	public PointController() {
		super();
		grades = new HashMap<String, Grade>();
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
				updateMember();
				return;
			default:
				break;
			}
		}
	} // main 메소드 end

	public void insertMember() {
		Grade g = view.insertMember();
		grades.put(g.getName(), g);
	}

	public void printAllMember() {
		view.printAllMember(grades);
	}

	public void printOneMember() {
		String name = view.getName("조회");

		if (grades.containsKey(name)) {
			Grade g = grades.get(name);
			view.printOneMember(g);
		} else {
			view.noSearchMember();
		}
	}

	public void deleteMember() {
		String name = view.getName("삭제");
		if (grades.containsKey(name)) {
			Grade g = grades.get(name);
			grades.remove(name);
		} else {
			view.noSearchMember();
		}
	}
	
	public void updateMember() {
		String name = view.getName("수정");
		Grade g = view.updateMember();
		grades.put(g.getName(), g);
		if (!name.equals(g.getName())) {
			grades.remove(name);
		} else {
			view.noSearchMember();
		}
		
	}
}
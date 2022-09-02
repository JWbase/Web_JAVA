package kr.or.student.controller;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;

import kr.or.student.view.StudentView;
import kr.or.student.vo.Student;

public class StudentController {

	private ArrayList<Student> students;
	private StudentView view;

	public StudentController() {
		super();
		students = new ArrayList<Student>();
		view = new StudentView();
	}

	public void main() {
		while (true) {
			int sel = view.menu();

			switch (sel) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				printOneStudent();
				break;
			case 4:
				updateStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				return;
			default:
				break;

			}
		}

	}

	public void deleteStudent() {
		String name = view.getName("삭제");
		int seachIndex = searchStudent(name);
		if (seachIndex == -1) {
			view.noSearchStudent();
		}
		students.remove(seachIndex);

	}

	public void updateStudent() {
		String name = view.getName("수정");
		int searchIndex = searchStudent(name);
		if (searchIndex == -1) {
			view.noSearchStudent();
		}
		Student s = view.updateStudent();
		students.set(searchIndex, s);
	}

	public int searchStudent(String name) {
		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			if (name.equals(s.getName())) {
				return i;
			}
		}
		return -1;
	}

	public void printOneStudent() {
		String name = view.getName("조회");
		int searchIndex = searchStudent(name);
		if (searchIndex == -1) {
			view.noSearchStudent();
		}
		Student s = students.get(searchIndex);
		view.printOneStudent(s);
	}

	public void printAllStudent() {
		view.printAllStudent(students);

	}

	public void insertStudent() {
		Student s = view.insertStudent();
		students.add(s);

	}

}

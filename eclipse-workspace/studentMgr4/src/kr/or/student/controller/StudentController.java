package kr.or.student.controller;

import java.util.ArrayList;
import java.util.Iterator;

import kr.or.student.view.StudentView;
import kr.or.student.vo.Student;

public class StudentController {
//	private Student[] student1;
//	private int index;
	private ArrayList<Student> students;
	private StudentView view;

	public StudentController() {
		super();
//		student1 = new Student[10];
		students = new ArrayList<Student>();
		view = new StudentView();
	}

	public void main() {
		while (true) {
			int sel = view.showMenu();
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
				upDateStudent();
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
		int searchIndex = searchStudent(name);
		if (searchIndex == -1) {
			view.noSearchStudent();
		} else {
			//			for(int i = searchIndex; i < index -1 ; i++) {
			//				student1[i] = student1[i+1];
			//			}
			//			index--;
			students.remove(searchIndex);
		}

	}

	public void upDateStudent() {
		String name = view.getName("수정");
		int searchIndex = searchStudent(name);
		if (searchIndex == -1) {
			view.noSearchStudent();
		} else {
			Student s = view.upDateStudnet();
			// 1) setter 이용한 방법
			//			Student stu = student1[searchIndex];
			/*
			 * Student stu = students.get(searchIndex); stu.setName(s.getName()); stu.setAge(s.getAge()); stu.setAddr(s.getAddr());
			 */
			//2) 객체를 교체하는 방법
			students.set(searchIndex, s);
		}

	}

	public void printOneStudent() {
		String name = view.getName("조회");
		int searchIndex = searchStudent(name);
		if (searchIndex == -1) {
			view.noSearchStudent();
		} else {
			//Student s = student1[searchIndex];
			Student s = students.get(searchIndex);
			view.printOneStudent(s);
		}

	}

	public int searchStudent(String name) {
		//		for (int i = 0; i < index; i++) {
		//			Student s = student1[i];
		//			if (name.equals(s.getName())) {
		//				return i;
		//			}
		//		}
		//		return -1;

		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			if (name.equals(s.getName())) {
				return i;
			}
		}
		return -1;
	}

	public void printAllStudent() {
		//		view.printAllStudent(student1,index);
		view.printAllStudent(students);

	}

	public void insertStudent() {
		Student s = view.insertStudent();
		//student1[index++] = s;
		students.add(s);
	}
}
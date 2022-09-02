package kr.or.iei.student.controller;

import java.util.Scanner;

import kr.or.iei.student.view.StudentView;
import kr.or.iei.student.vo.Student;

public class StudentController {

	private Student[] students;
	private int index;
	private Scanner sc;
	private StudentView view;

	public StudentController() {
		students = new Student[10];
		sc = new Scanner(System.in);
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
	} //  main() end

	// 사용자에게 이름, 나이, 주소를 입력 받아서 배열에 저장
	public void insertStudent() {
		Student s = view.insertStudent();
		students[index++] = s;
		view.insertSuccess();

		//		String name = s.getName();
		//		int age = s.getAge();
		//		String addr = s.getAddr();
		//
		//		Student student = new Student(name, age, addr);
		//		students[index] = student;
		//		index++;
	} // insertStudent() end

	public void printAllStudent() {
		view.printAllStudent(students, index);
	} // printAllStudent() end

	public void printOneStudent() {
		String name = view.getName("조회");
		int searchIndex = searchStudent(name);
		if (searchIndex == -1) {
			view.noSearchStudent();
		} else {
			Student s = students[searchIndex];
			view.printOneStudent(s);
		}

		// 1. 이름입력(view)
		// 2. 조회 (controller)
		// 3. 조회결과에 따른 출력(view)
	}

	public int searchStudent(String name) {
		for (int i = 0; i < index; i++) {
			Student s = students[i];
			if (name.equals(s.getName())) {
				return i;
			}
		}
		return -1;
	} //  searchStudent(String name) end

	public void updateStudent() {

		String name = view.getName("수정");

		int searchIndex = searchStudent(name);

		if (searchIndex == -1) {
			view.noSearchStudent();
		} else {
			Student s = view.insertNewStudent();
			students[searchIndex] = s;
			view.updateSuccess();
		}
		// 1. 수정 할 학생 이름 입력 받기(view)
		// 2. 받아온 학생이 배열에 존재하는지 조회(controller)
		// 3. 조회결과에 따른 처리
		// 3-1. 조회결과 x 조회할수없습니다. 출력
		// 3-2. 조회결과 있는 경우
		// 3-2-1. 수정 할 학생정보입력받기(view)
		// 3-2-2. 수정할 학생 정보 배열에 반영(controller)
	} // updateStudent()

	public void deleteStudent() {
		String name = view.getName("삭제");
		int searchIndex = searchStudent(name);
		if (searchIndex == -1) {
			view.noSearchStudent();
		} else {
			view.deleteStudent(students, searchIndex, index);
			view.deleteSuccess();
		}
		index--;
	} // deleteStudent() end
} // StudentController class end

package kr.or.iei.student.view;

import java.util.Scanner;

import kr.or.iei.student.vo.Student;

public class StudentView {

	private Scanner sc;

	public StudentView() {
		sc = new Scanner(System.in);
	}

	public int showMenu() {

		System.out.println("===== 학생 관리 프로그램 =====");
		System.out.println("1. 학생 정보 등록");
		System.out.println("2. 학생 전체 출력");
		System.out.println("3. 학생 1명 출력");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
		int sel = sc.nextInt();
		return sel;
	} // showMenu() end

	public Student insertStudent() {

		System.out.println("===== 학생 정보 등록 =====");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();

		Student s = new Student(name, age, addr);
		return s;
	} //  insertStudent() end

	public void insertSuccess() {

		System.out.println("회원가입 완료!");
	} // insertSuccess() end

	public void printAllStudent(Student[] students, int index) {

		System.out.println("===== 전체 학생 출력 =====");
		System.out.println("이름\t나이\t주소");
		for (int i = 0; i < index; i++) {
			Student s = students[i];
			System.out.printf("%s\t%d\t%s\n", s.getName(), s.getAge(), s.getAddr());
		}
	} // printAllStudent(Student[] students, int index) end

	public String getName(String str) {
		System.out.println("===== 학생 정보 + " + str + "=====");
		System.out.println(str + "할 이름 입력 : ");
		String name = sc.next();
		return name;
	} // getName(String str) end

	public void noSearchStudent() {
		System.out.println("학생 정보를 찾을 수 없습니다.");
	} // noSearchStudent() end

	public void printOneStudent(Student s) {
		System.out.println("이름 : " + s.getName());
		System.out.println("나이 : " + s.getAge());
		System.out.println("주소 : " + s.getAddr());
	} // printOneStudent(Student s)

	public Student insertNewStudent() {
		Student s = new Student();

		System.out.print("수정 할 이름 입력 : ");
		String name = sc.next();
		s.setName(name);
		System.out.print("수정 할 나이 입력 : ");
		int age = sc.nextInt();
		s.setAge(age);
		System.out.print("수정 할 주소 입력 : ");
		sc.nextLine();
		s.setAddr(sc.nextLine());

		//Student s2 = new Student(name, age, addr);
		return s;
	} // insertNewStudent() end

	public void updateSuccess() {
		System.out.println("수정완료!");
	}

	public String insertDeleteStudent() {
		System.out.println("===== 회원 정보 삭제 =====");
		System.out.print("삭제 할 회원 이름 입력 : ");
		String name = sc.next();
		return name;
	} // insertDeleteStudent();

	public void deleteStudent(Student[] students, int searchIndex, int index) {

		for (int i = searchIndex; i < index - 1; i++) {
			students[i] = students[i + 1];
		}
	} // deleteStudent(Student[] students, int searchIndex, int index) end

	public void deleteSuccess() {
		System.out.println("삭제완료!");
	}
}

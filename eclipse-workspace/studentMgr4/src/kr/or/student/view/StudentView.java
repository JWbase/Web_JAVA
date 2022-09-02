package kr.or.student.view;

import java.util.ArrayList;
import java.util.Scanner;

import kr.or.student.vo.Student;

public class StudentView {
	private Scanner sc;

	public StudentView() {
		super();
		sc = new Scanner(System.in);
	}

	public int showMenu() {

		System.out.println("------ 학생관리 프로그램v4 ------");
		System.out.println("1. 학생 정보 등록");
		System.out.println("2. 학생 전체 출력");
		System.out.println("3. 학생 1명 출력");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
		int sel = sc.nextInt();
		return sel;
	}

	public Student insertStudent() {
		System.out.println("------ 학생 정보 입력 -------");
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		Student s = new Student(name, age, addr);
		return s;

	}

	public void printAllStudent(ArrayList<Student> students) {

		System.out.println("------ 학생 전체 출력 ------");
		System.out.println("이름\t나이\t주소");
		//		for (int i = 0; i < index; i++) {
		//			Student s = student1[i];
		//			System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getAddr());
		//		for (int i = 0; i < students.size(); i ++) {
		//			Student s = students.get(i);
		//			System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getAddr());
		for (Student s : students) {
			System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getAddr());
		}
	}

	public String getName(String string) {
		System.out.println("------ 회원 정보 " + string + " ------");
		System.out.print(string + "할 학생 이름 입력 : ");
		String name = sc.next();
		return name;
	}

	public void noSearchStudent() {
		System.out.println("학생 정보를 찾을 수 없습니다.");
	}

	public void printOneStudent(Student s) {
		System.out.println("이름 : " + s.getName());
		System.out.println("나이 : " + s.getAge());
		System.out.println("주소 : " + s.getAddr());
	}

	public Student upDateStudnet() {
		Student s = new Student();
		System.out.print("수정 이름 입력 : ");
		String name = sc.next();
		s.setName(name);
		System.out.print("수정 나이 입력 : ");
		int age = sc.nextInt();
		s.setAge(age);
		System.out.print("수정 이름 입력 : ");
		sc.nextLine();
		s.setAddr(sc.nextLine());
		return s;
	}

}
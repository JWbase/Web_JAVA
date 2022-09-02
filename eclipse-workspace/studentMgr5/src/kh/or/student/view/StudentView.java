package kh.or.student.view;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import javax.security.auth.Subject;

import kh.or.student.vo.Student;

public class StudentView {

	private Scanner sc;

	public StudentView() {
		super();
		sc = new Scanner(System.in);
	}

	public int showMain() {

		System.out.println("====== 학생 관리프로그램v6 ======");
		System.out.println("1. 학생 정보 등록");
		System.out.println("2. 학생 전체 조회");
		System.out.println("3. 학생 1명 조회");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");

		int sel = sc.nextInt();
		return sel;
	}

	public Student insertStudent() {
		System.out.println("====== 학생 정보 등록 ======");
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

	public void printAllStudent(HashMap<String, Student> students) {
		System.out.println("====== 전체 학생 출력 ======");
		System.out.println("이름\t나이\t주소");
		Set<String> names = students.keySet();
		for (String name : names) {
			Student s = students.get(name);
			System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getAddr());
		}
	}

	public String getName(String string) {
		System.out.println("====== 학생 정보 " + string);
		System.out.print(string + " 할 이름 입력 : ");
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

	public Student updateStudent() {
		System.out.print("수정 할 이름 입력 : ");
		String name = sc.next();
		System.out.print("수정 할 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("수정할 주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();

		Student s = new Student(name, age, addr);
		return s;
	}

}

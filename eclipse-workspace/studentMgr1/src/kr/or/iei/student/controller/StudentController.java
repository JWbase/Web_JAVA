package kr.or.iei.student.controller;

import java.util.Scanner;

public class StudentController {

	// 학생정보를 관리하는 프로그램(10명)
	// 학생정보 이름, 나이, 주소
	// 동명이인없음(가정), 데이터는 정상적으로 입력된다.

	private String[] name;
	private int[] age;
	private String[] addr;
	private Scanner sc;
	// 배열관리번호(학생 정보 추가시 학생정보가 들어갈 배열 위치를 저장 할 변수)
	private int index;

	public StudentController() {
		name = new String[10];
		age = new int[10];
		addr = new String[10];
		sc = new Scanner(System.in);
		index = 0;
	}

	// 최초 실행메소드(메뉴를 제공)
	public void main() {

		while (true) {
			System.out.println("\n------ 학생관리프로그램v1.0 ------\n");
			System.out.println("1. 학생 정보 등록"); // Create : 데이터를 만들어서 저장하는 기능
			System.out.println("2. 학생 정보 출력(전체학생정보)"); // Read : 저장되어 있는 데이터를 읽어오는 기능
			System.out.println("3. 학생 정보 출력(1명 : 이름으로 검색)"); // Read : 저장되어 있는 데이터를 읽어오는 기능
			System.out.println("4. 학생 정보 수정"); // Update : 저장되어 있는 데이터를 수정
			System.out.println("5. 학생 정보 삭제"); // Delete : 저장되어 있는 데이터를 삭제
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();

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
				System.out.println("시스템을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			} // 메뉴선택 switch end
		} // 전체 while end
	} // main() end

	// 학생정보를 입력받아서 배열에 저장하는 메소드
	public void insertStudent() {

		System.out.println("\n ------ 학생 정보 등록 ------\n");
		System.out.print("학생 이름 입력 : ");
		String studentName = sc.next();
		System.out.print("학생 나이 입력 : ");
		int studentAge = sc.nextInt();
		System.out.print("학생 주소 입력 : ");
		sc.nextLine(); // 버퍼의 엔터 제거용
		String studentAddr = sc.nextLine();
		name[index] = studentName;
		age[index] = studentAge;
		addr[index] = studentAddr;
		index++;
		System.out.println("학생정보 등록 완료!");
	} // insertStudent() 종료

	// 배열에 저장되어 있는 모든 학생 정보를 출력하는 메소드
	public void printAllStudent() {

		System.out.println("\n------ 전체 학생 정보 출력 ------\n");
		System.out.println("이름\t나이\t주소");
		System.out.println("----------------------------------");
		for (int i = 0; i < index; i++) {
			System.out.println(name[i] + "\t" + age[i] + "\t" + addr[i]);
		}
	} // printAllStudet() 종료

	// 학생 이름을 입력받아 조회 후 해당 학생 정보 출력하는 메소드
	public void printOneStudent() {

		System.out.println("\n------ 학생 1명 정보 출력 -------\n");
		System.out.print("조회 할 학생 이름 입력 : ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName); // 음수로 해놓으면 배열이 늘어나도 고치지 않아도 됨.
		if (searchIndex == -1) {
			System.out.println("학생정보를 조회 할 수 없습니다.");
		} else {
			System.out.println("학생 이름 : " + name[searchIndex]);
			System.out.println("학생 나이 : " + age[searchIndex]);
			System.out.println("학생 주소 : " + addr[searchIndex]);
		}
	} // printOneStudent() 종료

	// 학생이름을 입력받아 해당 학생의 정보를 수정하는 메소드
	public void updateStudent() {

		System.out.println("\n------ 학생 정보 수정 ------\n");
		System.out.print("정보 수정할 학생 이름 입력 : ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName);
		if (searchIndex == -1) {
			System.out.println("학생 정보를 조회 할 수 없습니다.");
		} else {
			System.out.print("수정 할 이름 입력 : ");
			name[searchIndex] = sc.next();
			System.out.print("수정 할 나이 입력 : ");
			age[searchIndex] = sc.nextInt();
			System.out.print("수정 할 주소 입력 : ");
			sc.nextLine();
			addr[searchIndex] = sc.nextLine();
			System.out.println("정보 수정 완료!");
		}
	} // updateStudent() 종료

	// 이름을 입력받아 해당 학생을 삭제하는 메소드
	public void deleteStudent() {

		System.out.println("\n------ 학생 정보 삭제 ------\n");
		System.out.print("삭제할 학생 이름 입력 : ");
		String searchName = sc.next();
		int searchIndex = searchStudent(searchName);
		if (searchIndex == -1) {
			System.out.println("학생 정보를 조회 할 수 없습니다.");
		} else {
			// 회원이 5명 0 ~ 4
			// 배열 사용번호 : 0 ~ 4 index : 5
			// 3번회원 삭제 2번 index 데이터 삭제
			// 2 : 3번 데이터 입력
			for (int i = searchIndex; i < index - 1; i++) {
				name[i] = name[i + 1];
				age[i] = age[i + 1];
				addr[i] = addr[i + 1];
			}
			index--;
			System.out.println("삭제완료!");
		}
	} // deleteStudent() 종료
	// 매개변수로 받은 이름이 name배열 몇번째에 존재하는지 되돌려주는 메소드(조회실패 시 -1 return)
	public int searchStudent(String searchName) {
		for (int i = 0; i < index; i++) {
			if (searchName.equals(name[i])) {
				return i;
			}
		}
		return -1;
	} // searchStudent(String searchName) 종료
} // class end
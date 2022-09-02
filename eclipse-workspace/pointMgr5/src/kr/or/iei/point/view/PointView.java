package kr.or.iei.point.view;

import java.util.Scanner;

import kr.or.iei.point.vo.Grade;
import kr.or.iei.point.vo.Silver;

public class PointView {

	private Scanner sc;

	public PointView() {
		super();
		sc = new Scanner(System.in);
	}

	public int showMenu() {

		System.out.println("====== 포인트 관리프로그램 v6 ======");
		System.out.println("1. 회원 정보 등록");
		System.out.println("2. 전체 회원 조회");
		System.out.println("3. 회원 1명 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 회원 정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");

		int sel = sc.nextInt();
		return sel;
	} // showMenu()

	public Silver insertMember() {

		System.out.println("====== 회원 정보 등록 ======");
		System.out.print("회원 등급 입력[silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.print("회원 이름 입력 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("회원 포인트 입력 : ");
		int point = sc.nextInt();

		Silver g = new Silver(grade, name, point);
		return g;
	}

	public void successInsertMember() {
		System.out.println("회원 등록 완료");
	}

	public void printAllMember(Grade members[], int index) {

		System.out.println("===== 전체 회원 출력 =====");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("----------------------------");

		for (int i = 0; i < index; i++) {
			Grade g = members[i];
			System.out.printf("%s\t%s\t%d\t%.2f\n", g.getGrade(), g.getName(), g.getPoint(), g.getBonus());
		}
	} // public void printAllMember(Grade members[], int index) end

	public String insertPrintOneMember() {
		System.out.println("====== 회원 정보 출력 ======");
		System.out.print("조회 할 회원 이름 입력 : ");
		String name = sc.next();

		return name;
	}
	
	public void printOneMember(Grade g) {
		System.out.println("등급 : " + g.getGrade());
		System.out.println("이름 : " + g.getName());
		System.out.println("포인트 : " + g.getPoint());
		System.out.println("보너스 : " + g.getBonus());
	}

	public void noSearchMember() {
		System.out.println("회원정보를 찾을 수 없습니다.");
	} // noSearchMember() end

	public String searchUpdateMember() {
		System.out.println("====== 회원 정보 수정 ======");
		System.out.print("수정할 회원 이름 입력 : ");
		String name = sc.next();
		return name;
	} // searchUpdateMember();

	public Silver UpdateMember() {

		System.out.print("수정 할 회원등급 입력[silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.print("수정 할 회원이름 입력 :  ");
		String name = sc.next();
		System.out.print("수정 할 포인트 입력 : ");
		int point = sc.nextInt();

		Silver g = new Silver(grade, name, point);
		return g;
	} // UpdateMember()

	public void successUpdateMember() {
		System.out.println("정보 수정 완료!");
	} // successUpdateMember()

	public String deleteMember() {
		System.out.println("====== 회원 정보 삭제 ======");
		System.out.print("삭제 할 회원 이름 입력 : ");
		String name = sc.next();

		return name;
	} // deleteMember() end

	public void successDeleteMember() {
		System.out.println("회원 정보 삭제 완료");
	}
}

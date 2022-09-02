package kr.or.iei.point.controller;

import java.util.Scanner;

import kr.or.iei.point.vo.Gold;
import kr.or.iei.point.vo.Grade;
import kr.or.iei.point.vo.Silver;
import kr.or.iei.point.vo.Vip;
import kr.or.iei.point.vo.Vvip;

public class PointControllerImpl implements PointController {

	//	Silver,Gold,Vip,Vvip 객체저장배열
	//	각배열의 인덱스 관리용 변수
	//	Scanner

	private Grade[] members;
	private int index;
	private Scanner sc;

	public PointControllerImpl() {
		super();
		members = new Grade[40];
		sc = new Scanner(System.in);
	}

	@Override
	public void main() {

		while (true) {
			System.out.println("===== 회원 관리 프로그램v4 =====");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 전체 회원 출력");
			System.out.println("3. 회원 1명 출력");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
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
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		} // while end
	}

	@Override
	public void insertMember() {
		System.out.println("===== 회원 정보 출력 =====");
		System.out.print("회원 등급 입력[silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.print("회원 이름 입력 : ");
		String name = sc.next();
		System.out.print("회원 포인트 입력 : ");
		int point = sc.nextInt();

		switch (grade) {
		case "silver":
			Silver s = new Silver(grade, name, point);
			Grade newMember = (Grade) s; // 업캐스팅
			members[index] = newMember;
			index++;
			break;
		case "gold":
			Gold g = new Gold(grade, name, point);
			Grade newMember2 = (Grade) g;
			members[index++] = newMember2;
			break;
		case "vip":
			Grade newMember3 = new Vip(grade, name, point);
			members[index++] = newMember3;
			break;
		case "vvip":
			members[index++] = new Vvip(grade, name, point);
			break;
		}
		System.out.println("회원 등록 완료");
	} // insertMember() end

	@Override
	public void printAllMember() {

		System.out.println("===== 전체 회원 출력 =====");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("----------------------------");
		for (int i = 0; i < index; i++) {
			Grade g = members[i];
			System.out.printf("%s\t%s\t%d\t%.2f\n", g.getGrade(), g.getName(), g.getPoint(), g.getBonus());
		}
	}

	@Override
	public void printOneMember() {

		System.out.println("===== 회원 정보 출력 =====");
		System.out.print("조회 할 회원 이름 입력 : ");
		String name = sc.next();

		int result = searchMember(name);

		if (result == -1) {
			System.out.println("회원정보를 찾을 수 없습니다.");
		} else {
			Grade g = members[result];
			System.out.println("등급 : " + g.getGrade());
			System.out.println("이름 : " + g.getName());
			System.out.println("포인트 : " + g.getPoint());
			System.out.println("보너스 : " + g.getBonus());
		}
	} // printOneMember() end

	@Override
	public void updateMember() {

		System.out.println("===== 회원 정보 수정 =====");
		System.out.print("수정할 회원 이름 입력 : ");
		String name = sc.next();

		int result = searchMember(name);

		if (result == -1) {
			System.out.println("회원 정보를 조회 할 수 없습니다.");
		} else {
			System.out.print("수정 할 회원등급 입력[siver/gold/vip/vvip] : ");
			String grade = sc.next();
			System.out.print("수정 할 회원이름 입력 :  ");
			String newName = sc.next();
			System.out.print("수정 할 포인트 입력 : ");
			int point = sc.nextInt();

			switch (grade) {
			case "silver":
				members[result] = new Silver(grade, newName, point);
				break;
			case "gold":
				members[result] = new Gold(grade, newName, point);
				break;
			case "vip":
				members[result] = new Vip(grade, newName, point);
				break;
			case "vvip":
				members[result] = new Vvip(grade, newName, point);
				break;
			}
		}
		System.out.println("정보가 수정 되었습니다.");
	} // updateMember() end

	@Override
	public void deleteMember() {

		System.out.println("===== 회원 정보 삭제 =====");
		System.out.print("삭제 할 회원 이름 입력 : ");
		String name = sc.next();

		int result = searchMember(name);

		if (result == -1) {
			System.out.println("회원 정보를 조회 할 수 없습니다.");
		} else {
			for (int i = result; i < index - 1; i++) {
				members[i] = members[i + 1];
			}
			index--;
			System.out.println("회원 정보 삭제 완료");
		}
	} // deleteMember() end

	@Override
	public int searchMember(String name) {

		for (int i = 0; i < index; i++) {
			Grade g = members[i];
			if (name.equals(g.getName())) {
				return i;
			}
		}
		return -1;
	} // searchMember(String name) end
} // PointControllerImpl Class end
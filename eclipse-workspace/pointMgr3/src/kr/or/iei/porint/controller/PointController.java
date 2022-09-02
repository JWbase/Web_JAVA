package kr.or.iei.porint.controller;

import java.util.Scanner;

import kr.or.iei.porint.vo.Gold;
import kr.or.iei.porint.vo.Silver;
import kr.or.iei.porint.vo.Vip;
import kr.or.iei.porint.vo.Vvip;

public class PointController {

	private Scanner sc;
	private Silver[] sMembers;
	private int sIndex;
	private Gold[] gMembers;
	private int gIndex;
	private Vip[] vMembers;
	private int vIndex;
	private Vvip[] vvMembers;
	private int vvIndex;

	public PointController() {

		sc = new Scanner(System.in);
		sMembers = new Silver[10];
		gMembers = new Gold[10];
		vMembers = new Vip[10];
		vvMembers = new Vvip[10];
	}

	public void main() {

		while (true) {
			System.out.println("===== 포인트관리 프로그램v2 =====");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 회원 전체 정보 출력");
			System.out.println("3. 회원 1명 정보 출력");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();

			switch (sel) {

			case 1:
				createMember();
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
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			} // switch end

		} // while end
	} // main method end

	public void createMember() {

		System.out.println("===== 회원 정보 등록 =====");
		System.out.print("회원 등급 입력(Silver / Gold / Vip / Vvip) : ");
		String grade = sc.next();
		System.out.print("회원 이름 입력 : ");
		String name = sc.next();
		System.out.print("회원 포인트 입력 : ");
		int point = sc.nextInt();

		switch (grade) {
		case "Silver":
			Silver s = new Silver(grade, name, point);
			sMembers[sIndex++] = s;
			break;
		case "Gold":
			Gold g = new Gold(grade, name, point);
			gMembers[gIndex++] = g;
			break;
		case "Vip":
			Vip v = new Vip(grade, name, point);
			vMembers[vIndex++] = v;
			break;
		case "Vvip":
			Vvip vv = new Vvip(grade, name, point);
			vvMembers[vvIndex++] = vv;
			break;
		}
		System.out.println("회원 등록이 완료 되었습니다.");
	} // createMember() end

	public void printAllMember() {

		System.out.println("===== 전체 회원 출력 =====");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("-----------------------------------");

		for (int i = 0; i < sIndex; i++) {
			Silver s = sMembers[i];
			System.out.println(s.getGrade() + "\t" + s.getName() + "\t" + s.getPoint() + "\t" + s.getBonus());
		}

		for (int i = 0; i < gIndex; i++) {
			Gold g = gMembers[i];
			System.out.println(g.getGrade() + "\t" + g.getName() + "\t" + g.getPoint() + "\t" + g.getBonus());
		}

		for (int i = 0; i < vIndex; i++) {
			Vip v = vMembers[i];
			System.out.println(v.getGrade() + "\t" + v.getName() + "\t" + v.getPoint() + "\t" + v.getBonus());
		}

		for (int i = 0; i < vvIndex; i++) {
			Vvip vv = vvMembers[i];
			System.out.println(vv.getGrade() + "\t" + vv.getName() + "\t" + vv.getPoint() + "\t" + vv.getBonus());
		}

	} // printAllMember end

	public void printOneMember() {

		System.out.println("===== 회원 정보 출력 =====");
		System.out.print("조회 할 회원 이름 입력 : ");
		String name = sc.next();

		int result[] = searchMember(name);

		if (result[0] == 0) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
		} else {
			if (result[0] == 1) {
				Silver s = sMembers[result[1]];
				System.out.println("등급 : " + s.getGrade());
				System.out.println("이름 : " + s.getName());
				System.out.println("포인트 : " + s.getPoint());
				System.out.println("보너스 : " + s.getBonus());
			} else if (result[0] == 2) {
				Gold g = gMembers[result[1]];
				System.out.println("등급 : " + g.getGrade());
				System.out.println("이름 : " + g.getName());
				System.out.println("포인트 : " + g.getPoint());
				System.out.println("보너스 : " + g.getBonus());
			} else if (result[0] == 4) {
				Vip v = vMembers[result[1]];
				System.out.println("등급 : " + v.getGrade());
				System.out.println("이름 : " + v.getName());
				System.out.println("포인트 : " + v.getPoint());
				System.out.println("보너스 : " + v.getBonus());
			} else if (result[0] == 4) {
				Vvip vv = vvMembers[result[1]];
				System.out.println("등급 : " + vv.getGrade());
				System.out.println("이름 : " + vv.getName());
				System.out.println("포인트 : " + vv.getPoint());
				System.out.println("보너스 : " + vv.getBonus());
			}
		}
	} // printOneMember() 종료

	public void updateMember() {

		System.out.println("===== 회원 정보 수정 =====");
		System.out.print("수정 할 회원 이름 입력 : ");
		String name = sc.next();
		int[] result = searchMember(name);

		if (result[0] == 0) {
			System.out.println("회원 정보를 조회 할 수 없습니다.");
		} else {
			if (result[0] == 1) {
				for (int i = result[1]; i < sIndex - 1; i++) {
					sMembers[i] = sMembers[i + 1];
				}
				sIndex--;
			} else if (result[0] == 2) {
				for (int i = result[1]; i < gIndex - 1; i++) {
					gMembers[i] = gMembers[i + 1];
				}
				gIndex--;
			} else if (result[0] == 3) {
				for (int i = result[1]; i < vIndex - 1; i++) {
					vMembers[i] = vMembers[i + 1];
				}
				vIndex--;
			} else if (result[0] == 4) {
				for (int i = result[1]; i < vvIndex - 1; i++) {
					vvMembers[i] = vvMembers[i + 1];
				}
				vvIndex--;
			}
		}
		System.out.print("새로운 회원 등급 입력 : ");
		String grade = sc.next();
		System.out.print("새로운 회원 이름 입력 : ");
		String updateName = sc.next();
		System.out.print("새로운 회원 포인트 입력 : ");
		int point = sc.nextInt();

		switch (grade) {

		case "Silver":
			sMembers[sIndex++] = new Silver(grade, name, point);
			break;
		case "Gold":
			gMembers[gIndex++] = new Gold(grade, name, point);
			break;
		case "Vip":
			vMembers[vIndex++] = new Vip(grade, name, point);
			break;
		case "Vvip":
			vvMembers[vIndex++] = new Vvip(grade, name, point);
			break;
		}
		System.out.println("정보가 수정 되었습니다.");
	} // updateMember() 종료

	public void deleteMember() {
		System.out.println("===== 회원 정보 삭제 =====");
		System.out.print("삭제 할 회원 이름 입력 : ");
		String name = sc.next();

		int[] result = searchMember(name);

		if (result[0] == 0) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
		} else {
			if (result[0] == 1) {
				for (int i = result[1]; i < sIndex - 1; i++) {
					sMembers[i] = sMembers[i + 1];
				}
				sIndex--;
			} else if (result[0] == 2) {
				for (int i = result[1]; i < gIndex - 1; i++) {
					gMembers[i] = gMembers[i + 1];
				}
				gIndex--;
			}
			if (result[0] == 3) {
				for (int i = result[1]; i < vIndex - 1; i++) {
					vMembers[i] = vMembers[i + 1];
				}
				vIndex--;
			}
			if (result[0] == 4) {
				for (int i = result[1]; i < vvIndex - 1; i++) {
					vvMembers[i] = vvMembers[i + 1];
				}
				vvIndex--;
			}
			System.out.println("회원 정보 삭제 완료");
		}
	} // end deleteMember()

	public int[] searchMember(String name) {

		int[] result = new int[2];

		for (int i = 0; i < sIndex; i++) {
			Silver s = sMembers[i];
			if (name.equals(s.getName())) {
				result[0] = 1;
				result[1] = i;
				return result;
			}
		}

		for (int i = 0; i < gIndex; i++) {
			Gold g = gMembers[i];
			if (name.equals(g.getName())) {
				result[0] = 2;
				result[1] = i;
				return result;
			}
		}

		for (int i = 0; i < vIndex; i++) {
			Vip v = vMembers[i];
			if (name.equals(v.getName())) {
				result[0] = 3;
				result[1] = i;
				return result;
			}
		}

		for (int i = 0; i < vvIndex; i++) {
			Vvip vv = vvMembers[i];
			if (name.equals(vv.getName())) {
				result[0] = 4;
				result[1] = i;
				return result;
			}
		}
		return result;
	} // searchMember(String name) end

} // PointController Class end

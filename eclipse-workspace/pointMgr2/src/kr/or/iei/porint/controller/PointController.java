package kr.or.iei.porint.controller;

import java.util.Scanner;

import kr.or.iei.point.vo.Silver;
import kr.or.iei.point.vo.Vip;
import kr.or.iei.point.vo.Gold;

public class PointController {

	private Silver[] sMembers;
	private int sIndex; // 전역변수는 초기값이 자동으로 int는 0으로 설정되어 있어서 초기화 하지 않아도 괜춘.
	private Gold[] gMembers;
	private int gIndex;
	private Vip[] vMembers;
	private int vIndex;
	private int flag;
	private Scanner sc;

	public PointController() {
		sMembers = new Silver[10]; // 초기값이 null이라 초기화 해줘야함
		gMembers = new Gold[10]; // 초기값이 null이라 초기화 해줘야함
		vMembers = new Vip[10]; // 초기값이 null이라 초기화 해줘야함
		sc = new Scanner(System.in);
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
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		} // while문 end
	} // main 메소드 end

	public void insertMember() {
		System.out.println("===== 회원 정보 등록 =====");
		System.out.print("회원 등급 입력[silver/gold/vip] : ");
		String grade = sc.next();
		System.out.print("회원 이름 입력 : ");
		String name = sc.next();
		System.out.print("회원 포인트 입력 : ");
		int point = sc.nextInt();
		switch (grade) {
		case "silver":
			Silver s = new Silver(grade, name, point);
			sMembers[sIndex++] = s;
			break;
		case "gold":
			Gold g = new Gold(grade, name, point);
			gMembers[gIndex++] = g;
			break;
		case "vip":
			Vip v = new Vip(grade, name, point);
			vMembers[vIndex++] = v;
			break;
		}

		System.out.println("회원 등록 완료");
	} // insertMember end

	public void printAllMember() {
		System.out.println("===== 전체 회원 출력 =====");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("-----------------------------");

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
	} // printAllMember() end

	public void printOneMember() {
		System.out.println("===== 회원 정보 출력 =====");
		System.out.print("조회할 회원 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchMember1(name);
		if (searchIndex == -1) {
			System.out.println("회원정보를 검색 할 수 없습니다.");
		} else {
			// 0 ~ 9, 10~19, 100 ~ 109
			if (searchIndex / 100 == 1) {
				searchIndex -= 100;
				Vip v = vMembers[searchIndex];
				System.out.println("등급 : " + v.getGrade());
				System.out.println("이름 : " + v.getName());
				System.out.println("포인트 : " + v.getPoint());
				System.out.println("보너스 : " + v.getBonus());
			} else if (searchIndex / 10 == 1) {
				searchIndex -= 10;
				Gold g = gMembers[searchIndex];
				System.out.println("등급 : " + g.getGrade());
				System.out.println("이름 : " + g.getName());
				System.out.println("포인트 : " + g.getPoint());
				System.out.println("보너스 : " + g.getBonus());
			} else {
				Silver s = sMembers[searchIndex];
				System.out.println("등급 : " + s.getGrade());
				System.out.println("이름 : " + s.getName());
				System.out.println("포인트 : " + s.getPoint());
				System.out.println("보너스 : " + s.getBonus());
			}
		}
	} // printOneMember() end

	public void updateMember() {
		System.out.println("===== 회원 정보 수정 =====");
		System.out.print("수정 할 회원 이름 입력 : ");
		String name = sc.next();
		int[] result = searchMember3(name);
		if (result[0] == 0) {
			System.out.println("회원정보를 조회할 수 없습니다.");
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
			}
			System.out.print("수정할 회원 등급 입력 : ");
			String grade = sc.next();
			System.out.print("수정할 회원 이름 입력 : ");
			String updateName = sc.next();
			System.out.print("수정할 회원 포인트 입력 : ");
			int point = sc.nextInt();
			switch (grade) {
			case "silver":
				Silver s = new Silver(grade, updateName, point);
				sIndex++;
				break;
			case "gold":
				Gold g = new Gold(grade, updateName, point);
				gMembers[gIndex++] = g;
				break;
			case "vip":
				vMembers[vIndex++] = new Vip(grade, updateName, point);
				break;
			}
			System.out.println("정보 수정 완료!");
		}
	} // updateMember() end

	public void deleteMember() {
		System.out.println("===== 회원 정보 삭제 =====");
		System.out.print("삭제 할 회원 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchMember2(name);

		if (searchIndex == -1) {
			System.out.println("회원 정보를 조회할 수 없습니다.");
		} else {
			if (flag == 1) {
				for (int i = searchIndex; i < sIndex - 1; i++) {
					sMembers[i] = sMembers[i + 1];
				}
				sIndex--;
			} else if (flag == 2) {
				for (int i = searchIndex; i < gIndex - 1; i++) {
					gMembers[i] = gMembers[i + 1];
				}
				gIndex--;
			} else if (flag == 3) {
				for (int i = searchIndex; i < vIndex - 1; i++) {
					vMembers[i] = vMembers[i + 1];
				}
				vIndex--;
			}
			System.out.println("회원정보 삭제 완료!");
		}
	} // deleteMember() end

	public int searchMember1(String name) {
		for (int i = 0; i < sIndex; i++) {
			Silver s = sMembers[i];
			if (name.equals(s.getName())) {
				return i; // 0 ~ 9
			}
		}

		for (int i = 0; i < gIndex; i++) {
			Gold g = gMembers[i];
			if (name.equals(g.getName())) {
				return i + 10; // 10 ~ 109
			}
		}

		for (int i = 0; i < vIndex; i++) {
			Vip v = vMembers[i];
			if (name.equals(v.getName())) {
				return i + 100; // 100 ~ 109
			}
		}
		return -1;
	} // searchMember1(String name) end

	public int searchMember2(String name) {

		for (int i = 0; i < sIndex; i++) {
			Silver s = sMembers[i];
			if (name.equals(s.getName())) {
				flag = 1;
				return i;
			}
		}

		for (int i = 0; i < gIndex; i++) {
			Gold g = gMembers[i];
			if (name.equals(g.getName())) {
				flag = 2;
				return i;
			}
		}

		for (int i = 0; i < vIndex; i++) {
			Vip v = vMembers[i];
			if (name.equals(v.getName())) {
				flag = 3;
				return i;
			}
		}
		return -1;
	} // searchMember2(String name) end

	public int[] searchMember3(String name) {

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
		return result;
	} // searchMember3(String name) end
} // PointController Class end
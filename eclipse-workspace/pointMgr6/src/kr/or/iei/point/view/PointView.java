package kr.or.iei.point.view;

import java.util.ArrayList;
import java.util.Scanner;

import kr.or.iei.point.vo.Gold;
import kr.or.iei.point.vo.Grade;
import kr.or.iei.point.vo.Silver;
import kr.or.iei.point.vo.Vip;
import kr.or.iei.point.vo.Vvip;

public class PointView {

	Scanner sc;

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
	}

	public Grade insertMember() {
		System.out.println("====== 회원 정보 등록 ======");
		System.out.print("회원 등급 입력[silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.print("회원 이름 입력 : ");
		String name = sc.next();
		System.out.print("회원 포인트 입력 : ");
		int point = sc.nextInt();

		Grade g = null;
		switch (grade) {

		case "silver":
			Silver s = new Silver(grade, name, point);
			g = (Grade) s;
			break;
		case "gold":
			Gold go = new Gold(grade, name, point);
			g = (Grade) go;
			break;
		case "vip":
			Vip v = new Vip(grade, name, point);
			g = (Grade) v;
			break;
		case "vvip":
			Vvip vv = new Vvip(grade, name, point);
			g = (Grade) vv;
			break;
		}
		return g;
	} // insertMember();

	public void printAllMember(ArrayList<Grade> grades) {

		System.out.println("===== 전체 회원 출력 =====");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("----------------------------");

		for (Grade g : grades) {
			System.out.println(g.getGrade() + "\t" + g.getName() + "\t" + g.getPoint() + "\t" + g.getBonus());
		}

	}

	public String getName(String string) {
		System.out.println("====== 회원 정보 " + string + "======");
		System.out.print(string + "할 회원 이름 입력 : ");
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
		System.out.println("회원정보를 조회 할 수 없습니다.");
	}

	public Grade updateMember() {

		System.out.print("수정 할 회원등급 입력[silver/gold/vip/vvip] : ");
		String grade = sc.next();
		System.out.print("수정 할 회원이름 입력 :  ");
		String name = sc.next();
		System.out.print("수정 할 포인트 입력 : ");
		int point = sc.nextInt();
		
		Grade g = null;
		switch (grade) {

		case "silver":
			Silver s = new Silver(grade, name, point);
			g = (Grade) s;
			break;
		case "gold":
			Gold go = new Gold(grade, name, point);
			g = (Grade) go;
			break;
		case "vip":
			Vip v = new Vip(grade, name, point);
			g = (Grade) v;
			break;
		case "vvip":
			Vvip vv = new Vvip(grade, name, point);
			g = (Grade) vv;
			break;
		}
		return g;
	}
}

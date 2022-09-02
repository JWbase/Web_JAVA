package kr.or.iei.pointController;

import kr.or.iei.point.vo.Point;
import java.util.Scanner;

public class PointController {

	private Point[] points;
	private Scanner sc;
	private int index;

	// 매개변수 생성자
	public PointController() {
		points = new Point[10];
		sc = new Scanner(System.in);
		index = 0;
	} // PointController() end

	public void main() {

		while (true) {
			System.out.println("====== 포인트 관리 프로그램v1 ======");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 전체 회원 조회");
			System.out.println("3. 회원 1명 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원삭제");
			System.out.println("0. 프로그램 종료");

			int sel = sc.nextInt();

			switch (sel) {

			case 1:
				insertUser();
				break;
			case 2:
				printAllUser();
				break;
			case 3:
				printOneUser();
				break;
			case 4:
				updateUser();
				break;
			case 5:
				deleteUser();
				break;
			case 0:
				return;
			} // switch문 종료
		} // while문 종료
	} // main() 메소드 종료

	public void insertUser() {
		System.out.print("회원 등급 입력[silver] : ");
		String grade = sc.next();

		sc.nextLine();
		System.out.print("회원 이름 입력 : ");
		String name = sc.nextLine();

		System.out.print("회원 포인트 입력 : ");
		int point = sc.nextInt();

		Point p = new Point(grade, name, point);
		points[index++] = p;
		System.out.println("회원정보등록 완료");
	} // insertUser() 종료

	public void printAllUser() {
		System.out.println("====== 전체 회원 출력 ======");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("-----------------------------");

		for (int i = 0; i < index; i++) {
			System.out.println(points[i].getGrade() + "\t" + points[i].getName() + "\t" + points[i].getPoint() + "\t"
					+ (0.02 * (double) points[i].getPoint()));
		}
	} // printAllUser() 종료

	public int searchUserName(String searchName) {
		for (int i = 0; i < index; i++) {
			if (searchName.equals(points[i].getName())) {
				return i;
			}
		}
		return -1;
	} //searchUserName() 종료

	public void printOneUser() {

		System.out.println("====== 회원 정보 출력 ======");
		System.out.print("조회 할 회원 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchUserName(name);

		if (searchIndex == -1) {
			System.out.println("회원을 조회할 수 없습니다.");
		} else {
			Point p = points[searchIndex];
			System.out.println("등급 : " + p.getGrade());
			System.out.println("이름 : " + p.getName());
			System.out.println("포인트 : " + p.getPoint());
			System.out.println("보너스 : " + (0.02 * (double) p.getPoint()));
		}
	} // printOneUser() 종료

	public void updateUser() {
		System.out.println("====== 회원 정보 수정 ======");
		System.out.print("수정할 회원 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchUserName(name);

		if (searchIndex == -1) {
			System.out.println("회원 정보를 조회할 수 없습니다.");
		} else {
			System.out.print("수정할 회원 등급 입력[silver] : ");
			String updateGrade = sc.next();

			System.out.print("수정할 회원 이름 입력 : ");
			sc.nextLine();
			String updateName = sc.next();

			System.out.print("수정할 회원 포인트 입력 : ");
			int updatePoint = sc.nextInt();

			Point p = points[searchIndex];
			p.setGrade(updateGrade);
			p.setName(updateName);
			p.setPoint(updatePoint);
			System.out.println("정보 수정 완료!");
		}
	} // updateUser() 종료

	public void deleteUser() {
		System.out.println("====== 회원 정보 삭제 ======");
		System.out.print("삭제할 회원 이름 입력 : ");
		String name = sc.next();

		int searchIndex = searchUserName(name);

		if (searchIndex == -1) {
			System.out.println("회원 정보를 조회 할 수 없습니다.");
		} else {
			for (int i = searchIndex; i < index - 1; i++) {
				points[i] = points[i + 1];
			}
			System.out.println("회원정보 삭제 완료!");
		}
		index--;
	} // deleteUser() 종료
} // PointController class 종료
package kh.java.func;

import java.util.Scanner;

public class Ticketting {

	Scanner sc = new Scanner(System.in);

	int date;
	int place;
	int seatNum;
	int installment;
	int paySel;
	char grade;
	boolean booking; // 예매했으면 true , 안했으면 false
	String accountNum = "자바은행 : 118 - 12345 - 123456";

	public void start() {

		while (true) {
			System.out.println("------- 6월 콘서트 예매 -------");
			System.out.println();
			System.out.println("1. 콘서트장소 확인");
			System.out.println("2. 콘서트 예매하기");
			System.out.println("3. 예매내역 확인");
			System.out.println("4. 예매취소");
			System.out.println("5. 종료");
			System.out.print("선택 > ");

			int select = sc.nextInt();

			switch (select) {
			case 1:
				placeList();
				break;
			case 2:
				ticketOrder();
				break;
			case 3:
				orderList();
				break;
			case 4:
				cancle();
				break;
			case 5:
				return;
			} // 메뉴선택 switch문 end
		}
	} // start method end

	
	// 장소목록 메소드
	public void placeList() {
		System.out.println("======================= 6월 콘서트 장소 =======================");
		System.out.println("1. 서울    2. 부산    3. 강릉    4. 여수    5. 제주");
	}
	
	// 예매하기 메소드
	public void ticketOrder() {
		// 장소리스트 불러오기
		placeList();

		// 장소 선택
		System.out.print("장소를 선택해 주세요 : ");
		place = sc.nextInt();

		// 날짜 선택
		System.out.print("날짜를 선택해 주세요. [1 ~ 30일] : ");
		date = sc.nextInt();

		// 좌석 등급 및 자리 선택
		System.out.print("좌석을 선택해 주세요 [R석, S석, A석] : ");
		int gradeSel = sc.next().charAt(0);

		if (gradeSel == 'R' || gradeSel == 'r') {
			System.out.print("좌석 번호를 선택해 주세요 [ 1 ~ 5 ] : ");
			seatNum = sc.nextInt();
			grade = 'R';
		} else if (gradeSel == 'S' || gradeSel == 's') {
			System.out.print("좌석 번호를 선택해 주세요 [ 1 ~ 10 ] : ");
			seatNum = sc.nextInt();
			grade = 'S';
		} else if (gradeSel == 'A' || gradeSel == 'a') {
			System.out.print("좌석 번호를 선택해 주세요 : [ 1 ~ 20 ]");
			seatNum = sc.nextInt();
			grade = 'A';
		} else {
			System.out.println("올바른 좌석을 선택하세요.");
		}

		// 결제방법 선택
		System.out.print("결제방법을 선택해 주세요 [1. 카드결제  2. 무통장입금] : ");
		paySel = sc.nextInt();
		if (paySel == 1) {
			System.out.print("할부 개월을 선택하세요 (최대 12개월) : ");
			installment = sc.nextInt();
		} else {
			System.out.print("무통장 입금 계좌번호  : " + accountNum);
		}
		System.out.println();
		System.out.println("예매가 완료 되었습니다.");
		booking = true;
	} // ticket order end
	
	// 예매 내역 메소드
	public void orderList() {

		System.out.println("====== 티켓 예매 내역 ======");

		if (booking) {
			// 티켓팅 장소
			if (place == 1) {
				System.out.println("서울 콘서트");
			} else if (place == 2) {
				System.out.println("부산 콘서트");
			} else if (place == 3) {
				System.out.println("강릉 콘서트");
			} else if (place == 4) {
				System.out.println("여수 콘서트");
			} else if (place == 5) {
				System.out.println("제주 콘서트");
			}

			// 날짜 표시
			System.out.println("콘서트 날짜 : 2022년 6월 " + date + "일");

			// 좌석 표시
			System.out.println("좌석위치 : " + grade + "석 " + seatNum + "열");

			// 결제 방법 표시
			if (paySel == 1) {
				if (installment == 0) {
					System.out.println("결제방식 : 카드결제(일시불)");
				} else {
					System.out.println("결제방식 : 카드결제(" + installment + ")개월");
				}
			} else if (paySel == 2) {
				System.out.println("결제방식 : 무통장입금(" + accountNum + ")");
			}
		} else {
			System.out.println("예매 내역이 없습니다.");
		}
	} // 예매내역 메소드 end

	// 예매취소 메소드
	public void cancle() {
		System.out.print("예매를 취소하시겠습니까? (1. Yes / 2. No) ");
		int cancleNum = sc.nextInt();
		if (cancleNum == 1) {
			if (booking) {
				booking = false;
				System.out.println("예매가 취소되었습니다.");
			} else {
				System.out.println("예매 내역이 없습니다.");
			}
		}
	} // 예매취소 메소드 end
} // public class end
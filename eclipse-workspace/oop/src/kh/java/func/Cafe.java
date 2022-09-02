package kh.java.func;

import java.util.Scanner;

public class Cafe {

	int kind; // 1 : 아메리카노~~~~
	boolean temp; // true : 아이스 , falser : 핫
	boolean size; // true : tall, false: grande
	int shot; // 샷 갯수
	boolean money; // true : card, false : 현금
	boolean inOut; // true : 매장 , false : 테이크아웃
	int amount; // 구매수량

	Scanner sc = new Scanner(System.in);

	// 카페 운영시작 메소드
	public void start() {

		while (true) {
			System.out.println("-------------------");
			System.out.println("1. 메뉴판보기");
			System.out.println("2. 주문하기");
			System.out.println("3. 주문내역확인");
			System.out.println("4. 종료");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				showMenu();
				break;
			case 2:
				order();
				break;
			case 3:
				showLastOrder();
				break;
			case 4:
				System.out.println("안녕 ㅠㅠ");
				return;
			}
		}
	}

	public void showLastOrder() {

		System.out.println("====== 최근 주문 내역 ======");

		// 음료 종류 출력
		if (kind == 1) {
			System.out.println("상품명 : 아메키라노");
		} else if (kind == 2) {
			System.out.println("상품명 : 카페라떼");
		} else if (kind == 3) {
			System.out.println("상품명 : 카페모카");
		} else if (kind == 4) {
			System.out.println("상품명 : 아이스티");
		} else if (kind == 5) {
			System.out.println("상품명 : 카모마일");
		}

		// Ice or Hot 출력
		if (temp) {
			System.out.println("Ice");
		} else {
			System.out.println("Hot");
		}

		// size 출력
		if (size) {
			System.out.println("사이즈 : Tall");
		} else {
			System.out.println("사이즈 : Grande");
		}

		// shot 추가 횟수 출력
		if(kind != 5) {
			System.out.println(shot + "회");
		} else {
			
		}
		// 결제방식 출력
		if (money) {
			System.out.println("카드결제");
		} else {
			System.out.println("현금결제");
		}

		// 장소선택 출력
		if (inOut) {
			System.out.println("매장");
		} else {
			System.out.println("포장");
		}

		// 수량 출력
		System.out.println(amount + "개");
	}

	// 주문하기 메소드
	public void order() {
		showMenu();
		System.out.print("음료를 선택하세요 : ");
		kind = sc.nextInt();

		System.out.print("[1. Ice / 2. Hot] : ");
		int tempSel = sc.nextInt();
		if (tempSel == 1) {
			temp = true;
		} else {
			temp = false;
		}

		System.out.print("[1. Tall / 2. Grande] : ");
		int sizeSel = sc.nextInt();
		if (sizeSel == 1) {
			size = true;
		} else {
			size = false;
		}

		if (kind != 5) {
			System.out.print("샷추가 몇 번 하시겠습니까? : ");
			shot = sc.nextInt();
		}

		System.out.print("[1. 카드 / 2. 현금 ] : ");
		int moneySel = sc.nextInt();
		if (moneySel == 1) {
			money = true;
		} else {
			money = false;
		}

		System.out.print("[1. 매장 / 2. 포장 ] : ");
		int inOutSel = sc.nextInt();
		if (inOutSel == 1) {
			inOut = true;
		} else {
			inOut = false;
		}

		System.out.print("수량을 입력하세요 : ");
		amount = sc.nextInt();
		System.out.println("주문이 완료되었습니다.");
		brewing();
	} // order method end

	public void brewing() {
		System.out.println("    o");
		delay(1500);
		System.out.println("    o");
		delay(1300);
		System.out.println("    o");
		delay(1100);
		System.out.println("    o");
		delay(900);
		System.out.println("    o");
		delay(700);
		System.out.println("│~~~~~~~├─┐");
		System.out.println("│       │ │");
		System.out.println("│       ├─┘");
		System.out.println("│       │");
		System.out.println("└───────┘");
		System.out.println("음료 나왔습니다.");
	}

	public void delay(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 메뉴판 출력 메소드
	public void showMenu() {
		System.out.println("----------------음료-----------------");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 카페모카");
		System.out.println("4. 아이스티");
		System.out.println("5. 카모마일");
	}
} // Cafe class end

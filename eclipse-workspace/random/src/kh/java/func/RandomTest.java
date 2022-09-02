package kh.java.func;

import java.util.Scanner;
import java.util.Random;

public class RandomTest {

	public void test1() {

		// 난수 : 임의의 값 / 무작위로 만들어지는 알 수 없는 값
		// 자바에서 난수를 제공하는 기능 : Random
		// Random 사용법
		// 1) import java.util.Random;
		// 2) Random r = new Random();

		Random r = new Random();
		int num = r.nextInt(); // int 범위 내의 랜덤숫자 1개 가져옴
		System.out.println(num);

		// random수의 범위를 지정하는법

		int num1 = r.nextInt(10); // 0부터 10개중 랜덤1개 가져옴
		System.out.println(num1);

		int num2 = r.nextInt(16); // 0 ~ 15
		System.out.println(num1);

		int num3 = r.nextInt(21) + 10; // 10 ~ 30
		System.out.println(num2);

		// r.nextInt(랜덤후보갯수) + 시작숫자;

		int num4 = r.nextInt(16) + 20; // 20 ~ 35
	}

	public void coin() {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int win = 0; // 정답맞춘 횟수 저장용 변수
		int lose = 0; // 틀린 횟수 저장용 변수
		while (true) {
			System.out.println("======== 동전 앞 / 뒤 맞추기 ========");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.println("선택 > ");
			int sel = sc.nextInt();

			if (sel == 1) {

				// 랜덤숫자로 1 or 2를 저장
				// 1 : 앞면, 2 : 뒷면

				int coin = r.nextInt(2) + 1;

				// user에게 앞면 / 뒷면 선택(1 / 2)
				System.out.print("선택하세요 (1. 앞면 / 2. 뒷면) : ");
				int userSelect = sc.nextInt();

				if (coin == userSelect) {
					win++;
					System.out.println("정답입니다.");
				} else {
					lose++;
					System.out.println("땡!!!!!!");
				}
			} else if (sel == 2) {
				System.out.println("----- Game Score -----");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
			} else if (sel == 3) {
				System.out.println("게임종료");
				break;
			}
		} // while문
	}

	public void test2() {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int win = 0;
		int lose = 0;

		while (true) {
			System.out.println("======== 가위 바위 보 게임 ========");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.println("선택 > ");
			int sel = sc.nextInt();

			if (sel == 1) {

				int rsp = r.nextInt(3) + 1;

				System.out.print("숫자를 선택하세요 (1. 가위 / 2. 바위 / 3. 보) : ");
				int userSelect = sc.nextInt();
				System.out.println("======== 결과 ========");

				if (userSelect == 1) {
					System.out.println("당신은 가위를 냈습니다.");
				} else if (userSelect == 2) {
					System.out.println("당신은 바위를 냈습니다.");
				} else if (userSelect == 3) {
					System.out.println("당신은 보를 냈습니다.");
				}

				if (rsp == 1) {
					System.out.println("컴퓨터는 가위를 냈습니다.");
				} else if (rsp == 2) {
					System.out.println("컴퓨터는 바위를 냈습니다.");
				} else {
					System.out.println("컴퓨터는 보를 냈습니다.");
				}

				System.out.println("=========================");
				if (userSelect == rsp) {
					System.out.println("비겼습니다.");
				} else if ((userSelect == 1 && rsp == 2) || (userSelect == 2 && rsp == 3)
						|| (userSelect == 3 && rsp == 1)) {
					lose++;
					System.out.println("당신이 졌습니다. ㅋ");
				} else {
					win++;
					System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
				}

			} else if (sel == 2) {
				System.out.println("----- Game Score -----");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
			} else if (sel == 3) {
				System.out.println("게임종료");
				break;
			}
		} // while괄호
	}

	public void test3() {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int score = 0;

		while (true) {

			System.out.println("===== Up & Down Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.println("선택 > ");

			int sel = sc.nextInt();

			if (sel == 1) {

				int updown = r.nextInt(99) + 1;

				System.out.println("<< Game Start >>");

				for (int i = 1;; i++) {
					System.out.print(i + " 회차 번호 입력 : ");
					int userNum = sc.nextInt();
					if (userNum >= 100) {
						System.out.println("입력범위 오류");
						i--;
						continue;
					}
					if (userNum == updown) {
						System.out.println("<< 정답 >>");

						if (score > i || score == 0) {
							score = i;
						}
						break;
					} else if (userNum > updown) {
						System.out.println("<< Down >>");
					} else {
						System.out.println("<< UP >>");
					}

				}
			} else if (sel == 2) {
				if (score == 0) {
					System.out.println("아직 기록이 없습니다.");
				} else {
					System.out.println("현재 최고 기록은 " + score + "회 입니다.");
				}
			} else if (sel == 3) {
				break;
			}
		} // while 괄호
	}

	public void test4() {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		System.out.println("<< Game Start >>");

		while (true) {
			int brNum = 0;
			int userNum = 0;
			while (true) {

				System.out.println("<< Your Turn >>");
				System.out.print("Input Number : ");
				userNum = sc.nextInt();
				if (1 <= userNum && userNum <= 3) {
					break;
				} else {
					System.out.println("1 ~ 3 사이 값을 입력해주세요.");
				}
			}

			for (int i = brNum + 1; i <= brNum + userNum; i++) {
				System.out.println(i + "!");
				brNum += userNum;
				if (i >= 31) {
					break;
				}
			}
			if (brNum >= 31) {
				System.out.println("패배ㅠㅠ");
				break;
			}
			System.out.println("<< Computer Turn >>");
			int comNum = r.nextInt(3) + 1;
			for (int i = brNum + 1; i <= brNum + comNum; i++) {
				System.out.println(i + "!");
				brNum += comNum;
				if (i > 31) {
					System.out.println("승리 !!!!");
					break;
				}
			}
		} // 가장 밖 while 괄호
	}
}
package kh.java.func;

import java.util.Scanner;
import java.util.Random;

public class RandomTestSample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean isEnd = false; // 전체 게임 종료를 위한 변수
		int win = 0; // 승리 기록용 변수
		int lose = 0; // 패배 기록용 변수

		while (true) {

			System.out.println("==== BR31 ====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.println("선택 > ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("<< Gmae Start >>");
				int num = 0; // 사이클 돌때를 위한 변수 설정
				while (true) {
					System.out.println("<< Your Turn >>");
					int userNum = 0;
					while (true) {
						System.out.print("Input Number : ");
						userNum = sc.nextInt();
						if (1 <= userNum && userNum <= 3) {
							break;
						} else {
							System.out.println("잘못입력하셨습니다. 1 ~ 3 사이의 수를 입력하세요.");
						}
					}
					for (int i = 0; i < userNum; i++) {
						num++;
						System.out.println(num + "!");
						if (num == 31) {
							System.out.println("패배!");
							lose++;
							break; // 사용자 출력용 for break
						}
					}
					if (num == 31) {
						break; // 게임 반복문 break;
					}
					System.out.println("<< Computer Turn >>");
					int comNum = r.nextInt(3) + 1;
					for (int i = 0; i < comNum; i++) {
						num++;
						System.out.println(num + "!");
						if (num == 31) {
							System.out.println("승리!");
							win++;
							break;
						}
					}
					if (num == 31) {
						break;
					}
				} // while문
				break; // switch종료 break
			case 2:
				System.out.println("<< 당신의 전적 >>");
				System.out.println("win : " + win);
				System.out.println("lose : " + lose);
				break; // switch종료 break
			case 3:
				isEnd = true;
				break; // switch종료 break
			}
			if (isEnd) {
				break;
			}
		}
	}
}
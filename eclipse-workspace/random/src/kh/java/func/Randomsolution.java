package kh.java.func;

import java.util.Scanner;

import java.util.Random;

public class Randomsolution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int score = 0;
		while (true) {
			System.out.println("==== Up & Down Game ====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.println("선택 > ");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println("<< Game Start >>");
				int num = r.nextInt(99) + 1;
				System.out.println("번호 입력 : ");
				int count = 1;
				while (true) {
					System.out.print(count + "회차 번호 입력 : ");
					int userNum = sc.nextInt();
					if (num > userNum) {
						System.out.println(" << UP >>");
					} else if (num < userNum) {
						System.out.println(" << DOWN >>");
					} else {
						if (score > count || score == 0) {
							score = count;
						}
						System.out.println(" << 정답 >>");
						break;
					}
					count++;
				}
			} else if (sel == 2) {
				if (score == 0) {
					System.out.println("아직 기록이 없습니다.");
				} else {
					System.out.println("최고기록은 " + score + "회 입니다.");
				}
			} else if (sel == 3) {
				System.out.println("Bye~");
				break;
			}
		}
	}

}
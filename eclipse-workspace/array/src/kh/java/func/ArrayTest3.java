package kh.java.func;

import java.util.Scanner;
import java.util.Random;

public class ArrayTest3 {

	public void motel() {

		Scanner sc = new Scanner(System.in);

		boolean room[] = new boolean[10];
		while (true) {
			// boolean[] 0,1만 사용할 때 훨씬 편함 false 빈방, true 손님이 있는방
			// rooms[selectRoom-1] == 1
			// 정수배열 선언 길이 10
			// 배열의 각 index가 방을 의미
			// 0인 경우 빈방
			// 1인 경우 손님이 있는 방
			System.out.println("모텔관리프로그램 v1.0");
			System.out.println("1. 입실\t 2. 퇴실\t 3. 방보기\t 4. 종료");
			System.out.print("선택 > ");

			int select = sc.nextInt();

			//
			if (select == 1) {
				System.out.print("몇번방에 입실하시겠습니까?");
				int choice = sc.nextInt(); // choice 변수 선언하고 입력 메소드 nextInt선언
				if (room[choice - 1]) {
					System.out.println(choice + "번방에는 손님이 있습니다.");
				} else {
					room[choice - 1] = true;
				}
			} else if (select == 2) {
				System.out.println("몇번방에서 퇴실하시겠습니까?");
				int choice = sc.nextInt();
				if (room[choice - 1]) {
					room[choice - 1] = false;
					System.out.println(choice + "번방에서 퇴실하였습니다.");
				} else {
					System.out.println(choice + "번방은 현재 빈 방입니다.");
				}
			} else if (select == 3) {
				for (int i = 0; i < room.length; i++) {
					if (room[i]) {
						System.out.println((i + 1) + "번방에는 현재 손님이 있습니다.");
					} else {
						System.out.println((i + 1) + "번방이 현재 비어있습니다.");
					}
				}
			}
			if (select == 4) {
				break;
			}
		} // 전체 while end
	} // motel method end
} // public class end
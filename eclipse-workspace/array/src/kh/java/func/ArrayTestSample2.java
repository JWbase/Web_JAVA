package kh.java.func;

import java.util.Scanner;
import java.util.Random;

public class ArrayTestSample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("모텔관리프로그램 v1.0");
		System.out.println("1.입실\t2.퇴실\t3.방보기\t4.종료");
		System.out.print("선택 > ");
		int select = sc.nextInt();

		int rooms[] = new int[10];
		if (select == 3) {
			for (int i = 0; i < rooms.length; i++) {
				if (rooms[i] == 0) {
					System.out.println(i+1 + "번방이 현재 비어있습니다.");
				} else {
					System.out.println(i+1 + "번방에는 손님이 있습니다.");
				}
			}
		}
	} // method end
} // class end
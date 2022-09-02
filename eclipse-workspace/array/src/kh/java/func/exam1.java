package kh.java.func;

import java.util.Scanner;

public class exam1 {

	public exam1() {
		super();
	}

	public void test1() {

		int array[][] = new int[9][5];

		Scanner sc = new Scanner(System.in);

		// 배열의 길이
		System.out.print("과목명을 입력 하세요 : ");
		
		System.out.print("시작 교시를 입력하세요(1 ~ 7) : ");
		int start = sc.nextInt();
		System.out.print("학점을 입력하세요 : ");
		int grade = sc.nextInt();
		System.out.print("요일을 입력하세요 : ");
		String day = sc.next();
		switch (day) {
		case "월":
			for (int i = start - 1; i < start - 1 + grade; i++) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][0] = 1;
				}
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if (array[i][j] == 1) {
						System.out.print("■ ");
					} else {
						System.out.print("□ ");
					}
				}
				System.out.println();
			}
			break;
		case "화":
			for (int i = start - 1; i < start - 1 + grade; i++) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][1] = 1;
				}
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if (array[i][j] == 1) {
						System.out.print("■ ");
					} else {
						System.out.print("□ ");
					}
				}
				System.out.println();
			}
			break;
		case "수":
			for (int i = start - 1; i < start - 1 + grade; i++) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][2] = 1;
				}
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if (array[i][j] == 1) {
						System.out.print("■ ");
					} else {
						System.out.print("□ ");
					}
				}
				System.out.println();
			}
			break;
		case "목":
			for (int i = start - 1; i < start - 1 + grade; i++) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][3] = 1;
				}
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if (array[i][j] == 1) {
						System.out.print("■ ");
					} else {
						System.out.print("□ ");
					}
				}
				System.out.println();
			}
			break;
		case "금":
			for (int i = start - 1; i < start - 1 + grade; i++) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][4] = 1;
				}
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if (array[i][j] == 1) {
						System.out.print("■ ");
					} else {
						System.out.print("□ ");
					}
				}
				System.out.println();
			}
			break;
		}
	}
}
package kh.java.func;

import java.util.Scanner;

public class Kakao {

	public void test1() {

		Scanner sc = new Scanner(System.in);

		// 배열의 길이
		int size = 5;
		int map1[][] = new int[size][size];
		int map2[][] = new int[size][size];

		int arr1[] = { 9, 20, 28, 18, 11 };
		int arr2[] = { 30, 1, 21, 17, 28 };

		for (int i = 0; i < arr1.length; i++) {
			int num = arr1[i];
			for (int j = 0; j < size; j++) {
				map1[i][j] = num % 2;
				num = num / 2;
			}
		}
		
		System.out.println("map1 출력");
		for (int i = 0; i < map1.length; i++) {
			for (int j = size - 1; j >=0; j--) {
				if (map1[i][j] == 0) {
					System.out.print("-");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}

	} // test1 end

	public void test2() {

		// 배열의 길이
		int size = 5;
		int map1[][] = new int[size][size];
		int map2[][] = new int[size][size];
		int result[][] = new int[size][size];

		int arr1[] = { 9, 20, 28, 18, 11 };
		int arr2[] = { 30, 1, 21, 17, 28 };

		for (int i = 0; i < arr1.length; i++) {
			int num = arr1[i];
			for (int j = size - 1; j >= 0; j--) {
				map1[i][j] = num % 2;
				num = num / 2;
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			int num = arr2[i];
			for (int j = size - 1; j >= 0; j--) {
				map2[i][j] = num % 2;
				num = num / 2;
			}
		}
		// 최종결과
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if (map1[i][j] == 1 || map2[i][j] == 1) {
					result[i][j] = 1;
				} else {
					result[i][j] = 0;
				}
			}
		}
		System.out.println("map1 출력");
		for (int i = 0; i < map1.length; i++) {
			for (int j = 0; j < map1[i].length; j++) {
				if (map1[i][j] == 0) {
					System.out.print("-");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}

		System.out.println("map2 출력");
		for (int i = 0; i < map2.length; i++) {
			for (int j = 0; j < map2[i].length; j++) {
				if (map2[i][j] == 0) {
					System.out.print("-");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}

		System.out.println("result 출력");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				if (result[i][j] == 0) {
					System.out.print("-");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	} // test2 end
}
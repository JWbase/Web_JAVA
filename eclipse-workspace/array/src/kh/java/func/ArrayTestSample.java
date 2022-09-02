package kh.java.func;

import java.util.Scanner;
import java.util.Random;

public class ArrayTestSample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("===== 로또 프로그램 =====");
		int[] userNum = new int[6]; // 사용자번호
		for (int i = 0; i < userNum.length; i++) {
			System.out.print((i + 1) + "번째 번호 입력 : ");
			userNum[i] = sc.nextInt();
			// 사용자입력숫자는 1 ~ 45 사이값인지
			// 이전에 입력을 했던 번호인지

			// 1) 1 ~ 45인지
			if (userNum[i] < 1 || userNum[i] > 45) {
				System.out.println("잘못입력하셨습니다. 1~45 중 한개를 입력하세요.");
				i--; // 해당 index값을 다시 입력받아야하므로 continue전에 미리 -1 해둠
				continue;
			}
			// 2) 중복체크
			for (int j = 0; j < i; j++) { // 지금 입력받은 인덱스 번호 이전까지만 검사
				if (userNum[i] == userNum[j]) {
					System.out.println("이미 중복된 번호입니다.");
					i--; // 중복인 경우 해당값을 다시 입력받아야하기 때문에
					break;
				}
			}
		}
		int[] comNum = new int[6];
		for (int i = 0; i < comNum.length; i++) {
			comNum[i] = r.nextInt(45) + 1;
			// 컴퓨터 번호 중복체크
			for (int j = 0; j < i; j++) {
				if (comNum[i] == comNum[j]) {
					i--;
					break;
				}
			}
		}
		// 사용자번호 정렬

		for (int i = 0; i < userNum.length - 1; i++) {
			for (int j = 0; j < userNum.length - 1 - i; j++) {
				if (userNum[j] > userNum[j+1]) {
					int tmp = userNum[j];
					userNum[j] = userNum[j + 1];
					userNum[j + 1] = tmp;
				}
			}
		}
		// 컴퓨터 번호 정렬

		for (int i = 0; i < comNum.length - 1; i++) {
			for (int j = 0; j < comNum.length - 1 - i; j++) {
				if (comNum[j] > comNum[j+1]) {
					int tmp = comNum[j];
					comNum[j] = comNum[j + 1];
					comNum[j + 1] = tmp;
				}
			}
		}
		int cnt = 0; // 일치하는 번호 카운팅용 변수
		// 유저번호, 컴퓨터번호 일치하는 갯수 카운팅
		for (int i = 0; i < userNum.length; i++) {
			for (int j = 0; j < comNum.length; j++) {
				if (userNum[i] == comNum[j]) {
					cnt++;
					break;
				}
			}
		}
		// 최종출력
		System.out.println("최종 결과");
		System.out.print("사용자 번호 : ");
		for (int i = 0; i < userNum.length; i++) {
			System.out.print(userNum[i] + "  ");
		}
		System.out.println();
		System.out.print("당첨 번호 : ");
		for (int i = 0; i < comNum.length; i++) {
			System.out.print(comNum[i] + "  ");
		}
		System.out.println();
		System.out.println("맞은 갯수 : " + cnt);
		switch(cnt) {
		case 6 :
			System.out.println("1등!");
			break;
		case 5 :
			System.out.println("2등!");
			break;
		case 4 :
			System.out.println("3등!");
			break;
		case 3 :
			System.out.println("4등!");
			break;
		default :
			System.out.println("꽝!!!");
			break;
		}
	} // method end
} // class end
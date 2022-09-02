package kh.java.func;

import java.util.Scanner;
import java.util.Random;

public class ArrayTest {
	public void test1() {

		// 정수형변수 5개를 선언한 후 1/2/3/4/5/를 저장하고 출력
		int num0 = 1;
		int num1 = 2;
		int num2 = 3;
		int num3 = 4;
		int num4 = 5;
		System.out.println("변수를 이용한 값 출력");
		System.out.println(num0);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

		// 정수형 배열 이용해서 5개 값 저장 후 출력
		// 정수 5개를 저장 할 수 있는 배열 선언
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println("배열을 이용한 값 출력");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// 배열의 경우 반복문을 이용해서 출력 가능
		System.out.println("반복문을 이용한 배열 출력");
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
	} // test1 end

	public void test2() {

		// 배열에 데이터 1,2,3,4,5, 넣기
		// 1) 길이가 5인 배열 선언 후 인덱스번호로 데이터 넣기
		int arr1[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println(arr1[i]);
		} // for end
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;

		// 인덱스번호를 이용한 값대입 후 출력
		for (int i = 0; i < 5; i++) {
			System.out.println(arr1[i]);
		}

		// 2) 배열 선언 시 동시에 값 대입
		int arr2[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < 5; i++) {
			System.out.println(arr2[i]);
		}
	} // test2 end

	public void test3() {
		// 배열에 "hi" , "Hello", "bye" 를 대입
		// 1) 길이가 3인 배열을 선언하여 인덱스 이용해서 대입

		String arr1[] = new String[3];
		arr1[0] = "hi";
		arr1[1] = "Hello";
		arr1[2] = "bye";
		for (int i = 0; i < 3; i++) {
			System.out.println(arr1[i]);
		}
		String arr2[] = { "hi", "Hello", "bye" };
		System.out.println(arr2[0]);
	} // test3 end

	public void test4() {

		// 길이가 4인 정수형 배열 선언
		// 스캐너를 이용해서 국어점수, 수학점수, 영어점수를 입력 받아서 배열에 저장
		// 배열 마지막 공간에는 합계를 저장
		// 출력 국어점수/ 수학점수/ 영어점수/ 합계/ 평균
		// 국어 : 80 / 수학 : 50 / 영어 : 30 / 합계 : 160 / 평균 : 53.33

		Scanner sc = new Scanner(System.in);

		int arr1[] = new int[4];
		System.out.print("국어점수를 입력해주세요 : ");
		arr1[0] = sc.nextInt();

		System.out.print("수학점수를 입력해주세요 : ");
		arr1[1] = sc.nextInt();

		System.out.print("영어점수를 입력해주세요 : ");
		arr1[2] = sc.nextInt();

		arr1[3] = arr1[0] + arr1[1] + arr1[2];

		double avg = (double) arr1[3] / 3;

		System.out.printf("국어 : %d / 수학 : %d / 영어 : %d / 합계 : %d / 평균 %.2f ", arr1[0], arr1[1], arr1[2], arr1[3], avg);
	} // test4 end

	public void test5() {

		// 길이 100인 정수형 배열 선언
		// 1~100까지값 순서대로 대입 후 출력
		int arr1[] = new int[100];
		for (int i = 0; i < 100; i++) {
			System.out.println(arr1[i] = i + 1);
		}
	} // test5 end

	public void test6() {

		// 길이가 5인 정수형 배열을 선언
		// 스캐너를 + for문이용하여 정수 5개 입력받은 후 입력 받은 정수 출력
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			System.out.print("정수를 입력하세요 : ");
			arr1[i] = sc.nextInt();
		}
		/*
		 * for (int i = 0; i < 4; i++) { if (arr1[i] > arr1[i + 1]) { int temp =
		 * arr1[i]; arr1[i] = arr1[i + 1]; arr1[i + 1] = temp; } }
		 * 
		 * for (int i = 0; i < 3; i++) { if (arr1[i] > arr1[i + 1]) { int temp =
		 * arr1[i]; arr1[i] = arr1[i + 1]; arr1[i + 1] = temp; } }
		 */

		// Bubble sort
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int j = 0; j < arr1.length - 1 - i; j++) {
				if (arr1[j] < arr1[j + 1]) {
					int temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}
			}
		}
		/*
		 * // 배열 0번째 값과 배열 1번째 값을 비교해서 0번째가 큰 경우 두 수의 자리를 변경
		 * 
		 * if (arr1[0] > arr1[1]) { int tmp = arr1[0]; // tmp 변수에 첫번째 값 넣기 arr1[0] =
		 * arr1[1]; // 첫번째 변수에 두번째 값 넣기 arr1[1] = tmp; // 두번째 값 첫번째 값 넣기 }
		 * 
		 * // 1번째 2번째 비교해서 자리변경 if (arr1[1] > arr1[2]) { int tmp = arr1[1]; // tmp 변수에
		 * 두번째 값 넣기 arr1[1] = arr1[2]; arr1[2] = tmp; }
		 * 
		 * // 2번째 3번째 비교해서 자리변경 if (arr1[2] > arr1[3]) { int tmp = arr1[2]; arr1[2] =
		 * arr1[3]; arr1[3] = tmp; } // 3번째 4번째 비교해서 자리변경 if (arr1[3] > arr1[4]) { int
		 * tmp = arr1[3]; arr1[3] = arr1[4]; arr1[4] = tmp; }
		 */
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
	} // test6 end

	public void exam1() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		System.out.println("====== 로또 프로그램 ======");
		int user[] = new int[6];
		for (int i = 0; i < user.length; i++) {
			System.out.print((i + 1) + "번째 번호 입력 (1~45) : ");
			user[i] = sc.nextInt();
			if (!(user[i] >= 1 && user[i] <= 45)) {
				System.out.println("잘못입력하셨습니다. 1~45 중 한개를 입력해주세요.");
				i--; // continue는 증감문
				continue;
			}
			for (int j = 0; j < i; j++) {
				if (user[i] == user[j]) {
					System.out.println("이미 중복된 번호입니다. 다시 입력해 주세요.");
					i--;
					break;
				}
			}
		} // n번째 번호입력 for문

		for (int i = 0; i < user.length - 1; i++) {
			for (int j = 0; j < user.length - 1 - i; j++) {
				if (user[j] > user[j + 1]) {
					int temp = user[j];
					user[j] = user[j + 1];
					user[j + 1] = temp;
				}
			}
		} // user 오름차순정렬 for문

		System.out.println("===== 최종결과 =====");
		System.out.println("사용자 번호");
		for (int i = 0; i < user.length; i++) {
			System.out.print(user[i] + "  ");
		}
		System.out.println();
		System.out.println("컴퓨터 번호");
		int com[] = new int[6];
		for (int i = 0; i < com.length; i++) {
			com[i] = r.nextInt(6) + 1;

			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		} // com 중복체크 for문

		for (int i = 0; i < com.length - 1; i++) {
			for (int j = 0; j < com.length - 1 - i; j++) {
				if (com[j] > com[j + 1]) {
					int temp = com[j];
					com[j] = com[j + 1];
					com[j + 1] = temp;
				}
			}
		} // com 오름차순 정렬 for문

		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i] + "  ");
		}
		System.out.println();
		int count = 0;
		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < user.length; j++) {
				if (com[i] == user[j]) {
					count++;
					break;
				}
			}
		} // com == user 카운트 for문

		System.out.println("맞은 갯수 : " + count);
		switch (count) {
		case 3:
			System.out.println("4등");
			break;
		case 4:
			System.out.println("3등");
			break;
		case 5:
			System.out.println("2등");
			break;
		case 6:
			System.out.println("1등");
			break;
		default:
			System.out.println("꽝");
			break;
		} // 카운팅 switch 문
	} // exam1 end

	public void motel() {

		Scanner sc = new Scanner(System.in);

		int room[] = new int[10];
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
				if (room[choice - 1] == 1) {
					System.out.println(choice + "번방에는 손님이 있습니다.");
				} else {
					room[choice - 1] = 1;
				}
			} else if (select == 2) {
				System.out.println("몇번방에서 퇴실하시겠습니까?");
				int choice = sc.nextInt();
				if (room[choice - 1] == 1) {
					room[choice - 1] = 0;
					System.out.println(choice + "번방에서 퇴실하였습니다.");
				} else {
					System.out.println(choice + "번방은 현재 빈 방입니다.");
				}
			} else if (select == 3) {
				for (int i = 0; i < room.length; i++) {
					if (room[i] == 1) {
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
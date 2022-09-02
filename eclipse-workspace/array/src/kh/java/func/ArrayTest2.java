package kh.java.func;

public class ArrayTest2 {

	public void test1() {

		// 얉은 복사 : 배열을 복사해도 같은 데이터를 참조함. 하나의 배열을 변경하면 둘다 변경됨.

		int arr1[] = { 1, 2, 3, 4, 5 };
		System.out.println(arr1[2]); // 3출력
		System.out.println(arr1[3]); // 4출력
		int arr2[] = arr1;
		System.out.println(arr2[4]); // 5출력
		arr1[4] = 100;
		System.out.println(arr1[4]); // 100출력
		System.out.println(arr2[4]); // 100출력
		arr2[0] = 10;
		System.out.println(arr2[0]); // 10출력
		System.out.println(arr1[0]); // 10출력
	} // test1 end

	public void test2() {

		// 깊은 복사 :

		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		// 1) 배열을 생성해서 제어문을 통한 직접 복사
		// 1-1) 원본 배열과 동일한 길이의 배열 생성
		int arr2[] = new int[arr1.length]; // 첫번째 배열과 동일한 배열을 만들기 위해 length사용

		// 1-2) for문을 통한 데이터 복사
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		arr1[2] = 100;
		arr2[3] = 200;
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		// 2) system.arraycopy 사용(배열의 일부 데이터만 복사가능)
		// 2-1) 원본배열과 길이가 같은 배열 선언
		int arr3[] = new int[arr1.length];
		// System.arraycopy( 1)원본배열, 2)원본배열의 복사시작 위치, 3)데이터가 복사될 배열, 4)데이터가 복사될 배열 중
		// 데이터가 들어갈 시작위치, 5)복사할 길이)

		System.arraycopy(arr1, 2, arr3, 1, 2);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		// arr4 배열 생성
		int arr4[] = new int[arr2.length];

		System.arraycopy(arr2, 2, arr4, 2, 4);
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
		System.out.println();
		// 3) clone();
		int arr5[] = arr1.clone();
		for (int i = 0; i < arr5.length; i++) {
			System.out.print(arr5[i] + " ");
		}
		System.out.println();
	} // test2 end

	public void test3() {
		// 2차원배열 생성
		int arr[][] = new int[2][3];
		int k = 1;
		arr[0][0] = k++;
		arr[0][1] = k++;
		arr[0][2] = k++;
		arr[1][0] = k++;
		arr[1][1] = k++;
		arr[1][2] = k++;

		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int arr2[][] = new int[2][3];
		int num = 1;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = num++;
			}
		}
		// 출력
		System.out.print(arr2[0][0] + " ");
		System.out.print(arr2[0][1] + " ");
		System.out.print(arr2[0][2] + " ");
		System.out.println();
		System.out.print(arr2[1][0] + " ");
		System.out.print(arr2[1][1] + " ");
		System.out.print(arr2[1][2] + " ");
		System.out.println();

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	} // test3 end

	public void test4() {

		int arr[][] = new int[5][5];

		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	} // test4 end

	public void test5() {

		int arr[][] = new int[5][5];

		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i % 2 == 0) {
					arr[i][j] = num++;
				} else {
					arr[i][4 - j] = num++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	} // test5 end

	public void test6() {

		int arr[][] = new int[5][5];

		int num = 25;
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	} // test6 end

	public void test7() {

		int arr[][] = new int[5][5];

		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[j][i] = num++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	} // test7 end

	public void test8() {

		int arr[][] = new int[5][5];

		int num = 25;
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[j][i] = num--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	} // test8 end

	public void test9() {

		int arr[][] = new int[5][5];

		int num = 1;
		int row = 1;
		int col = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	} // test9 end
}
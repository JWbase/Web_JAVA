package kh.java.func;

public class ForExam3 {

	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
				for (int j = 0; (i < 5) ? j < i+1 : j < 9 - i; j++) {
					System.out.print("*");
				}
				System.out.println();
		}
	}
}

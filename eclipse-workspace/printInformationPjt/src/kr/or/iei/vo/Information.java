package kr.or.iei.vo;

public class Information {

	public void printInfo() {
		
		for(int i = 5; i > 0; i--) {
			for(int j = 0; i > j; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
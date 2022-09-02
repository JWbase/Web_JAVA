package kh.java.func;

public class ForExam2 {

	public void exam1() {
		
		for(int i = 0; i < 5; i++) {
			System.out.print("*");
		}
	}
	
	public void exam2() {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("*");
		}
	}
	
	public void exam3() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void exam4() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
	
	public void exam5() {
		for (int j = 0; j < 5; j++) {
			System.out.println(j+1);
		}
		System.out.println();
	}
	
	public void exam6() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(i+j+1);
			}
			System.out.println();
		}
	}
	
	public void exam7() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(j-i+5);
			}
			System.out.println();
		}
	}
	
	public void exam8() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void exam9() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 ; j++) {
				if(i+j >= 5) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void exam9_2() {
		for (int i = 0; i <5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	public void exam10() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i <= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void exam11() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i + j > 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void exam12() {
		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int j = 0;(i<5) ? j < i+1 : j < 9 - i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
	public void exam13() {
		for(int i = 5; i > 0; i--) {
			for(int j = 0; i > j; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 2; i <= 5; i++) {
			for(int j = 0; i > j; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void exam14() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			} 
			for (int j = 0; j < (2*i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
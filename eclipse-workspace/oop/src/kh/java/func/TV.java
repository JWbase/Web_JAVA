package kh.java.func;

public class TV {
	// 속성 : 해당클래스의 전역변수
	public int size; // TV사이즈
	public boolean power; // 전원
	public int ch; // 채널
	public int vol; // 볼륨

	// 현재 power변수의 값을 반대로 변경(on -> off , off -> on)
	public void power() {
		power = !power;
		if (power) {
			System.out.println("전원이 켜졌습니다.");
		} else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}

	// 현재 ch변수 값을 1증가(현재 채널번호에서 1증가한 번호로 변경)
	public void chUp() {
		ch++;
		System.out.println("현재 채널 번호 : " + ch);
	}

	// 현재 ch변수 값을 1감소(현재 채널번호에서 1감소한 번호로 변경)
	public void chDown() {
		ch--;
		System.out.println("현재 채널 번호 : " + ch);
	}

	// 현재 vol변수 값을 1증가(현재 볼륨값에서 1증가한 값으로 변경)
	public void volUp() {
		vol++;
		System.out.println("현재 볼륨 : " + vol);
	}

	// 현재 vol변수 값을 1감소(현재 볼륨값에서 1감소한 값으로 변경)
	public void volDown() {
		vol--;
		System.out.println("현재 볼륨 : " + vol);
	}
}
package kh.java.func;

import java.awt.Window.Type;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ApiTest {
	public void math() {

		//객체를 생성하지않고 바로 사용
		System.out.println(Math.abs(10)); // 절대 값
		System.out.println(Math.abs(-10)); // 절대 값

		//올림, 버림, 반올림
		System.out.println(Math.ceil(10.1)); // 소수 첫자리에서 올림 -> 11
		System.out.println(Math.floor(10.9)); // 소수 첫자리에서 버림
		System.out.println(Math.round(10.5));
		System.out.println(Math.round(10.4));
		//1.3456 -> 소수 3째자리 반올림 1.35
		//1.3456 -> 134.56 -> 135
		System.out.println(Math.round(1.3456 * 100) / (double) 100);
		// 숫자비교
		System.out.println(Math.max(50, 30)); // 매개변수로 전달한 두 수 중 큰 수 리턴
		System.out.println(Math.min(50, 30));
	}

	public void date() {
		Date today = new Date();
		System.out.println(today);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String todayStr = format1.format(today);
		System.out.println(todayStr);
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초 EEE요일");
		todayStr = format2.format(today);
		System.out.println(todayStr);
	}

	public void calendar() {
		Calendar today = Calendar.getInstance();
		//Calendar 클래스의 생성자의 접근제어지시자가 protect
		//getInstance()메소드를 통해서만 객체 생성이 가능
		//정보가져오는 방법 today.get(정보종류);
		System.out.println(today.get(Calendar.YEAR)); // 년도
		System.out.println(today.get(Calendar.MONTH) + 1); // 월
		System.out.println(today.get(Calendar.DATE)); // 일
		System.out.println(today.get(Calendar.AM_PM));
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		System.out.println(today.get(Calendar.MILLISECOND));
		System.out.println(today.get(Calendar.DAY_OF_WEEK)); //요일
		System.out.println("-----------------------------------------------------------");
		Calendar day1 = Calendar.getInstance();
		System.out.println(day1.get(Calendar.MONTH) + 1);
		System.out.println(day1.get(Calendar.DATE));
		System.out.println(day1.get(Calendar.DAY_OF_WEEK));

		//날짜랑 시간정보 변경
		day1.set(Calendar.MONTH, 10); // 11월
		day1.set(Calendar.DATE, 18);
		System.out.println(day1.get(Calendar.MONTH) + 1);
		System.out.println(day1.get(Calendar.DATE));
		System.out.println(day1.get(Calendar.DAY_OF_WEEK));

		Calendar day2 = Calendar.getInstance();
		long time1 = day2.getTimeInMillis(); // 1970년 1월 1일부터 day2까지 몇 ms가 흘렀는지 리턴
		day2.set(Calendar.DATE, 8);
		long time2 = day2.getTimeInMillis();
		System.out.println("time1 : " + time1);
		System.out.println("time2 : " + time2);
		System.out.println("시간차이 : " + (time2 - time1));

		Date date1 = new Date(time1);
		Date date2 = new Date(time2);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
		String date1Str = format.format(date1);
		String date2Str = format.format(date2);
		System.out.println(date1Str);
		System.out.println(date2Str);
	}

	public void test1() {

		Scanner sc = new Scanner(System.in);
		System.out.println("============= D-DAY 계산기 =============");
		System.out.print("D-DAY [년도] 입력 : ");
		int year = sc.nextInt();
		System.out.print("D-DAY [월] 입력 : ");
		int month = sc.nextInt();
		System.out.print("D-DAY [일] 입력 : ");
		int date = sc.nextInt();
		Calendar c = Calendar.getInstance();
		long today = c.getTimeInMillis();
		Date date1 = new Date(today);
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		String stringToday = format.format(date1);
		c.set(1, year);
		c.set(2, month - 1);
		c.set(5, date);
		long day = c.getTimeInMillis();
		Date date2 = new Date(day);
		String stringDay = format.format(date2);
		long date3 = (day - today) / (1000 * 60 * 60 * 24L);
		System.out.println("오늘날짜 : " + stringToday);
		System.out.println("D-DAY 날짜 : " + stringDay);
		if (date3 == 0L) {
			System.out.println("D-DAY입니다.");
		} else if (date3 > 0L) {
			System.out.println(date3 + "일남았습니다.");
		} else {
			System.out.println(Math.abs(date3) + "일지났습니다.");
		}
	}

	public void wrap() {
		// 정수형(기본형변수) 선언 후 10 대입
		int num1 = 10;
		// wrapper클래스 사용(int -> Integer)
		Integer num2 = new Integer(10); // boxing
		int num3 = num2.intValue(); // unboxing
		System.out.println(num3);

		Integer num4 = 10; // auto - boxing
		int num5 = num4; // auto - unboxing

		double d1 = 3.14;
		System.out.println(d1);
		Double d2 = new Double(3.14);
		double d3 = d2.doubleValue();
		System.out.println(d3);
		
		Double d4 = 3.14;
		double d5 = 3.14;
	}
	
	public void wrap2() {
		
		// wrapper클래스 사용 예)   기본형 <-> 문자열 형변환
		// 1)문자열 -> 기본형
		String str1 = "100";
		System.out.println(str1 + 1); // 1001
		int num = Integer.parseInt(str1); // 반드시 기억
		System.out.println(num + 1);
		
//		String str2 = "100a";
		// 정상적인 정수가 아닌 경우 변환 도중 에러 발생
//		int num2 = Integer.parseInt(str2);
		
		String str2 = "3.14";
		double Num = Double.parseDouble(str2);
		
		// 문자열 -> 문자변환
		String str3 = "ABCDE";
		char ch = str3.charAt(0);
		
		// 2)기본형 - > 문자열
		int num1 = 100;
		// 2-1) Integer사용
		
		String str4 = Integer.valueOf(num1).toString();
		
		//2-1) Double 사용

		double dNum2 = 3.14;
		
		String str5 = Double.valueOf(dNum2).toString();
		
		// 2-2) String클래스사용
		String str6 = String.valueOf(num1);
		String str7 = String.valueOf(dNum2);
		
		
		
		
		
	}
}
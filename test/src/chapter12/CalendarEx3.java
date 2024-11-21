package chapter12;

import java.util.Date;

public class CalendarEx3 {

	public static void main(String[] args) {
		// 현재일
		int tYear = 2024;
		int tMonth = 11;
		int tDay = 21;
		
		// 이전일
		int yYear = 2024;
		int yMonth = 11;
		int yDay = 20;
		
		Date td = new Date();
		Date yd = new Date();
		
		td.setYear(tYear);
		td.setMonth(tMonth-1);
		td.setDate(tDay);
		
		yd.setYear(yYear);
		yd.setMonth(yMonth-1);
		yd.setDate(yDay);
		
		long temp = (td.getTime() - yd.getTime()) / (1000L * 60L * 60L * 24L);
		int diff = (int)temp;
		
		System.out.println(diff + "일 경과");
	}

}

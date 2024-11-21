package chapter12;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx5 {

	public static void main(String[] args) {
		// 현재일
		int tYear = 2024;
		int tMonth = 11;
		int tDay = 21;
		
		// 이전일
		int yYear = 2024;
		int yMonth = 11;
		int yDay = 20;
		
//		Calendar tCal = Calendar.getInstance();
//		Calendar yCal = Calendar.getInstance();
//		tCal.set(tYear, tMonth-1, tDay);
//		yCal.set(yYear, yMonth-1, yDay);
		
		Calendar tCal = new GregorianCalendar(tYear, tMonth-1, tDay);
		Calendar yCal = new GregorianCalendar(yYear, yMonth-1, yDay);
		
		// 여기선 GregorianCalendar 가 시간 정보를 자동으로 0으로 초기화 해줘서 1일 차이도 1일 경과로 표시됨.
		long diffSec = (tCal.getTimeInMillis() -yCal.getTimeInMillis()) / 1000;
		long diffDay = diffSec / (24*60*60);
		
		System.out.println(diffDay + "일 경과");
	}

}

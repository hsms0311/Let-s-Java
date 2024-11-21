package chapter12;

import java.util.Calendar;

public class CalendarEx4 {

	public static void main(String[] args) {
		// 현재일
		int tYear = 2024;
		int tMonth = 11;
		int tDay = 21;
		
		// 이전일
		int yYear = 2024;
		int yMonth = 11;
		int yDay = 20;
		
		Calendar tCal = Calendar.getInstance();
		Calendar yCal = Calendar.getInstance();
		tCal.set(tYear, tMonth-1, tDay);
		yCal.set(yYear, yMonth-1, yDay);
		
		// 밀리세컨드 단위로 계산하기 때문에 1일 차이가 0일 경과됐다고 표시됨.
		long diffSec = (tCal.getTimeInMillis() -yCal.getTimeInMillis()) / 1000;
		long diffDay = diffSec / (24*60*60);
		
		System.out.println(diffDay + "일 경과");
	}

}

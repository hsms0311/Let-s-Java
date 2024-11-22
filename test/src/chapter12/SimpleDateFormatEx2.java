package chapter12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx2 {

	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = "2024-11-22";
		
		Date d = null;
		try {
			d = sdf1.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(d);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println(sdf2.format(d));
	}

}

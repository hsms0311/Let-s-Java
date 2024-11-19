package chapter12.string;

public class StringEx1 {

	public static void main(String[] args) {
		int score = 90;
		System.out.println("당신의 점수는 " + score + "입니다"); // 자동 형변환
		
		// String s = score; // 데이터 타입이 달라 에러
		String s = String.valueOf(score); // String 으로 형변환
		
		// 문자열을 + 연산하여 String 으로 형변환
		String s2 = score + "";
	}

}

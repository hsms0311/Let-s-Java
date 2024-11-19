package chapter12;

public class RoundEx {

	public static void main(String[] args) {
		// 원주율을 소수점 3자리로 반올림(10의 3승 : 1000)
		double d1 = Math.PI * 1000;
		double d2 = Math.round(d1);
		double d3 = d2 / 1000;
		System.out.println(d3);
		
		// 한 줄로 출력
		System.out.println(Math.round(Math.PI * 1000) / 1000.0);
	}

}

package chapter05;

public class IfEx2 {

	public static void main(String[] args) {
		int score = 50;

		System.out.println("시험 시작?");

		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		System.out.println("시험 종료!");
	}

}

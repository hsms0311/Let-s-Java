package chapter05;

public class IfEx4 {

	public static void main(String[] args) {
		int math = 80;
		int eng = 60;

		if (math >= 60) {
			if (eng >= 60) {
				System.out.println("합격");
			}
		} else {
			System.out.println("불합격");
		}
	}

}

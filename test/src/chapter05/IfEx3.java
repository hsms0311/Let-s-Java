package chapter05;

public class IfEx3 {

	public static void main(String[] args) {
		int score = 80;
		String grade = "";

		System.out.println("학점 보기");

		if (score >= 95) {
			grade = "A+";
		} else if (score >= 90) {
			grade = "A";
		} else if (score >= 85) {
			grade = "A-";
		} else if (score >= 80) {
			grade = "B+";
		} else if (score >= 75) {
			grade = "B";
		} else if (score >= 70) {
			grade = "B-";
		} else if (score >= 65) {
			grade = "C+";
		} else if (score >= 60) {
			grade = "C";
		} else if (score >= 55) {
			grade = "C-";
		} else if (score >= 50) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("학점은 " + grade + "입니다.");
	}

}

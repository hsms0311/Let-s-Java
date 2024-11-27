package chapter15;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;

public class LambdaEx10 {
	// 앞 예제에서 작성한 Student 클래스의 배열
	static Student[] list = {
			new Student("김기동", 60, 80, "사회복지"),
			new Student("이기동", 70, 70, "건축공학"),
			new Student("박기동", 90, 50, "물리치료"),
			new Student("유기동", 55, 55, "사회복지")
	};
	
	public static void main(String[] args) {
		// 과가 사회복지인 학생의 영어 점수 평균
		double avg1 = avgEng(t -> t.getMajor().equals("사회복지"));
		System.out.println("사회복지과의 평균 영어 점수 : " + avg1);
		
		// 과가 사회복지인 학생의 수학 점수 평균
		double avg2 = avgMath(t -> t.getMajor().equals("사회복지"));
		System.out.println("사회복지과의 평균 수학 점수 : " + avg2);
	}
	
	private static double avgEng(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for (Student s : list) {
			// equals 비교
			if (predicate.test(s)) {
				count++;
				sum += s.getEng();
			}
		}
		return (double)sum / count;
	}
	
	private static double avgMath(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for (Student s : list) {
			// equals 비교
			if (predicate.test(s)) {
				count++;
				sum += s.getMath();
			}
		}
		return (double)sum / count;
	}

}

package chapter15;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class LambdaEx9 {
	// 앞 예제에서 작성한 Student 클래스의 배열
	static Student[] list = {
			new Student("김기동", 60, 80, "사회복지"),
			new Student("이기동", 70, 70, "건축공학"),
			new Student("박기동", 90, 50, "물리치료")
	};
	
	public static void main(String[] args) {
		System.out.print("최대 수학 점수 : ");
		int max = maxOrMinMath((a, b) -> {
			if (a >= b) return a;
			else return b;
		});
		System.out.println(max);
		
		System.out.print("최소 수학 점수 : ");
		System.out.println(maxOrMinMath((a, b) -> (a <= b ? a : b)));
		
		System.out.print("최대 평균 점수 : ");
		System.out.println(maxOrMinAvg((a, b) -> (a >= b ? a : b)));
		
		System.out.print("최소 평균 점수 : ");
		System.out.println(maxOrMinAvg((a, b) -> (a <= b ? a : b)));
	}
	
	// 두 개의 int 값을 연산하여 int 값을 리턴
	private static int maxOrMinMath(IntBinaryOperator ibo) {
		int result = list[0].getMath();
		for (Student s : list) {
			result = ibo.applyAsInt(result, s.getMath());
		}
		return result;
	}
	
	// 두 개의 double 값을 연산하여 double 값을 리턴
	private static double maxOrMinAvg(DoubleBinaryOperator dbo) {
		double result = (list[0].getMath() + list[0].getEng()) / 2.0;
		for (Student s : list) {
			result = dbo.applyAsDouble(result, (s.getMath() + s.getEng()) / 2.0);
		}
		return result;
	}

}

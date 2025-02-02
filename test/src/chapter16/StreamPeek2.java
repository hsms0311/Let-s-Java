package chapter16;

import java.util.Arrays;
import java.util.List;

public class StreamPeek2 {

	public static void main(String[] args) {
		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		// 모든 요소들이 Shape 의 인스턴스 (객체)인지 조건 비교
		boolean result1 = list.stream()
				.allMatch(s -> (s instanceof Shape));
		System.out.println("모든 요소는 Shape 의 객체이다 -> " + result1);
		
		// 요소들 중 하나 이상이 Rectangle 객체인지 조건 비교
		boolean result2 = list.stream()
				.anyMatch(s -> (s instanceof Rectangle));
		System.out.println("요소 중 Rectangle 의 객체가 존재한다 -> " + result2);
		
		// 모든 요소가 Circle 의 객체인지 조건에 해당하지 않는지 비교
		boolean result3 = list.stream()
				.noneMatch(s -> (s instanceof Circle));
		System.out.println("모든 요소 중 Circle 의 객체가 존재하지 않는다 -> " + result3);
	}

}

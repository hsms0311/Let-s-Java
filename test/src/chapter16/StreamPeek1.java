package chapter16;

import java.util.Arrays;
import java.util.List;

public class StreamPeek1 {

	public static void main(String[] args) {
		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
//		list.parallelStream().mapToDouble(s -> s.area())
//			.peek(s -> System.out.println(s)); // .peek 는 중간 반복자
		
		list.parallelStream().mapToDouble(s -> s.area())
			.peek(s -> System.out.println(s)).sum();
	}

}

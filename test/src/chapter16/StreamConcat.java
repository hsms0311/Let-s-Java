package chapter16;

import java.util.stream.Stream;

public class StreamConcat {

	public static void main(String[] args) {
		// 문자열 스트림 객체
		Stream<String> s1 = Stream.of("김기동",
				"이기동", "박기동", "유기동");
		
		// 정수 스트림 객체
		Stream<Integer> s2 = Stream.of(1, 2, 3, 4, 5, 6);
		
		// concat() 메서드로 두 스트림 객체
		Stream<Object> concat = Stream.concat(s1, s2);
		concat.forEach(s -> System.out.print(s + ", "));
	}

}

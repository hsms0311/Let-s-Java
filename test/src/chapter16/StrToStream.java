package chapter16;

import java.util.stream.IntStream;

public class StrToStream {

	public static void main(String[] args) {
		String str = "자바 공부 하자";
		
		// Stream 객체 생성
		IntStream is = str.chars();
		
		// System.out.print()
		is.forEach(s -> System.out.print((char)s));
	}

}

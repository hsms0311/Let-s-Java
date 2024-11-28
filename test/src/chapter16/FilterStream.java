package chapter16;

import java.util.Arrays;
import java.util.List;

public class FilterStream {

	public static void main(String[] args) {
		// List 객체 생성
		List<String> list = Arrays.asList("김기동",
				"이기동", "박기동", "유기동", "김기동");
		
		// distinct() 메서드로 중복 제거 후 내부 반복자로 출력
		System.out.println("distinct()");
		list.stream().distinct()
			.forEach(s -> System.out.println(s));
		System.out.println();
		
		// "김" 으로 시작하는 문자열을 필터링 후 내부 반복자로 출력
		System.out.println("filter()");
		list.stream().filter(s -> s.startsWith("김"))
			.forEach(s -> System.out.println(s));
		System.out.println();
		
		// 중복 제거 후 "김" 으로 시작하는 문자열 내부 반복자로 출력
		System.out.println("distinct() + filter()");
		list.stream().distinct().filter(s -> s.startsWith("김"))
			.forEach(s -> System.out.println(s));
	}

}

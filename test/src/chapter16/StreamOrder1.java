package chapter16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamOrder1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("김기동",
				"이기동", "박기동", "유기동");
		
		System.out.println("기본 정렬");
		list.stream().sorted()
			.forEach(System.out::println);;
		System.out.println();
		
		System.out.println("역순 정렬");
		list.stream().sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
	}

}

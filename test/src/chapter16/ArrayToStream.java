package chapter16;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		// 문자열 배열객체 생성
		String[] arr = new String[] {"a", "b", "c", "d", "e"};
		
		// 배열 전체 Stream 객체로 전환
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(s -> System.out.print(s + ""));
		System.out.println();
		
		// 인덱스 지정해서 변환 (1부터 4전 까지)
		// 첫 번째 인덱스는 포함되지 않음
		Stream<String> stream2 = Arrays.stream(arr, 1, 4);
		stream2.forEach(s -> System.out.print(s + ""));
	}

}

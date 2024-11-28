package chapter16;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamEx {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		System.out.println("Arrays.stream() IntStream 생성하기");
		IntStream intStream1 = Arrays.stream(arr);
		intStream1.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		System.out.println("IntStream.of() IntStream 생성하기");
		IntStream intStream2 = IntStream.of(arr);
		intStream2.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		// 두 번째 매개변수 인덱스 포함 안됨
		System.out.println("IntStream.range(1, 6) IntStream 생성하기");
		IntStream intStream3 = IntStream.range(1, 6);
		intStream3.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		System.out.println("IntStream.rangeClosed(1, 5) IntStream 생성하기");
		IntStream intStream4 = IntStream.rangeClosed(1, 5);
		intStream4.forEach(s -> System.out.print(s + "\t"));
	}

}

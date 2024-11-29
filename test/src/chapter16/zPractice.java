package chapter16;

import java.util.Arrays;

public class zPractice {}

//	01. 스트림에 대한 설명 중 올바르지 않은 것은?
//	1. 스트림의 요소는 반복 처리 후 언제든 다시
//	반복 처리할 수 있다.
//	2. 병렬로 처리 가능하다.
//	3. 내부 반복자와 외부 반복자가 있다.
//	4. forEach() 로 편하게 반복 처리할 수 있다.
//
//	정답 : 1 
//	스트림 요소는 반복이 끝나면 다시 반복 처리할 수 없다.


//	02. 아래 예제의 문자열 배열을 스트림으로 변환하여
//	forEach 메서드를 통해 출력하는 코드를 작성하시오.
//
//	import java.util.Arrays;
//	import java.util.stream.Stream;
//	
//	public class ex {
//		
//		public static void main(String[] args) {
//			// 문자열 배열
//			String[] arr = new String[] {"a", "b", "c", "d", "e", "f"};
//			
//			// 코드 작성
//			
//		}
//		
//	}
//
//	정답 : 
//	Stream<String> s = Arrays.stream(arr);
//	s.forEach(s -> System.out.println(s + ""));


//	03. 스트림 병렬 처리에 대한 설명으로 올바른 것은?
//	1. stream() 메서드로 병렬 처리.
//	2. 병렬처리는 순차적 처리 보다 항상 빠르다.
//	3. 하나의 작업을 둘 이상의 작업으로 잘게 나눠서
//	동시에 진행하는 것.
//	4. 병렬처리는 CPU 가 하나인 경우 더 빠르다.
//
//	정답 : 3
//	stream() 메서드가 아니라 parallelStream() 메서드를
//	사용하고, CPU 가 1개일 때는 병렬처리 보다 순처적
//	처리가 더 빠름.
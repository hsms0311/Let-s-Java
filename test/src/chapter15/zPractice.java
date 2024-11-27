package chapter15;

public class zPractice {}

//	01. 람다식에 대한 설명으로 올바르지 않은 것은?
//	1. 이름이 없는 익명 구현 객체이다.
//	2. 매개변수의 괄호는 생략할 수 없다.
//	3. 인터페이스의 객체를 생성할 때 많이 사용된다.
//	4. 함수적 인터페이스를 자료형으로 갖는다.
//
//	정답 : 2
//	매개변수가 하나인 경우 괄호를 생략할 수 있다.


//	02. 아래 코드에서 인터페이스를 구현하는 람다식을 작성하시오.
//
//	public class Ex {
//		
//		public static void main(String[] args) {
//			InterfaceLambda il ________;
//			
//			System.out.println(il.sum(1, 2));
//		}
//		
//	}
//	
//	interface InterfaceLambda {
//		public int sum(int x, int y);
//	}
//	[실행 결과]
//	3
//
//	정답 : (int x, int y) -> x + y;
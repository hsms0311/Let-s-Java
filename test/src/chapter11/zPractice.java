package chapter11;

public class zPractice {}

//	01. 예외처리에 대한 설명 중 올바르지 않은 것은?
//	1. 예외 발생 가능성이 있는 코드를 try-catch 구문
//	사이에 작성한다.
//	2. 예외는 개발자의 실수나 사용자의 잘못된 값 등으로
//	인해 생긴 오류이다.
//	3. catch 구문은 하나만 사용 가능하다.
//	4. 예외를 떠넘기고 있는 메서드를 호출할 때는 반드시
//	try-catch 구문에 넣어야 한다.
//
//	정답 : 3
//	catch 구문은 여러 개 사용 가능.


//	02. try-catch 문을 사용하지 않고 떠넘길 때 사용하는
//	키워드는?
//
//	정답 : throws


//	03. 일부러 예외를 발생 시킬 때 사용되는 키워드는?
//
//	정답 : throw


//	04. try-catch 구문에서 예외 발생 여부에 상관없이
//	항상 실행되게 하기 위해 블록을 지정하는 키워드는?
//
//	정답: finally


//	05. 다음 코드의 실행 결과는?
//
//	public class Test {
//		
//		public static void main(String[] args) {
//			try {
//				test1();
//				System.out.println("(4)");
//			} catch (Exception e) {
//				System.out.println("(5)");
//			}
//		}
//		
//		public static void test1() throws Exception {
//			try {
//				test2();
//				System.out.println("(1)");
//			} catch (NullPointerException e) {
//				System.out.println("(2)");
//			} finally {
//				System.out.println("(3)");
//			}
//		}
//		
//		public static void test2() {
//			throw new NullPointerException();
//		}
//		
//	}
//
//	정답 : (2)
//		   (3)
//		   (4)
//	test2() 메서드에서 강제로 예외를 발생시키므로
//	(1) 은 출력되지 않음.
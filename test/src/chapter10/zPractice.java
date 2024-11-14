package chapter10;

public class zPractice {}

//	01. 내부 클래스에 대한 설명 중 올바르지 않은 것은?
//	1. 로컬 클래스는 한 번 생성하면 다른 메서드 내에서도
//	사용 가능하다.
//	2. 내부 클래스는 클래스 안에 클래스가 존재하는 것이다.
//	3. 로컬 클래스는 메서드 안에 선언된 클래스이다.
//	4. 멤버 클래스는 바깥 클래스의 객체를 통해 접근할 수 있다.
//
//	정답 : 1
//	로컬 클래스는 생성된 메서드 내에서만 사용 가능.


//	02. 다음 중첩된 클래스 Out 클래스와 In 클래스의 name 필드를
//	출력하는 코드를 Print 클래스의 main() 메서드에 작성하시오.
//
//	public class Print {
//		public static void main(String[] args) {
//			// name 을 출력하는 코드 작성
//		}
//	}
//	
//	class Out {
//		class In {
//			String name = "자바";
//		}
//	}
//	[실행 결과]
//	자바
//
//	정답 : 
//	System.println(new Out().new In().name);
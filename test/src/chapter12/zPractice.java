package chapter12;

public class zPractice {}

//	01. 모든 클래스의 최상위 클래스는?
//
//	정답 : Object 클래스


//	02. 다음 예제에서 실행 결과가 "현대자동자 : 그렌져" 라고
//	출력될 수 있도록 Car 클래스르 수정하시오.
//
//	class Car {
//		String name;
//		String company;
//		
//		// 코드 작성
//		
//	}
//	
//	public class ex {
//		
//		public static void main(String[] args) {
//			Car car = new Car();
//			car.name = "그렌져";
//			car.company = "현대자동차";
//			
//			System.out.println(car);
//		}
//		
//	}
//
//	정답 :
//	public String toString() {
//		return company + " : " + name;
//	}


//	03. 두 개의 문자열 변수와 합계를 구하기 위해 숫자로
//	변환하여 덧셈연산 값을 출력하는 코드를 작성하시오.
//
//	public class ex {
//		
//		public static void main(String[] args) {
//			String num1 = "100";
//			String num2 = "200";
//			
//			// 코드 작성
//			
//		}
//		
//	}
//
//	정답 :
//	System.out.println("합계 : " + (Integer.parseInt(num1)
//			+ Integer.parseInt(num2)));


//	04. 다음 예제는 문자열 배열에 "아이디, 이름, 나이" 형태로
//	지정되어 있는데, 이 데이터는 콤마(,) 로 구분 되어 있다.
//	이 데이터 중에 이름만 출력되도록 코드를 작성하고, 전체
//	데이터의 평균 나이를 출력하는 코드를 작성하시오.
//	(for 문과, split() 메서드 사용)
//
//	public class ex {
//		
//		public static void main(String[] args) {
//			// 아이디, 이름, 나이
//			String[] member = {"hong, 홍길동, 30",
//					"lee, 이순신, 40", "kim, 김유신, 50"};
//			
//			// 이름만 출력
//			// 코드 작성
//			
//			// 평균 나이 출력
//			int ageSum = 0;
//			// 코드 작성
//			
//			System.out.println("평균 나이 : " + (double)ageSum/member.length);
//		}
//		
//	}
//
//	정답 :
//	for (int i=0; i<member.length; i++) {
//		System.out.println(member[i].split(", ")[1]);
//	}
//	
//	for (int i=0; i<member.length; i++) {
//		ageSum += Integer.parseInt(member[i].split(", ")[2]);
//	}
package chapter03;

public class zPractice {}

//	01. 다음 중 자바 프로그램을 실행하는 main() 메서드의 선언부로 올바르지 않은 것은?
//	1. public static void main(String[] args)
//	2. public static void main(String args[])
//	3. public static void main(String args)
//	4. public static void main(String[] arg)
// 
//	정답 : 3
//	메인 메서드의 매개변수는 반드시 배열 형태로 []를 넣어줘야 함.


//	02. 다음 중 알맞은 변수명으로 선언한 것은?
//	1. int for = 10;
//	2. int var = 10;
//	3. int 111 = 10;
//	4. int 1var = 10;
//
//	정답 : 2
//	for 는 자바의 예약어. 변수명은 숫자로 시작할 수 없음.


//	03. 전화번호를 저장하는 변수 tel 을 본인 전화번호를 값으로 갖는 변수로 선언하시오.
//		(전화번호를 저장할 변수와 자료형을 알맞게 선언하고, 초기화하는 코드)
//
//	정답 : String tel = "010-1234-5678";


//	04. 다음 중 기본 자료형이 아닌 것은?
//	1. String
//	2. char
//	3. int
//	4. float
//
//	정답 : 1
//	String 은 문자열을 저장하는 클래스.


//	05. 다음 중 강제 형변환 코드를 생략할 수 있는 것은?
//	1. int a = 3.14f;
//	2. int b = 3f;
//	3. float c = 3d;
//	4. double d = 3L;
//
//	정답 : 4
//	double 이 long 보다 범위가 크기 때문에 자동형변환이 되므로 생략 가능.


//	06. 다음 코드의 실행 결과를 작성하시오.
//	double a = 3.141562;
// 	int b = (int)a;
// 	System.out.println(b);
//
// 	정답 : 3
// 	double 값이 int 로 강제형변환 되어서 정수 부분만 출력됨.


// 	07. 위 6번의 결과가 출력되는 이유를 설명하시오.
//
// 	정답 : double 값이 int 로 강제형변환 되어서 정수 부분만 출력됨.
package chapter17;

public class zPractice {}

//	01. 스레드를 생성하는 방법이 아닌 것은?
//	1. Thread 클래스를 import 한다.
//	2. Runnable 인터페이스를 구현한다.
//	3. Thread 클래스를 상속받는다.
//	4. Runnable 인터페이스를 익명 구현객체로 생성한다.
//
//	정답 : 1
//	Thread 클래스는 상속받아 run() 메서드를 재정의 해야함.


//	02. 다음 빈 칸에 들어갈 코드를 작성하시오.
//
//	Thread t1 = new Thread([________] {
//		@Override
//		public void run() {
//			System.out.println("스레드 시작");
//			for (int i=0; i<50; i++) {
//				System.out.println(i);
//			}
//		}
//	}
//
//	정답 : new Runnable
//	익명 구현 클래스로 객체 생성


//	03. 스레드를 일정 시간 동안 잠시 일시 정지
//	시킬 수 있는 메서드는?
//
//	정답 : sleep()


//	04. 아래 예제는 스레드 두 개를 실행시켜 0부터
//	49까지 출력하는 코드인데, 두 개의 스레드가 동시에
//	실행되어 출력 순서가 뒤죽박죽으로 출력되었다.
//	t1 스레드에 우선 순위를 높여 출력되도록 코드를 작성하시오.
//
//	public class ex {
//		
//		public static void main(String[] args) {
//			Thread t1 = new Thread(() -> {
//				System.out.println("t1 스레드 시작");
//				for (int i=0; i<50; i++) {
//					System.out.println("t1 : " + i);
//				}
//			});
//			
//			Thread t2 = new Thread(() -> {
//				System.out.println("t2 스레드 시작");
//				for (int i=0; i<50; i++) {
//					System.out.println("t2 : " + i);
//				}
//			});
//			
//			// 우선 순위 지정
//			
//			t1.start();
//			t2.start();
//		}
//		
//	}
//	[실행 결과]
//	t1 스레드 시작
//	t1 : 0
//	t1 : 1
//	t2 스레드 시작
//	t1 : 2
//	t2 : 0
//	t3 : 3
//	......
//
//	정답 : 
//	t1.setPriority(10);
//	t2.setPriority(10);
//	t1 의 작업 시간을 더 많이 적용시킴.
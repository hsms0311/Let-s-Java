package chapter09;

public class zPractice {}

//	01. 클래스가 인터페이스를 구현할 때 사용하는 예약어는?
//
//	정답 : implements


//	02. 인터페이스에 대한 설명으로 올바르지 않은 것은?
//	1. 하나의 클래스에서 여러 인터페이스를 구현할 수 있다.
//	2. 타입이 인터페이스인 경우 다향한 구현 객체를 대입할 수 있다.
//	3. 구현객체를 인터페이스로 형변환 하려면 강제 형변환을 해야 한다.
//	4. 인터페이스에 정의된 추상 메서드는 구현 클래스에서 반드시
//	재정의해서 구현해야 한다.
//
//	정답 : 3
//	인터페이스를 구현한 객체를 인터페이스 타입으로 자동 형변환할 수 
//	있으므로, 강제 형변환이 필요하지 않음.


//	03. 다음과 같이 Player 라는 인터페이스를 정의하고, 출력결과도
//	아래와 같이 출력될 수 있도록 Player 인터페이스를 상속받는
//	BaseBallPlayer 와 FootBallPlayer 클래스를 정의하시오.
//
//	interface Player {
//		// 추상 메서드
//		void play();
//	}
//	
//	public class Sports {
//		
//		public static void main(String[] args) {
//			Player p1 = new BaseBallPlayer();
//			Player p2 = new FootBallPlayer();
//			
//			playGame(p1);
//			playGame(p2);
//		}
//		
//		public static void playGame(Player p) {
//			p.play();
//		}
//		
//	}
//	[실행 결과]
//	야구선수가 야구를 합니다.
//	축구선수가 축구를 합니다.
//
//	정답 : 
//	class BaseBallPlayer implements Player {
//		public void play() {
//			System.out.println("야구선수가 야구를 합니다.");
//		}
//	}
//	
//	class FootBallPlayer implements Player {
//		public void play() {
//			System.out.println("축구선수가 축구를 합니다.");
//		}
//	}


//	04. 아래 TV 라는 인터페이스를 만들고 Broadcast 클래스의 main()
//	메서드에서 TV 인터페이스의 익명 구현 객체를 생성해 결과가
//	동일하게 출력되도록 코드를 완성하시오.
//
//	interface TV {
//		// 추상 메서드
//		void turnOn();
//	}
//	
//	public class Broadcast {
//		
//		public static void main(String[] args) {
//			//코드 작성
//			
//			p1.turnOn();
//		}
//		
//	}
//	[실행 결과]
//	TV를 켭니다.
//
//	정답 :
//	TV p1 = new TV() {
//		@Override
//		public void turnOn() {
//			System.out.println("TV를 켭니다.");
//		}
//	};
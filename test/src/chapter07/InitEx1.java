package chapter07;

public class InitEx1 {
	// 생성자
	InitEx1() {
		System.out.println("생성자 호출");
	}
	
	// static 초기화블럭
	static {
		System.out.println("클래스 초기화 블럭 실행");
	}
	
	// 인스턴스 초기화 블럭
	{
		System.out.println("인스턴스 초기화 블럭 실행");
	}
	
	public static void main(String[] args) {
		System.out.println("main 메서드 시작");
		System.out.println("main init1 객체 생성");
		InitEx1 init1 = new InitEx1();
		System.out.println("main init2 객체 생성");
		InitEx1 init2 = new InitEx1();
	}

}

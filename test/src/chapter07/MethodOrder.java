package chapter07;

public class MethodOrder {

	public static void main(String[] args) {
		MethodA me = new MethodA();
		
		// 메서드 실행
		me.one();
	}

}

class MethodA {
	void one() {
		two();
		System.out.println("1");
	}
	
	void two() {
		tree();
		System.out.println("2");
	}
	
	void tree() {
		System.out.println("3");
	}
}
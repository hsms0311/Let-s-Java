package chapter09;

public interface MyInterface2 {
	default void defaultMethod() {
		System.out.println("MyInterface2 의 default 메서드");
	}
	
	static void statictMethod() {
		System.out.println("MyInterface2 의 static 메서드");
	}
}

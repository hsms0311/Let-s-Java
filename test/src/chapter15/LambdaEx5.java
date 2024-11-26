package chapter15;

public class LambdaEx5 {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}

}

@FunctionalInterface
interface LambdaInterfaceExer {
	void method();
}

class Outer {
	public int iv = 10;
	void method() {
		final int iv = 30;
		LambdaInterfaceExer li = () -> {
			System.out.println("Outer.this.iv : " + Outer.this.iv);
			System.out.println("this.iv : " + this.iv);
			System.out.println("iv : " + iv);
		};
		
		li.method();
	}
}
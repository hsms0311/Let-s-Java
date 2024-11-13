package chapter09;

public class DefaultStaticEx {

	public static void main(String[] args) {
		Child c = new Child();
		c.defaultMethod();
		c.method2();
		
		MyInterface1.statictMethod();
		MyInterface2.statictMethod();
	}

}

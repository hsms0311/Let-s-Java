package chapter07;

public class JavadocMain {

	public static void main(String[] args) {
		JavadocTest jt = new JavadocTest();
		
		int a = 10;
		int b = 20;
		
		jt.add(a, b);
		
		System.out.println(jt.add(a, b));
	}

}

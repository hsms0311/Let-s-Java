package chapter09;

public class ComplexerMain {

	public static void main(String[] args) {
		Complexer com = new Complexer();
		
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);
		
		com.print();
		com.scan();
		com.send("98-7654-3210");
		com.receive("98-7654-3210");
	}

}

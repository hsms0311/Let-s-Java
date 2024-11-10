package chapter08.poly;

public class PolyEx3 {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.run();
		
		// 에러 발생
		Child c = (Child)p;
		c.run();
	}
}

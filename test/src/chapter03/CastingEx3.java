package chapter03;

public class CastingEx3 {

	public static void main(String[] args) {	
		double scope = 100;

		int scope2 = (int) scope; // 강제형변환.

		System.out.println(scope2); // 값의 손실이 발생하지 않았음.
	}

}

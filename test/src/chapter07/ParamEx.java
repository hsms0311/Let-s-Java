package chapter07;

public class ParamEx {

	public static void main(String[] args) {
		Param p = new Param();

		p.add1(10, 5);
//		p.add1("10", "5"); // 에러 

		p.add2(10, 5);

		p.add3(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}

}

class Param {
	void add1(int x, int y) {
		int z = x + y;
		System.out.println(z);
	}

	void add2(double x, double y) {
		double z = x + y;
		System.out.println(z);
	}

	void add3(int... x) {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
}
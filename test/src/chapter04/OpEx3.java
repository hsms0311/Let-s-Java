package chapter04;

public class OpEx3 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;

		++a;
		b++;

		System.out.println(a);
		System.out.println(b);

		// 전위연산
		int c = 10;
		int d = ++c;

		System.out.println(b);

		// 후위연산
		int x = 10;
		int y = x++;

		System.out.println(y); // 증가 전
		System.out.println(x); // 증가 후

		int e = 10;

		e++;

		System.out.println("e++ = " + e);

		int f = 10;

		f += 1;

		System.out.println("f += 1 = " + f);

		int g = 10;

		g = g + 1;

		System.out.println("g = g + 1 = " + g);
	}

}

package chapter14;

public class GenericEx2 {

	public static void main(String[] args) {
		Generic<String> g1 = new Generic<String>();
		String[] ss = {"김기동", "이기동", "박기동"};
		
		// String 제네릭 타입의 매개변수에 String 배열객체 전달
		g1.set(ss);
		g1.print();
		
		for (String s : g1.get()) {
			// String s = (String)o; // 형변환 필요없음
			System.out.println(s);
		}
		
		Integer[] ii = {1, 2, 3};
		
		// String 제네릭 타입의 매개변수에 Integer 배열객체 전달
		// g.set(ii); // 에러 발생
		Generic<Integer> g2 = new Generic<Integer>();
		g2.set(ii);
		g2.print();
		
		for (Integer o : g2.get()) {
			// String s = (String)o; // 형변환 필요없음
			System.out.println(o);
		}
	}

}

class Generic<T> {
	T[] v;
	
	void set(T[] n) {
		v = n;
	}
	
	T[] get() {
		return v;
	}
	
	void print() {
		for (T o : v) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
}
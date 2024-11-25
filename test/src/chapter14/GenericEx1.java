package chapter14;

public class GenericEx1 {

	public static void main(String[] args) {
		NoGeneric ng = new NoGeneric();
		String[] ss = {"김기동", "이기동", "박기동"};
		
		// Object 타입의 매개변수에 String 배열객체 전달
		ng.set(ss);
		ng.print();
		
		Object[] obj = ng.get();
		for (Object o : obj) {
			String s = (String)o; // String 으로 강제형변환
			System.out.println(s);
		}
		
		Integer[] ii = {1, 2, 3};
		
		// Object 타입의 매개변수에 Intrger 배열객체 전달
		ng.set(ii);
		obj = ng.get();
		
		for (Object o : obj) {
			String s = (String)o; // String 으로 강제형변환 (에러)
			System.out.println(s);
		}
	}

}

class NoGeneric {
	Object[] v;
	
	void set(Object[] n) {
		v = n;
	}
	
	Object[] get() {
		return v;
	}
	
	void print() {
		for (Object o : v) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
}
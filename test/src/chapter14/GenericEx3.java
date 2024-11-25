package chapter14;

public class GenericEx3 {

	public static void main(String[] args) {
		Generic2<String, Integer> g1 = new Generic2<String, Integer>();
		g1.set("김기동", 1234);
		// g1.set("이기동", A123); // 에러
		
		System.out.println("<String, Integer>");
		System.out.println("name : " + g1.getName());
		System.out.println("id : " + g1.getId());
		
		Generic2<String, String> g2 = new Generic2<String, String>();
		g2.set("이기동", "A123");
		
		System.out.println("<String, String>");
		System.out.println("name : " + g2.getName());
		System.out.println("id : " + g2.getId());
	}

}

class Generic2<K, V> {
	K name;
	V id;
	
	void set(K name, V id) {
		this.name = name;
		this.id = id;
	}
	
	K getName() {
		return name;
	}
	
	V getId() {
		return id;
	}
}
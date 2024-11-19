package chapter12.string;

public class StringEx3 {

	public static void main(String[] args) {
		String name1 = "김기동";
		String name2 = "김기동";
		
		if (name1 == name2) {
			System.out.println("name1 == name2");
		} else {
			System.out.println("name1 != name2");
		}
		
		if (name1.equals(name2)) {
			System.out.println("name1.equals(name2)");
		} else {
			System.out.println("!name1.equals(name2)");
		}
		
		String name3 = new String("김기동");
		String name4 = new String("김기동");
		
		if (name3 == name4) {
			System.out.println("name3 == name4");
		} else {
			System.out.println("name3 != name4");
		}
		
		if (name3.equals(name4)) {
			System.out.println("name3.equals(name4)");
		} else {
			System.out.println("!name3.equals(name4)");
		}
	}

}

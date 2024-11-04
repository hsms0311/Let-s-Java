package chapter06;

public class ReferenceType {

	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";

		System.out.println(name1 == name2);
		System.out.println(name1 != name2);

		System.out.println();

		String name3 = new String("홍길동");
		String name4 = new String("홍길동");

		System.out.println(name3 == name4);
		System.out.println(name3 != name4);

		System.out.println();

		String name5 = new String("홍길동");
		String name6 = new String("홍길동");

		System.out.println(name5.equals(name6));
	}

}

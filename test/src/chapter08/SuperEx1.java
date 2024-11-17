package chapter08;

public class SuperEx1 {

	public static void main(String[] args) {
		Child child = new Child();
		child.print();
	}

}

class Parent {
	int number = 3;
	
	Parent() {
		System.out.println("부모 객체 생성");
	}
}

class Child extends Parent {
	int number = 2;
	
	Child() {
		System.out.println("자식 객체 생성");
	}
	
	void print() {
		int number = 1;
		System.out.println(number); // 메서드 지역변수
		System.out.println(this.number); // 자식 객체
		System.out.println(super.number); // 부모 객체
	}
}
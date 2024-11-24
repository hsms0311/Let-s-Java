package chapter13;

public class Member1 {
	// 필드
	String name;
	int age;
	
	// 생성자
	Member1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// toString() 메서드 재정의
	@Override
	public String toString() {
		return "(" + name + ", " + age + ")";
	}
	
	// equals() 메서드 재정의
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member1) {
			Member1 m = (Member1)obj;
			return this.name.equals(m.name) && this.age == m.age;
		} else {
			return false;
		}
	}
	
	// hashCode() 메서드 재정의
	@Override
	public int hashCode() {
		return this.name.hashCode() + age;
	}
}

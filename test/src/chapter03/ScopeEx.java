package chapter03;

public class ScopeEx { // 클래스 블럭.
	int no; // 클래스 블럭 내에서 사용 가능한 변수.

	public static void main(String[] args) { // 메인 메서드 블럭.
		String name; // 메인 메서드 블럭 내에서 사용 가능한 변수.

		if (true) {
			name = "김기동"; // 메인 메서드 블럭 안에서 선언했던 변수 사용 가능.

			String email = "kim@test.com"; // if 문 블럭 안에서 변수 선언.
		}

//		email = "kim@test.com"; // if 문 블럭 안에서 선언된 변수를 블럭 밖에서 사용시 에러.
	}

}

package chapter04;

public class OpEx8 {

	public static void main(String[] args) {
		String name = "김기동";
		System.out.println("안농하세오, " + name + " 입뉘다.");

		int height = 170;
		System.out.println("저의 키는 " + height + " cm 입뉘다.");

//		String weight = 70.5; // 문자자료형 변수에는 숫자 대입 불가.
		String weight = 70.5 + "";
		System.out.println("저의 몸무게는 " + weight + " kg 입뉘다.");

		int ageInt = 33;
		String ageStr = "33";
	}
}

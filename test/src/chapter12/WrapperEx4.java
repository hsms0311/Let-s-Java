package chapter12;

public class WrapperEx4 {

	public static void main(String[] args) {
		int i = 10;
		
		// 기본형을 참조형으로 변환(변환 생략가능)
		Integer int1 = (Integer)i;
		// Integer int1 = Integer.valueOf(i);
		
		Long lng = 10L; // Long lng = new Long(100L);
		int i2 = int1 + 10; // 참조형과 기본형간의 연산 가능
		long l = int1 + lng; // 참조형간의 덧셈 가능
		System.out.println("i2 : " + i2);
		System.out.println("l : " + l);
		
		Integer int2 = new Integer(30);
		int i3 = (int)int2; // 참조형을 기본형으로 변환(변환 생략가능)
		System.out.println("i3 : " + i3);
	}

}

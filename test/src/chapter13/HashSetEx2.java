package chapter13;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {

	public static void main(String[] args) {
		// HashSet 객체 생성
		Set set = new HashSet();
		
		// 문자열 객체 두 개 추가
		set.add(new String("abc"));
		set.add(new String("abc"));
		
		// Member 객체 두 개 추가 (사용자 정의 클래스)
		set.add(new Member("김기동 ", 40));
		set.add(new Member("김기동 ", 40));
		
		System.out.println(set);
	}

}

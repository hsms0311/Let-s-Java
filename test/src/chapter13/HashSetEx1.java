package chapter13;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		// Object 타입의 배열 생성
		Object[] arr = {"김기동", "이기동", "박기동", "유기동", 1, 2, "1", "2"};
		
		// HashSet 객체 생성
		Set set = new HashSet();
		
		// set 객체에 배열의 모든요소 add
		for (int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		
		System.out.println(set);
	}

}

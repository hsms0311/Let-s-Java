package chapter16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[] 
				{"김기동", "이기동", "박기동", "유기동"});
		
		System.out.println("for 문 이용");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("외부 반복자 이용");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("내부 반복자 이용");
		list.stream().forEach(s -> System.out.println(s));
	}

}

package chapter14;

import java.util.ArrayList;
import java.util.List;

public class MemberGeneric {

	public static void main(String[] args) {
		// Member 제네릭을 사용한 경우
		List<Member> list = new ArrayList<Member>();
		
		Member m1 = new Member();
		m1.setName("김기동");
		m1.setId("kim");
		m1.setPassword("kim1234");
		m1.setAge(20);
		
		list.add(m1); // 리스트에 추가
		
		Member m2 = new Member();
		m2.setName("이기동");
		m2.setId("lee");
		m2.setPassword("lee1234");
		m2.setAge(30);
		
		list.add(m2); // 리스트에 추가
		
		Member m3 = new Member();
		m3.setName("박기동");
		m3.setId("park");
		m3.setPassword("park1234");
		m3.setAge(40);
		
		list.add(m3); // 리스트에 추가
		
		// 리스트 갯수
		System.out.println("list.size() : " + list.size());
		
		// 모든 리스트의 요소 (Member) 강제형변환 후 출력
		for (int i=0; i<list.size(); i++) {
			System.out.println("인덱스 : " + i
					+ ", 이름 : " + ((Member)list.get(i)).getName()
					+ ", 아이디 : " + ((Member)list.get(i)).getId()
					+ ", 비밀번호 :" + ((Member)list.get(i)).getPassword()
					+ ", 나이 : " + ((Member)list.get(i)).getAge());
		}
	}

}

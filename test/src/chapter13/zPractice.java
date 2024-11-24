package chapter13;

public class zPractice {}

//	01. 컬렉션 프레임워크 중 List 인터페이스의
//	구현 클래스가 아닌 것은?
//	1. ArrayList
//	2. Vector
//	3. LinkedList
//	4. HashMap
//
//	정답 : 4
//	HashMap 은 Map 인터페이스의 구현 클래스.


//	02. Collection 프레임워크 객체에 저장된 데이터를
//	순차적으로 접근하는데 사용되는 인터페이스로 각
//	요소들을 접근하기 위한 방법을 표준화한 인터페이스이다.
//	모든 Collection 객체는 이 인터페이스의 객체로 변환이
//	가능하다. 이 인터페이스는 무엇인가?
//
//	정답 : Iterator


//	03. 아래 예제는 MemberEx 클래스는 통해 3명의 회원
//	객체를 생성하고 List 인터페이스의 구현 클래스인
//	ArrayList 객체에 담은 것이다. 이 ArrayList 객체로
//	실행결과와 같이 전체 회원을 출력하는 코드를 완성하시오.
//
//	import java.util.ArrayList;
//	import java.util.List;
//	
//	public class Ex {
//		
//		public static void main(String[] args) {
//			MemberEx m1 = new MemberEx("kim", "김기동", 20);
//			MemberEx m2 = new MemberEx("lee", "이기동", 30);
//			MemberEx m3 = new MemberEx("park", "박기동", 40);
//			
//			List memberList = new ArrayList();
//			memberList.add(m1);
//			memberList.add(m2);
//			memberList.add(m3);
//			
//			// 전체 회원 출력
//		}
//		
//	}
//	
//	class MemberEx {
//		String id;
//		String name;
//		int age;
//		
//		MemberEx(String id, String name; int age) {
//			this.id = id;
//			this.name = name;
//			this.age = age;
//		}
//		
//		public String getId() {
//			return id;
//		}
//		
//		public void setId(String id) {
//			this.id = id;
//		}
//		
//		public String getName() {
//			return name;
//		}
//		
//		public void setName(String name) {
//			this.name = name;
//		}
//		
//		public int getAge() {
//			return age;
//		}
//		
//		public void setAge(int age) {
//			this.age = age;
//		}
//	}
//	
//	[실행 결과]
//	kim, 김기동, 20
//	lee, 이기동, 30
//	park, 박기동, 40
//
//	정답 :
//	for (int i=0; i<mamberList.size(); i++) {
//		MemberEx me = (MemberEx)memberList.get(i);
//		System.out.println(me.getId() + ", " 
//				+ me.getName() + ", "
//				+ me.getAge());
//	}
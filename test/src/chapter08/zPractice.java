package chapter08;

public class zPractice {}

//	01. 다음 ParentEx 클래스와 이 클래스를 상속받는
//	ChildEx 클래스를 보고 각 생성자의 코드를 보고
//	출력되는 순서를 작성하시오.
//
//	public class Excercise1 {
//		public static void main(String[] args) {
//			ChildEx ce = new ChildEx();
//		}
//	}
//	
//	class ParentEx {
//		ParentEx() {
//			this(1);
//			System.out.println("(1)");
//		}
//		ParentEx(int x) {
//			System.out.println("(2)");
//		}
//	}
//	
//	class ChildEx extends ParentEx {
//		ChildEx() {
//			this(1);
//			System.out.println("(3)");
//		}
//		ChildEx(int x) {
//			System.out.println("(4)");
//		}
//	}
//
//	정답 : 2 - 1 - 4 - 3 순서로 출력됨.
//	자식 객체인 ChildEx 클래스로 객체를 생성하였지만,
//	객체를 생성하는 순간 부모 클래스인 ParentEx 클래스의
//	생성자가 먼저 호출됨.


//	02. 위 문제의 ParentEx 와 ChildEx 클래스의 객체간
//	형변환에 대해 올바르지 않은 것을 고르시오.
//
//	ChildEx ce = new ChildEx();
//	ParentEx pe = new ParentEx();
//	
//	pe = ce; // 1
//	pe = (ParentEx)pe; // 2
//	ce = pe; // 3
//	ce = (ChildEx)ce; // 4
//
//	정답 : 3 
//	자식 객체는 부모 클래스 타입으로 자동 형변환이 가능
//	하지만, 부모 객체를 자식 클래스 타입으로 변환하려면
//	반드시 강제 형변환을 해야 한다. // ce = (ChildEx)pe;


//	03. 아래 3개의 클래스가 있다. 이 클래스를 살펴 보고
//	공통적인 부분을 뽑아 상위 클래스를 생성해 상속 받고자
//	한다. Character 라는 클래스를 만들어 3개의 클래스들이
//	Character 클래스를 상속받도록 코드를 작성해보자.
//	(Character 클래스를 생성하고 아래 3개의 클래스는 다시 작성)
//
//	class Warrior {
//		int hp;
//		int power;
//		int weapon;
//		
//		public void attack (Object target) {
//			System.out.println("공격");
//		}
//		
//		public void defense (Object target) {
//			System.out.println("방어");
//		}
//	}
//	
//	class Gladiator {
//		int hp;
//		int power;
//		int shield;
//		
//		public void attack (Object target) {
//			System.out.println("공격");
//		}
//		
//		public void powerAttack(Object taget) {
//			System.out.println("강한공격");
//		}
//	}
//	
//	class Wizard {
//		int hp;
//		int power;
//		int heal;
//		
//		public void attack (Object target) {
//			System.out.println("공격");
//		}
//		
//		public void healing (Object target) {
//			System.out.println("회복");
//		}
//	}
//
//	정답 :
//	class Character {
//		int hp;
//		int power;
//		
//		public void attack (Object target) {
//			System.out.println("공격");
//		}
//	}
//	
//	class Warrior extends Character {
//		int weapon;
//		
//		public void defense (Object target) {
//			System.out.println("방어");
//		}
//	}
//	
//	class Gladiator extends Character {
//		int shiled;
//		
//		public void powerAttack (Object target) {
//			System.out.println("강한공격");
//		}
//	}
//	
//	class Wizard extends Character {
//		int heal;
//		
//		public void healing (Object target) {
//			System.out.println("회복");
//		}
//	}


//	04. final 에 대한 설명으로 올바른 것은?
//	1. final 필드는 값이 대입되면 수정할 수 없다.
//	2. final 메서드는 재정의 할 수 있다.
//	3. final 클래스는 상속 받을 수 있다.
//	4. 상수는 private final 로 정의한다.
//
//	정답 : 1
//	final 필드(변수)는 저장된 값을 변경 불가.
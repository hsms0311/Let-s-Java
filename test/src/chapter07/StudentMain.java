package chapter07;

public class StudentMain {

	public static void main(String[] args) {
//		Student st1 = new Student("김기동", 1, "사회복지학과");
//		
//		System.out.println(st1.name);
//		System.out.println(st1.grade);
//		System.out.println(st1.department);
//		
//		System.out.println();
//		
//		Student st2 = new Student("킹세종", 4, "국어국문학과");
//		
//		System.out.println(st2.name);
//		System.out.println(st2.grade);
//		System.out.println(st2.department);
//		
//		// 기본 생성자로 객체 생성.
//		Student st = new Student();
		
		Student st1 = new Student(); // 1번 (기본) 생성자
		Student st2 = new Student("김기동"); // 2번 생성자
		Student st3 = new Student("김기동", 1); // 3번 생성자
		Student st4 = new Student("김기동", 1, "사회복지학과"); // 4번 생성자
		
	}

}

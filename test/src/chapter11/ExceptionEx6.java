package chapter11;

public class ExceptionEx6 {

	public static void main(String[] args) {
		System.out.println("DB 연결 시작");
		try {
			System.out.println("DB 작업");
			System.out.println(3/0);
		} catch(Exception e) {
			System.out.println("DB 작업 중 예외 발생");
		} finally {
			System.out.println("DB 연결 종료");
		}
	}

}

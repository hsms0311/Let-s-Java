package chapter11;

public class ExceptionEx5 {

	public static void main(String[] args) {
		System.out.println("DB 연결 시작");
		try {
			System.out.println("DB 작업");
		} catch(Exception e) {
			System.out.println("DB 작업 중 예외 발생");
		} finally {
			System.out.println("DB 연결 종료");
		}
	}

}

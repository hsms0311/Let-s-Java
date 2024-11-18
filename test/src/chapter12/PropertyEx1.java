package chapter12;

public class PropertyEx1 {

	public static void main(String[] args) {
		// 자바 버전
		System.out.println(System.getProperty("java.version"));
		
		// JDK 경로
		System.out.println(System.getProperty("java.home"));
		
		// OS
		System.out.println(System.getProperty("os.name"));
		
		// 파일 구분자(리눅스, 유닉스는 /)
		System.out.println(System.getProperty("file.separator"));
		
		// 사용자명
		System.out.println(System.getProperty("user.name"));
		
		// 사용자 홈디렉토리
		System.out.println(System.getProperty("user.home"));

		// 현재 워크스페이스 디렉토리
		System.out.println(System.getProperty("user.dir"));
	}

}

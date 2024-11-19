package chapter12.string;

public class StringEx7 {

	public static void main(String[] args) {
		String str = "Hello My Name Is Kim Ki Dong";
		
		System.out.println(str.charAt(6)); // 6번 인덱스의 문자
		System.out.println(str.equals("Hello My Name Is Kim Ki Dong")); // 문자열값 비교
		System.out.println(str.indexOf("Kim")); // "Kim" 문자열의 위치
		System.out.println(str.indexOf("K")); // "K" 문자의 위치
		System.out.println(str.substring(17)); // 17번 인덱스부터 끝까지 잘라냄
		System.out.println(str.substring(6, 13)); // 6번 인덱스부터 13번 전 인덱스(12) 까지 문자열
		System.out.println(str.toLowerCase()); // 소문자로 변경
		System.out.println(str.toUpperCase()); // 대문자로 변경
		System.out.println(str.length()); // 문자열의 길이
		System.out.println(str.startsWith("Hello")); // "Hello" 으로 시작하는지 여부
		System.out.println(str.endsWith("Dong")); // "Dong" 으로 끝나는지 여부
		System.out.println(str.replace("Dong", "Kim")); // "Dong" 을 "Kim" 으로 치환
		System.out.println(str.replaceAll("Name", "NickName")); // "Name" 을 "NickName" 으로 치환
		System.out.println(str.toString());
		
		str = "  안녕하새오,  반갑슴미다.  ";
		System.out.println(str.trim()); // 앞뒤 공백 제거
		System.out.println(str.replace(" ", "")); // 모든 공백 제거
		
		str = String.valueOf(10); // 기본 자료형 int 를 문자열로 변환
		str = String.valueOf(10.5); // 기본 자료형 double 을 문자열로 변환
		
		str = "김기동,이기동,박기동,유기동";
		String[] arr = str.split(","); // , 를 구분자로 나눠서 배열로 리턴
		for (int i=0; i<arr.length; i++) {
			System.out.println(i + "번 인덱스 값 : " + arr[i]);
		}
	}

}

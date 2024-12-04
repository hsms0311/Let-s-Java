package chapter19;

public class zPractice {}

//	01. TCP 와 UDP 의 설명 중 올바르지 않은 것은?
//	1. TCP 와 전송순서 보장.
//	2. UDP 는 전송순서 보장하지 않음.
//	3. TCP 는 1대1 방식.
//	4. TCP 는 UDP 에 비해 전송속도가 빠름.
//
//	정답 : 4
//	TCP 는 UDP 에 비해 전송속도가 느림


//	02. UDP 통신에서 발신자와 수신자 모두 사용되는 클래스명은?
//
//	정답 : DatagramSocket


//	03. 아래 예제는 URL 클래스를 이용하여 해당 url 페이지를
//	읽어와 InputStreamReader 클래스로 객체를 생성하여 출력하는
//	예제이다. InputStreamReader 생성자에 들어갈 코드를 작성하시오.
//
//	import java.io.IOException;
//	import java.io.InputStreamReader;
//	import java.io.Reader;
//	import java.net.URL;
//	
//	public class ex {
//		
//		public static void main(String[] args) {
//			try {
//				URL url = null;
//				url = new URL("https://www.google.co.kr");
//				
//				int data = 0;
//				try {
//					Reader is = new InputStreamReader(________);
//					while ((data = is.read()) != -1) {
//						System.out.println((char)data);
//					}
//					System.out.println();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//		}
//		
//	}
//
//	정답 : url.openStream()
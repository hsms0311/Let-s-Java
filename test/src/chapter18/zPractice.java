package chapter18;

public class zPractice {}

//	01. 입출력 스트림에 대한 설명 중 올바르지 않은 것은?
//	1. 파일에 쓰는 것도 출력 스트림을 사용한다.
//	2. 하나의 클래스로 입력과 출력 동시에 처리 가능하다.
//	3. 프로그램으로 데이터 들어오면 입력이다.
//	4. 화면에 출력되는 것도 출력이다.
//	
//	정답 : 2
//	입력과 출력은 동시에 출력할 수 없음.


//	02. 출력 스트림에서 flush() 메서드가 하는 기능은?
//
//	정답 : 출력 버퍼를 강제로 비우고 데이터를 출력함.


//	03. 아래 예제는 FileReader 로 파일을 읽고 보조 스트림
//	BufferedReader 를 통해 한 줄씩 출력하는 코드이다.
//	while 문 빈칸에 들어갈 코드를 작성하시오.
//
//	import java.io.BufferedReader;
//	import java.io.FileReader;
//	import java.io.IOException;
//	
//	public class ex {
//		
//		public static void main(String[] args) {
//			FileReader fr = null;
//			BufferedReader br = null;
//			
//			try {
//				fr = new FileReader("src/chapter18/InputStreamEx.java");
//				br = new BufferedReader(fr);
//				
//				String txt = null;
//				while ((________) != null) {
//					System.out.println(txt);
//				}
//			} catch (IOException e) {
//				
//			} finally {
//				try {
//					fr.close();
//					br.close();
//				} catch (Exception e) {
//					System.out.println(e);
//				}
//			}
//		}
//		
//	}
//
//	정답 : txt = br.readLine()
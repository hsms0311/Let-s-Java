package chapter18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("test3.txt");
			// 문자 하나 출력
			fw.write('A');
			char[] buf = {'B', 'C', 'D'};
			// 문자 배열 출력
			fw.write(buf);
			// 문자 배열 off 부터 len 개수만큼 출력
			fw.write(buf, 1, 2);
			// 문자열 출력
			fw.write("김기동은 김기동이다");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

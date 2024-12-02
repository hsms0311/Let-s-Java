package chapter18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("test4.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			// 문자 하나 출력
			bw.write('A');
			char[] buf = {'B', 'C', 'D'};
			// 문자 배열 출력
			bw.write(buf);
			// 문자 배열 off 부터 len 개수만큼 출력
			bw.write(buf, 1, 2);
			// 문자열 출력
			bw.write("이기동도 이기동이다");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

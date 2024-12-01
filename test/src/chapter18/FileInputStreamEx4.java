package chapter18;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileInputStreamEx4 {

	public static void main(String[] args) {
		try {
			// InputStreamReader 객체 생성
			Reader r = new InputStreamReader(System.in);
			int data = 0;
			while ((data = r.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			
		}
	}

}

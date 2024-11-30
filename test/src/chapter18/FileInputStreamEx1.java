package chapter18;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"src/chapter18/InputStreamEx.java");
			int data = 0;
			while ((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			
		}
	}

}

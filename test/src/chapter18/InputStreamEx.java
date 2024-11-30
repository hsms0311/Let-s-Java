package chapter18;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {

	public static void main(String[] args) {
		try {
			InputStream is = System.in;
			int data = 0;
			while ((data = is.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			
		}
	}

}

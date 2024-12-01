package chapter18;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		try {
			OutputStream os = System.out;
			os.write('a');
			os.write('b');
			os.write('c');
			os.write('1');
			os.write('2');
			os.write('3');
			os.write('가');
			os.write('나');
			os.write('다');
			os.flush();
			os.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

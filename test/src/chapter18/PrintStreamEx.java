package chapter18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = 
					new FileOutputStream("print.txt", true);
			PrintStream ps = new PrintStream(fos);
			ps.println("김기동");
			ps.println(1234);
			ps.println(true);
			ps.println(3.14);
			ps.flush();
			ps.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}

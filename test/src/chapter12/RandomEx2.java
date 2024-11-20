package chapter12;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		Random r = new Random();
		
		for (int i=0; i<3; i++) {
			System.out.println(r.nextInt(5)+1);
		}
	}

}

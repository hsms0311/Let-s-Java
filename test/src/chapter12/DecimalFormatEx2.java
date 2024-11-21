package chapter12;

import java.text.DecimalFormat;

public class DecimalFormatEx2 {

	public static void main(String[] args) {
		double[] scores = {90.555, 80.6666, 70.77, 60.6, 50.55555};
		
		DecimalFormat df = new DecimalFormat("#, ###.000");
		
		for (int i=0; i<scores.length; i++) {
			System.out.println(df.format(scores[i]));
		}
	}

}

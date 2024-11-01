package chapter05;

public class qwer
{

	public static void main(String[] args)
	{
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i=5; i>=1; i--) {
			for (int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i=1; i<=5; i++) {
			for (int j=5-i; j>0; j--) {
				System.out.print(" ");
			}
			for (int k=1; k<=i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		int count = 0;

		while (true) {
			int dice = (int)(Math.random()*6)+1;

			System.out.println("(" + dice + ")");

			count++;

			if (dice == 6) {
				break;
			}
		}
		System.out.println("총 주사위 굴린 횟수는 : " + count + "회");
	}
}


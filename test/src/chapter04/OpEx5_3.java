package chapter04;

public class OpEx5_3
{

	public static void main(String[] args)
	{
		int a = 10;
		int b = 0;
		
//		// &
//		System.out.println(b > 0 & (a / b > 0)); // 에러

		// &&
		System.out.println(b > 0 && (a / b > 0));
	}
}

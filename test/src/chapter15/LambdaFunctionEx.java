package chapter15;

public class LambdaFunctionEx {

	public static void main(String[] args) {
		Interface i = (int x, int y) -> x + y;
		
		System.out.println(i.sum(1, 2));
	}

}

interface Interface {
	public int sum(int x, int y);
}
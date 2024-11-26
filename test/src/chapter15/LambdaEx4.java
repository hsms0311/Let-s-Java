package chapter15;

public class LambdaEx4 {

	public static void main(String[] args) {
		LambdaInterfaceExe li = (x, y) -> {
			return x * y;
		};
		System.out.println("두 수의 곱 : " + li.cal(3, 2));
		
		li = (x, y) -> x + y;
		System.out.println("두 수의 합 : " + li.cal(3, 2));
		
		li = (x, y) -> { return x / y;};
		System.out.println("두 수의 몫 : " + li.cal(5, 2));
		
		li = (x, y) -> x % y;
		System.out.println("두 수의 나머지 : " + li.cal(5, 2));
		
		li = (x, y) -> sum(x, y);
		System.out.println("두 수의 합(sum()) : " + li.cal(3, 2));
	}
	
	static int sum(int x, int y) {
		return x + y;
	}

}

@FunctionalInterface
interface LambdaInterfaceExe {
	int cal(int x, int y);
}
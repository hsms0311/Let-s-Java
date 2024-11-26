package chapter15;

public class LambdaEx3 {

	public static void main(String[] args) {
		LambdaInterfaceEx li = (String name) -> {
			System.out.println("제 이름은 " + name + "입니다");
		};
		
		li.print("김기동");
	}

}

@FunctionalInterface
interface LambdaInterfaceEx {
	void print(String name);
}
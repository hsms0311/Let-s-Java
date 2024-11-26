package chapter15;

public class LambdaEx1 {

	public static void main(String[] args) {
		LambdaInterface li = () -> {
			String s = "메서드 출력";
			System.out.println(s);
		};
		
		li.print();
	}

}

interface LambdaInterface {
	void print();
	// void print2() // 에러
}
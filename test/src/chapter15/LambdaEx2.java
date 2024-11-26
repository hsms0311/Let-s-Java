package chapter15;

public class LambdaEx2 {

	public static void main(String[] args) {
		System.out.println("시작");
		Runnable r1 = () -> {
			for (int i=0; i<=10; i++) {
				System.out.println("첫 번째 : " + i);
			}
		};
		
		Runnable r2 = () -> {
			for (int i=0; i<=10; i++) {
				System.out.println("두 번째 : " + i);
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		
		System.out.println("종료");
	}

}

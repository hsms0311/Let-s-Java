package chapter17;

public class ThreadEx1 {

	public static void main(String[] args) {
		// Thread 상속 방법
		ThreadExtend t1 = new ThreadExtend();
		
		// Runnable 구현 방법
		Runnable r = new RunnableImple();
		
		// Thread 생성자의 매개변수로 전달
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}

}

class ThreadExtend extends Thread {
	public void run() {
		System.out.println("Thread 상속 방법");
		for (int i=0; i<10; i++) {
			System.out.println("ThreadExtend : " + i);
		}
	}
}

class RunnableImple implements Runnable {
	public void run() {
		System.out.println("Runnable 구현 방법");
		for (int i=0; i<10; i++) {
			System.out.println("RunnalbleImple : " + i);
		}
	}
}
package chapter17;

public class ThreadEx16 {

	public static void main(String[] args) {
		// 그룹 객체 생성
		ThreadGroup tg = new ThreadGroup("Group1");
		
		MyThread t1 = new MyThread(tg, "First");
		MyThread t2 = new MyThread(tg, "Second");
		MyThread t3 = new MyThread(tg, "Third");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		
		// 모든 스레드 중지
		tg.interrupt();
	}

}

class MyThread extends Thread {
	MyThread(ThreadGroup tg, String name) {
		super(tg, name);
	}
	
	@Override
	public void run() {
		while (true) {
			System.out.println(getName());
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted 발생");
				break;
			}
		}
		System.out.println(getName() + " 종료");
	}
}
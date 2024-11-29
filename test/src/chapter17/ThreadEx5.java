package chapter17;

public class ThreadEx5 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i=0; i<10; i++) {
					System.out.println("t1 : " + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						
					}
				}
				System.out.println("스레드 종료");
			}
		});
		
		t1.start();
	}

}

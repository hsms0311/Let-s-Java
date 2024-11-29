package chapter17;

public class ThreadEx6 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					int i = 1;
					while (true) {
						System.out.println("t1 : " + i);
						// sleep 을 넣지 않으면 interrupt 되지 않음
						Thread.sleep(100);
						i++;
					}
				} catch (InterruptedException e) {
					
				}
				System.out.println("스레드 종료");
			}
			
		});
		
		t1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		
		t1.interrupt();
	}

}

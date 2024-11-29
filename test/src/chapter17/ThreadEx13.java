package chapter17;

public class ThreadEx13 {

	public static void main(String[] args) {
		Game4 game4 = new Game4();
		
		Player7 p7 = new Player7();
		p7.setGame4(game4);
		p7.start();
		
		Player8 p8 = new Player8();
		p8.setGame4(game4);
		p8.start();
	}

}

class Game4 {
	private int level;
	
	public int getLevel() {
		return this.level;
	}
	
	public synchronized void increaseLevel() {
		while (true) {
			this.level++; // 레벨 1씩 증가
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			// 현재 스레드의 이름과 레벨 출력
			System.out.println(Thread.currentThread().getName()
					+ " Level : " + this.level);
			
			if (this.level == 5) {
				notifyAll();
				try {
					wait();
				} catch (InterruptedException e) {
					
				}
				break;
			}
			
			// 레벨이 10의 배수가 되면 종료
			if (this.level % 10 == 0) break;
		}
	}
}

class Player7 extends Thread {
	private Game4 game4;
	
	public void setGame4(Game4 game4) {
		this.setName("Player7");
		this.game4 = game4;
	}
	
	@Override
	public void run() {
		game4.increaseLevel();
	}
}

class Player8 extends Thread {
	private Game4 game4;
	
	public void setGame4(Game4 game4) {
		this.setName("Player8");
		this.game4 = game4;
	}
	
	@Override
	public void run() {
		game4.increaseLevel();
	}
}
package chapter17;

public class ThreadEx12 {

	public static void main(String[] args) {
		Game3 game3 = new Game3();
		
		Player5 p5 = new Player5();
		p5.setGame3(game3);
		p5.start();
		
		Player6 p6 = new Player6();
		p6.setGame3(game3);
		p6.start();
	}

}

class Game3 {
	private int level;
	
	public int getLevel() {
		return this.level;
	}
	
	public void increaseLevel() {
		synchronized (this) {
			while (true) {
				this.level++; // 레벨 1씩 증가
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
				}
				// 현재 스레드의 이름과 레벨 출력
				System.out.println(Thread.currentThread().getName()
						+ " Level : " + this.level);
				
				// 레벨이 10의 배수가 되면 종료
				if (this.level % 10 == 0) break;
			}
		}
	}
}

class Player5 extends Thread {
	private Game3 game3;
	
	public void setGame3(Game3 game3) {
		this.setName("Player5");
		this.game3 = game3;
	}
	
	@Override
	public void run() {
		game3.increaseLevel();
	}
}

class Player6 extends Thread {
	private Game3 game3;
	
	public void setGame3(Game3 game3) {
		this.setName("Player6");
		this.game3 = game3;
	}
	
	@Override
	public void run() {
		game3.increaseLevel();
	}
}
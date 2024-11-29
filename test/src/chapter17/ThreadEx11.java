package chapter17;

public class ThreadEx11 {

	public static void main(String[] args) {
		Game2 game2 = new Game2();
		
		Player3 p3 = new Player3();
		p3.setGame2(game2);
		p3.start();
		
		Player4 p4 = new Player4();
		p4.setGame2(game2);
		p4.start();
	}

}

class Game2 {
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
			
			// 레벨이 10의 배수가 되면 종료
			if (this.level % 10 == 0) break;
		}
	}
}

class Player3 extends Thread {
	private Game2 game2;
	
	public void setGame2(Game2 game2) {
		this.setName("Player3");
		this.game2 = game2;
	}
	
	@Override
	public void run() {
		game2.increaseLevel();
	}
}

class Player4 extends Thread {
	private Game2 game2;
	
	public void setGame2(Game2 game2) {
		this.setName("Player4");
		this.game2 = game2;
	}
	
	@Override
	public void run() {
		game2.increaseLevel();
	}
}
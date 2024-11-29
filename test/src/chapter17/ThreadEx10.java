package chapter17;

public class ThreadEx10 {

	public static void main(String[] args) {
		// 게임 객체 생성
		Game1 game1 = new Game1();
		
		// 플레이어1 객체 생성 후 스레드 실행
		Player1 p1 = new Player1();
		p1.setGame1(game1);
		p1.start();
		
		// 플레이어2 객체 생성 후 스레드 실행
		Player2 p2 = new Player2();
		p2.setGame1(game1);
		p2.start();
	}

}

class Game1 {
	private int level;
	
	public int getLevel() {
		return this.level;
	}
	
	public void increaseLevel() {
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

class Player1 extends Thread {
	private Game1 game1;
	
	public void setGame1(Game1 game1) {
		this.setName("Player1");
		this.game1 = game1;
	}
	
	@Override
	public void run() {
		game1.increaseLevel();
	}
}

class Player2 extends Thread {
	private Game1 game1;
	
	public void setGame1(Game1 game1) {
		this.setName("Player2");
		this.game1 = game1;
	}
	
	@Override
	public void run() {
		game1.increaseLevel();
	}
}
package chapter17;

public class ThreadEx14 {

	public static void main(String[] args) {
		// 통장 객체 생성
		Account a = new Account();
		
		// 부모 스레드 객체 생성
		Parent p = new Parent(a);
		
		// 자식 스레드 객체 생성
		Child c = new Child(a);
		
		p.start();
		c.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		
		// 스레드 중지
		c.interrupt();
		p.interrupt();
	}

}

class Account {
	int money;
	
	// 출금
	synchronized void withdraw() {
		while (money == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				break;
			}
		}
		
		notifyAll();
		System.out.println(Thread.currentThread().getName() + money + "원 출금");
		money = 0;
	}
	
	// 입금
	synchronized void deposit() {
		while (money > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				break;
			}
		}
		
		// 랜덤 입금 1~5 만원
		System.out.println();
		money = (int)((Math.random() * 5) + 1) * 10000;
		System.out.println(Thread.currentThread().getName() + money + "원 입금");
		notifyAll();
	}
}

class Parent extends Thread {
	Account account;
	
	Parent(Account account) {
		super("부모");
		this.account = account;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				account.deposit();
				sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}

class Child extends Thread {
	Account account;
	
	Child(Account account) {
		super("자식");
		this.account = account;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				if (account.money > 0) {
					account.withdraw();
				}
				sleep((int)(Math.random() * 500));
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
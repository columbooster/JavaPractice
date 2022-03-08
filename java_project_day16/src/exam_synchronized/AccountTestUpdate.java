package exam_synchronized;

public class AccountTestUpdate {

	public static void main(String[] args) {
		Account account = new Account();
		DrawThread t1 = new DrawThread(account);
		DrawThread t2 = new DrawThread(account);

		t1.start();
		t2.start();
	}

}

class Account {
	private long balance = 1000;

	public synchronized void draw(long amount) {
		balance -= amount;
	}

	public long getBalance() {
		return balance;
	}
}

class DrawThread extends Thread {
	private Account account;

	public DrawThread(Account account) {
		this.account = account;
	}

	// 블록동기화 : account 객체가 하나의 스레드에 의해 사용되고 있는 경우 이 스레드의 작업이 완료될
	// 때까지 다른 스레드는 account에 접근할 수 업도록한다.
	@Override
	public void run() {

		synchronized (account) {
			for (int i = 0; i < 10; i++) {
				account.draw(10);
				System.out.println(this.getName() + "출금 후 잔액 " + account.getBalance());
			}
		}

	}

	// 메서드 동기화 : 한 스레드에 의해 호출되었다면 실행이 완료될 때까지 다른 스레드는 실행할 수 없다.
//	@Override
//	public synchronized void run() {
//		for (int i = 0; i < 10; i++) {
//			account.draw(10);
//			System.out.println(this.getName() + "출금 후 잔액 " + account.getBalance());
//		}
//	}

}
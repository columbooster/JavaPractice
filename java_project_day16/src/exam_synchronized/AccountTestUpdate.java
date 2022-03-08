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

	// ��ϵ���ȭ : account ��ü�� �ϳ��� �����忡 ���� ���ǰ� �ִ� ��� �� �������� �۾��� �Ϸ��
	// ������ �ٸ� ������� account�� ������ �� �������Ѵ�.
	@Override
	public void run() {

		synchronized (account) {
			for (int i = 0; i < 10; i++) {
				account.draw(10);
				System.out.println(this.getName() + "��� �� �ܾ� " + account.getBalance());
			}
		}

	}

	// �޼��� ����ȭ : �� �����忡 ���� ȣ��Ǿ��ٸ� ������ �Ϸ�� ������ �ٸ� ������� ������ �� ����.
//	@Override
//	public synchronized void run() {
//		for (int i = 0; i < 10; i++) {
//			account.draw(10);
//			System.out.println(this.getName() + "��� �� �ܾ� " + account.getBalance());
//		}
//	}

}
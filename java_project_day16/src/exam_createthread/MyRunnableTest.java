package exam_createthread;

// sleep() �޼ҵ�� ������ �ð� ���� ���� �������� ������ �ߴ��Ѵ�.

class RunnableImpl implements Runnable {

	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class MyRunnableTest {

	public static void main(String[] args) {

		Thread t = new Thread(new RunnableImpl());
		t.start();

	}

}

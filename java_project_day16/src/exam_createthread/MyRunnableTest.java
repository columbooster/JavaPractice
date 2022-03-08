package exam_createthread;

// sleep() 메소드는 지정된 시간 동안 현재 스레드의 실행을 중단한다.

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

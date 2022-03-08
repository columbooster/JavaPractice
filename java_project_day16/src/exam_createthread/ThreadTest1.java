package exam_createthread;

class MyRunnable implements Runnable {

	String myName;

	public MyRunnable(String myName) {
		this.myName = myName;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(myName + i);
		}
	}

}

public class ThreadTest1 {

	public static void main(String[] args) {
		
		MyRunnable r1 = new MyRunnable("First Thread");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(new MyRunnable("Second Thread"));
		
		t1.start();
		t2.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Thied Thread" + i);
		}
		
		
	}

}

package exam_createthread;

class Work1 extends Thread {
	public Work1() {
		setName("파일저장");
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) { // 스레드에서 동작할 명령문들은 run() 메소드에 구현한다.
			System.out.println(this.getName() + "작업 중...");
		}
	}

}

class Work2 extends Thread {
	public Work2() {
		setName("서버연결");
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(this.getName() + "작업 중...");
		}
	}

}

public class MyThreadTest {

	public static void main(String[] args) {
		
		Work1 w1 = new Work1();
		Work2 w2 = new Work2();
		
		w1.start();
		w2.start();

	}

}

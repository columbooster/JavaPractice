package exam_createthread;

class Work1 extends Thread {
	public Work1() {
		setName("��������");
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) { // �����忡�� ������ ��ɹ����� run() �޼ҵ忡 �����Ѵ�.
			System.out.println(this.getName() + "�۾� ��...");
		}
	}

}

class Work2 extends Thread {
	public Work2() {
		setName("��������");
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(this.getName() + "�۾� ��...");
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

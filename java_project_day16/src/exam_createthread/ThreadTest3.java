package exam_createthread;

import java.util.Random;

/* ���� ������ �渶����(��ǳ, ����, ���丶)�� �ۼ��Ͽ� ����.
 * �̹����� ������ �Ű������� �Ͽ� sleep()�� ȣ���ϴ� �����带 ���� �� �����Ѵ�.
 * sleep() �޼ҵ�� ������ �ð� ���� ���� �������� ������ �ߴ��Ѵ�.
 */

//class Game extends Thread {
//
//	private String name;
//
//	public Game(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public void run() {
//
//		try {
//			Thread.sleep((int) Math.random());
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println(name + "�� �����߽��ϴ�.");
//
//	}
//
//}

class Horse implements Runnable {
	private String name;
	private int sleepTime;
	private final static Random generator = new Random();

	public Horse(String name) {
		this.name = name;
		sleepTime = generator.nextInt(3000);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "�� �����߽��ϴ�.");
	}

}

public class ThreadTest3 {

	public static void main(String[] args) {

//		Game game1 = new Game("��ǳ");
//		Game game2 = new Game("����");
//		Game game3 = new Game("���丶");
//
//		game1.start();
//		game2.start();
//		game3.start();
		
		
		Thread t1 = new Thread(new Horse("��ǳ"));
		Thread t2 = new Thread(new Horse("����"));
		Thread t3 = new Thread(new Horse("���丶"));
		
		t1.start();
		t2.start();
		t3.start();

	}

}

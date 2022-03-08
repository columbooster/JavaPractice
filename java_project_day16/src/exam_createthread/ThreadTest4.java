package exam_createthread;

class Food extends Thread {
	private String name;

	public Food(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(name + i);
		}
	}

}

class Phone extends Thread {
	private String name;

	public Phone(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(name + i);
		}
	}

}

public class ThreadTest4 {

	public static void main(String[] args) {

		Food work1 = new Food("À½½Ä¸Ô±â : ");
		Phone work2 = new Phone("Ä«ÅåÈ®ÀÎ : ");

		work1.start();
		work2.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("TV º¸±â : " + i);
		}

	}

}

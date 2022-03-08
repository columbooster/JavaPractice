package exam_sleep;

public class SleepTest {

	public static void main(String[] args) {
		String message[] = { "Pride will have a fall.", "Power is dangerous unless you have humility.",
				"Office changes manners.", "Empty vessels make the most sound" };

		for (int i = 0; i < message.length; i++) {
			try {
				Thread.sleep(1000); // 1000밀리초동안 실행을 중지한다.
				System.out.println(message[i]);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

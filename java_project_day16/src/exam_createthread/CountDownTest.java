package exam_createthread;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel label;

	class MyThread extends Thread {

		@Override
		public void run() { // ���� Ŭ����
			for (int i = 10; i > 0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i + "");
			}
		}

	}

	public CountDownTest() {
		setTitle("ī��Ʈ�ٿ�");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label = new JLabel("Start", JLabel.CENTER);
		label.setFont(new Font("Serif", Font.BOLD, 100));
		add(label);
		new MyThread().start();

		setVisible(true);

	}

	public static void main(String[] args) {

		new CountDownTest();

	}

}

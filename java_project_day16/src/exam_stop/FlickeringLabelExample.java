package exam_stop;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

//깜빡이는 문자열을 가진 레이블 만들기
class FlickeringLabel extends JLabel implements Runnable {

	private static final long serialVersionUID = 1L;

	public FlickeringLabel(String text) {
		super(text); // JLabel 생성자 호출
		setOpaque(true); // 배경색 변경이 가능하도록 설정

		Thread th = new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			if (n == 0) {
				setBackground(Color.YELLOW);
				n = 1;
			} else {
				setBackground(Color.GREEN);
				n = 0;
			}

			try {
				Thread.sleep(500); // 0.5초 동안 잠을 잔다.
			} catch (InterruptedException e) {
			}
		}
	}

}

public class FlickeringLabelExample extends JFrame {
	private static final long serialVersionUID = 1L;

	public FlickeringLabelExample() {
		setTitle("FlickeringLabelExample 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		// 깜빡이는 레이블 생성
		FlickeringLabel fLabel = new FlickeringLabel("오늘도");

		// 깜빡이지 않는 레이블 생성
		JLabel label = new JLabel("최선을 다해 ");

		// 깜빡이는 레이블 생성
		FlickeringLabel fLabel2 = new FlickeringLabel("하루를 보내길...");

		add(fLabel);
		add(label);
		add(fLabel2);

		setSize(300, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		
		new FlickeringLabelExample();

	}

}

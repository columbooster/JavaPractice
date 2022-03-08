package exam_stop;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

//�����̴� ���ڿ��� ���� ���̺� �����
class FlickeringLabel extends JLabel implements Runnable {

	private static final long serialVersionUID = 1L;

	public FlickeringLabel(String text) {
		super(text); // JLabel ������ ȣ��
		setOpaque(true); // ���� ������ �����ϵ��� ����

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
				Thread.sleep(500); // 0.5�� ���� ���� �ܴ�.
			} catch (InterruptedException e) {
			}
		}
	}

}

public class FlickeringLabelExample extends JFrame {
	private static final long serialVersionUID = 1L;

	public FlickeringLabelExample() {
		setTitle("FlickeringLabelExample ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		// �����̴� ���̺� ����
		FlickeringLabel fLabel = new FlickeringLabel("���õ�");

		// �������� �ʴ� ���̺� ����
		JLabel label = new JLabel("�ּ��� ���� ");

		// �����̴� ���̺� ����
		FlickeringLabel fLabel2 = new FlickeringLabel("�Ϸ縦 ������...");

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

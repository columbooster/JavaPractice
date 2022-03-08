package exam_stop;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable {
	private JLabel timerLabel; // Ÿ�̸� ���� ��µ� ���̺�

	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	// ������ �ڵ�. run()�� �����ϸ� ������ ����
	@Override
	public void run() {
		int n = 0; // Ÿ�̸� ī��Ʈ ��.
		while (true) { // ���� ����
			timerLabel.setText(Integer.toString(n)); // Ÿ�̸� ���� ���̺� ���
			n++; // ī��Ʈ ����
			try {
				Thread.sleep(1000); // 1�� ���� ���� �ܴ�.
			} catch (InterruptedException e) {
				return; // ���ܰ� �߻��ϸ� ������ ����
			}
		}
	}

}

public class ThreadInterruptExample extends JFrame {

	private static final long serialVersionUID = 1L;

	private Thread th;

	public ThreadInterruptExample() {
		setTitle("ThreadInterruptEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout()); // ���̾ƿ� ����(���ʿ������� ��ġ)

		// Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));

		// Ÿ�̸� ������� ����� Runnable ��ü ����
		// Ÿ�̸� ���� ����� ���̺� ������Ʈ�� �����ڿ��� �����Ѵ�.
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable); // ������ ����
		add(timerLabel);

		// ��ư�� �����ϰ� Action ������ ���
		JButton btn = new JButton("kill Timer");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt(); // Ÿ�̸� ������ ��������
				JButton btn = (JButton) e.getSource();
				btn.setEnabled(false); // ��ư ��Ȱ��ȭ
			}
		});

		add(btn);

		setSize(300, 170);
		setVisible(true);

		th.start(); // ������ �۵���Ŵ

	}

	public static void main(String[] args) {

		new ThreadInterruptExample();

	}

}

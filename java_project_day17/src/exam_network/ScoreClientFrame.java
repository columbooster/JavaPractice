package exam_network;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ScoreClientFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private JTextField nameTf = new JTextField(7);
	private JLabel resLabel = new JLabel("����");
	private Socket socket = null;
	private BufferedReader in = null;
	private BufferedWriter out = null;

	public ScoreClientFrame() {
		super("���� üũ Ŭ���̾�Ʈ");
		setSize(300, 100); // JFrame�� ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ ����(x) ��ư Ŭ���ϸ� ���α׷� ����
		setLayout(new FlowLayout()); // ���̾ƿ� ���� (FlowLayout�� ���ʿ��� ���� ��ġ)
		add(new JLabel("�̸� �Է�"));
		add(nameTf);
		add(resLabel);

		setVisible(true);

		setupConnection();

		nameTf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField tf = (JTextField) e.getSource();
				try {
					String name = tf.getText().trim();
					if (name.length() == 0)
						return; // �Էµ��� �ʾ���

					out.write(name + "\n");
					out.flush();

					String score = in.readLine();
					resLabel.setText("���� " + score);

				} catch (IOException e2) {
					System.out.println("Ŭ���̾�Ʈ : �����κ��� ���� ����");
					return;
					// e2.printStackTrace();
				}

			}
		});

	}

	public void setupConnection() {
		try {
			socket = new Socket("localhost", 9998);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new ScoreClientFrame();
	}

}

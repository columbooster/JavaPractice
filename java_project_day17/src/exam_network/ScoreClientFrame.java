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
	private JLabel resLabel = new JLabel("점수");
	private Socket socket = null;
	private BufferedReader in = null;
	private BufferedWriter out = null;

	public ScoreClientFrame() {
		super("학점 체크 클라이언트");
		setSize(300, 100); // JFrame의 크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료(x) 버튼 클릭하면 프로그램 종료
		setLayout(new FlowLayout()); // 레이아웃 설정 (FlowLayout은 왼쪽에서 부터 배치)
		add(new JLabel("이름 입력"));
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
						return; // 입력되지 않았음

					out.write(name + "\n");
					out.flush();

					String score = in.readLine();
					resLabel.setText("성적 " + score);

				} catch (IOException e2) {
					System.out.println("클라이언트 : 서버로부터 연결 종료");
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

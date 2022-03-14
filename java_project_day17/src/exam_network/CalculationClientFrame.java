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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculationClientFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private JTextField startTf = new JTextField(7);
	private JTextField operatoTf = new JTextField(3);
	private JTextField endTf = new JTextField(7);
	private JTextField resTf = new JTextField(7);
	private JButton calcBtn = new JButton("계산");
	private Socket socket = null;
	private BufferedReader in = null;
	private BufferedWriter out = null;

	public CalculationClientFrame() {
		super("계산 클라이언트");
		setSize(410, 100); // JFrame의 크기 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료(x) 버튼 클릭하면 프로그램 종료
		setLayout(new FlowLayout()); // 레이아웃 설정 (FlowLayout은 왼쪽에서 부터 배치)
		add(startTf);
		add(operatoTf);
		add(endTf);
		add(new JLabel(" = "));
		add(resTf);
		add(calcBtn);

		setVisible(true); // JFrame 화면에 보여주기 위한 메소드

		setupConnection(); // 서버 소켓에 연동을 위한 소켓 인스턴스 생성 및 입, 출력 스트림 생성

		calcBtn.addActionListener(new ActionListener() { // anonymous 클래스 생성

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					String startText = startTf.getText().trim();
					String operatorText = operatoTf.getText().trim();
					String endText = endTf.getText().trim();
					if (startText.length() == 0 || operatorText.length() == 0 || endText.length() == 0)
						return; // 입력되지 않았음

					out.write(startText + "\n");
					out.write(operatorText + "\n");
					out.write(endText + "\n");
					out.flush();

					String result = in.readLine();
					resTf.setText(result);
				} catch (IOException e) {
					System.out.println("클라이언트 : 서버로부터 연결 종료");
					return;
					// e.printStackTrace();
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
		new CalculationClientFrame();
	}

}

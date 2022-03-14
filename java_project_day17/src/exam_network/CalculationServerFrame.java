package exam_network;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*하나의 서버에 다중 클라이언트가 동시에 접속하여 통신하는 프로그램을 작성해보자.
 * 계산 서버에는 JTextArea 창을 두고 클라이언트가 접속했음과 클라이언트가 보내온 수식, 그리고 계산 결과를 출력하여 서버 사용자에게 알리고
 * 클라이언트는 계산 버튼을 누르면 계산식을 서버로 전송하고 결과를 JTextField 결과 창에 출력한다.
 */

public class CalculationServerFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private JTextArea log = new JTextArea();

	public CalculationServerFrame() {
		super("멀티스레드 계산 서버");
		setSize(250, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료버튼 (x)을 클릭하면 프로그램 종료
		log.setEditable(false); // JTextArea의 입력 불가능
		add(new JLabel("계산 서버 입니다"), BorderLayout.PAGE_START);
		add(new JScrollPane(log), BorderLayout.CENTER);
		setVisible(true);

		new ServerThread().start(); // 서비스 시작
	}

	// 내부 클래스 선언(Thread 클래스)
	class ServerThread extends Thread {

		@Override
		public void run() {
			ServerSocket listener = null;
			Socket socket = null;
			try {
				listener = new ServerSocket(9998);
				while (true) {
					socket = listener.accept();
					log.append("클라이언트 연결됨\n");
					new ServiceThread(socket).start();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (listener != null)
					listener.close();
				if (socket != null)
					socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	class ServiceThread extends Thread {
		// private Socket socket = null;

		private BufferedReader in = null;
		private BufferedWriter out = null;

		public ServiceThread(Socket clientSocket) { // 클라이언트와 통신할 소켓을 전달받음
			// this.socket = socket;
			Socket socket = clientSocket;
			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		@Override
		public void run() {
			while (true) {
				try {
					String first = in.readLine(); // 첫 수
					String operator = in.readLine(); // 연산기호
					String second = in.readLine(); // 둘째 수
					int a = Integer.parseInt(first); // 정수로 변환
					int b = Integer.parseInt(second); // 정수로 변환

					String resText = "";
					int res = 0;
					switch (operator) {
					case "+":
						res = a + b;
						resText = Integer.toString(res);
						break;
					case "-":
						res = a - b;
						resText = Integer.toString(res);
						break;
					case "*":
						res = a * b;
						resText = Integer.toString(res);
						break;
					case "/":
						if (b == 0)
							resText = "0으로 나눌 수 없음";
						else {
							res = a / b;
							resText = Integer.toString(res);
						}
						break;
					default:
						resText = "잘못된 연산";

					}

					out.write(resText + "\n");
					out.flush();
					log.append(first + operator + second + "=" + resText + "\n");
				} catch (IOException e) {
					log.append("연결종료\n");
					System.out.println("연결 종료");
					return; // 스레드 종료
					// e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {

		new CalculationServerFrame();
	}

}

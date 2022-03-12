package exam_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class QuizClient {

	public static void main(String[] args) throws IOException {

		Socket quizSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;

		try {
			quizSocket = new Socket("localhost", 5555);

			out = new PrintWriter(quizSocket.getOutputStream(), true); // ��½�Ʈ��(�������� Ŭ���̾�Ʈ�� ����������)
			in = new BufferedReader(new InputStreamReader(quizSocket.getInputStream())); // �Է½�Ʈ��(�����κ��� �����͸� Ŭ���̾�Ʈ�� �о�帲)

		} catch (UnknownHostException e) {
			System.out.println("localhost�� ������ �� �����ϴ�.");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("����� ����");
			System.exit(1);
		}

		BufferedReader user = new BufferedReader(new InputStreamReader(System.in)); // ����ڷ� �Ͽ��� ������ �Է�
		String fromServer;
		String fromUser;

		while ((fromServer = in.readLine()) != null) {
			System.out.println("���� : " + fromServer);
			if (fromServer.equals("quit"))
				break;

			fromUser = user.readLine();
			if (fromUser != null) {
				System.out.println("Ŭ���̾�Ʈ : " + fromUser);
				out.println(fromUser);
			}
		}

		out.close();
		in.close();
		quizSocket.close();

	}

}

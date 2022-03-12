package exam_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// ���� ������ �����ϰ� ������ �˻��ϴ� ������ ������ �����Ͽ� ����

public class QuizServer {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(5555); // ServerSocket�� �ν��Ͻ��� �����Ѵ�.
			System.out.println("Ŭ���̾�Ʈ�� ��ٸ���. ");
		} catch (IOException e) {
			System.out.println("������ ��Ʈ ��ȣ�� ������ �� �����ϴ�: 5555");
			System.exit(1); // ���α׷��� ���� �����Ѵ�.
		}
		// Ŭ���̾�Ʈ�� ������ ���Ͽ� ������ ��ö�� ������ ��ٸ���.
		// ������ �Ǹ� ���ο� ��Ʈ�� ����� Socket ��ü�� ��ȯ�Ѵ�.
		Socket clientSocket = null;
		try {
			clientSocket = serverSocket.accept();
			System.out.println("������ Ŭ���̾�Ʈ ����Ǿ����ϴ�.");
		} catch (IOException e) {
			System.out.println("accept() ����");
			System.exit(1);
		}

		// ������ Ŭ���̾�Ʈ�� ��Ʈ���� �̿��Ͽ� ����Ѵ�.
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); // ��� ��Ʈ��(�������� Ŭ���̾�Ʈ�� ������ ����)

		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // �Է� ��Ʈ��(Ŭ���̾�Ʈ�κ��� ���޹��� ������ �о����)

		String inputLine, outputLine;
		QuizProtocol qp = new QuizProtocol();
		outputLine = qp.process(null);
		out.println(outputLine);

		while ((inputLine = in.readLine()) != null) {
			outputLine = qp.process(inputLine);
			out.println(outputLine);
			if (outputLine.equals("quit"))
				break;
		}
		out.close();
		in.close();

		clientSocket.close();
		serverSocket.close();

	}

}

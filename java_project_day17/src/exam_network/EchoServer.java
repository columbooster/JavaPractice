package exam_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// Ŭ���̾�Ʈ������ �� �پ� �ؽ�Ʈ�� �Է¹޾� ������ ������ ������ ���� �ؽ�Ʈ�� ����ϴ� ���� ���α׷��� �ۼ��϶�. Ŭ���̾�Ʈ�� "��"
// �� �����ϸ� Ŭ���̾�Ʈ�� ���� ��� ������ ���� �����ϸ� �ȴ�.

public class EchoServer {

	public static void main(String[] args) {

		BufferedReader in = null;
		ServerSocket listener = null;
		Socket socket = null;
		System.out.println("�����Դϴ�. Ŭ���̾�Ʈ�� ��ٸ��ϴ�...");

		try {
			listener = new ServerSocket(9999); // ���� ���� ����
			socket = listener.accept(); // Ŭ���̾�Ʈ�κ��� ���� ��û ���
			System.out.println("����Ǿ����ϴ�.");

			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Ŭ���̾�Ʈ�κ����� �Է� ��Ʈ��
			String inputMessage;
			while (true) {
				inputMessage = in.readLine(); // Ŭ���̾�Ʈ�κ��� �� ���� �ؽ�Ʈ ����
				if (inputMessage.equals("��")) { // Ŭ���̾�Ʈ�� "��"�� ������ ���� ����
					System.out.println("������ �����մϴ�.");
					break;
				}
				System.out.println("... " + inputMessage); // Ŭ���̾�Ʈ�� ���� �޼��� ȭ�� ���
			}
			socket.close(); // Ŭ���̾�Ʈ�� ��ſ� ���� �ݱ�
			listener.close(); // ���� ���� �ݱ�

		} catch (IOException e) {
			System.out.println("����� ������ �߻��Ͽ����ϴ�.");
		}

	}

}

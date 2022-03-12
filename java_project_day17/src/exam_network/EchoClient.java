package exam_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		BufferedWriter out = null;
		Socket socket = null;

		try {

			socket = new Socket("localhost", 9999); // Ŭ���̾�Ʈ ���� ����. ������ �ٷ� ����
			System.out.println("������ �����Ͽ����ϴ�...");

			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // �������� ��� ��Ʈ��
			String outputMessage;
			while (true) {
				System.out.print("�ؽ�Ʈ �Է� >> ");
				outputMessage = scanner.nextLine(); // Ű���忡�� �� ���� ���ڿ��� ����
				out.write(outputMessage + "\n"); // ������ ����
				out.flush();
				if (outputMessage.equals("��")) { // "��"�� �ԷµǸ� ������ ���� ����
					System.out.println("������ �����մϴ�.");
					break;
				}
			}
			socket.close(); // ��������. Ŭ���̾�Ʈ ���� �ݱ�
			scanner.close();

		} catch (IOException e) {
			System.out.println("����� ������ �߻��Ͽ����ϴ�.");
		}

	}

}

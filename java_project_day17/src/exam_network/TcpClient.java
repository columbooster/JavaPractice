package exam_network;

import java.io.*;
import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) {

		Socket client = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {

			client = new Socket("127.0.0.1", 8888);
			if (client.isConnected()) {
				System.out.println(" ������ ����� ");
			}

			System.out.println(" ���� �ּ� : " + client.getInetAddress());
			System.out.println(" ���� ��Ʈ : " + client.getPort());
			System.out.println(" ���� ��Ʈ : " + client.getLocalPort());
			System.out.println(" ���� �ּ� : " + client.getLocalAddress());

			dis = new DataInputStream(client.getInputStream());
			System.out.println("[�����κ��� ���޹��� ���ڿ�]");
			System.out.println(dis.readUTF());

			dos = new DataOutputStream(client.getOutputStream());
			dos.writeUTF("��ü�� ���� �η��� �ް���ġ�� ���� �ڱ� �ڽſ� " + "���� ���� ����� ���̴�. ������� ����ϸ鼭 ������ "
					+ "���ư��� �����̵� �س� �� �ְ� ��ŭ�̵� �̷� �� �ִ�.");
			dos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package exam_month;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {
		Socket client = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		int port = 9999;
		String serverIP;
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			client = new Socket(serverIP, port);
			if (client.isConnected()) {
				System.out.println(" ������ ����� ");
			}

			dis = new DataInputStream(client.getInputStream());
			System.out.println("[�����κ��� ���޹��� ���ڿ�]");
			System.out.println(dis.readUTF());

			dos = new DataOutputStream(client.getOutputStream());
			dos.writeUTF("�츮�� �� �� �ֱ� ���� ����� �ϴ� �ϵ���, �츮�� �ϸ鼭 ����.");
			dos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

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
				System.out.println(" 서버와 연결됨 ");
			}

			dis = new DataInputStream(client.getInputStream());
			System.out.println("[서버로부터 전달받은 문자열]");
			System.out.println(dis.readUTF());

			dos = new DataOutputStream(client.getOutputStream());
			dos.writeUTF("우리가 할 수 있기 전에 배워야 하는 일들을, 우리는 하면서 배운다.");
			dos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

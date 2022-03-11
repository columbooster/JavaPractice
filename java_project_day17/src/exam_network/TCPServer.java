package exam_network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {

		ServerSocket server = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
			server = new ServerSocket(8888); // ServerSocket�� �ν��Ͻ��� �����Ѵ�.
			System.out.println("Ŭ���̾�Ʈ�� ��ٸ���.");

			Socket st = server.accept(); // Ŭ���̾�Ʈ�� Socket Ŭ������ ���� ������ ����
			System.out.println("Ŭ���̾�Ʈ�� ���Ῡ�� : " + st.isConnected());

			System.out.println("���ü����ּ� : " + st.getLocalSocketAddress());

			dos = new DataOutputStream(st.getOutputStream());
			dos.writeUTF("����� ������� �ʴ´�.");

			dis = new DataInputStream(st.getInputStream());
			System.out.println("[Ŭ���̾�Ʈ�κ��� ���޹��� ���ڿ�]");
			System.out.println(dis.readUTF());
			dis.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

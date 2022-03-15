package exam_month;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {

		ServerSocket listener = null;
		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
			listener = new ServerSocket(9999);
			System.out.println("Ŭ���̾�Ʈ�� ��ٸ��ϴ�.");

			socket = listener.accept();
			System.out.println("Ŭ���̾�Ʈ�� ���� : " + socket.isConnected());

			dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF("���� �츮�� ������ ���� �䱸���� �ʴ´�. �츮�� ����� ���� �䱸�� ���̴�.");

			dis = new DataInputStream(socket.getInputStream());
			System.out.println("[Ŭ���̾�Ʈ�κ��� ���޹��� ���ڿ�]");
			System.out.println(dis.readUTF());
			dis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package exam_network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Reciver {

	public static void main(String[] args) throws IOException {

		byte[] buf = new byte[256];

		DatagramSocket socket = new DatagramSocket(5000); // ��Ʈ��ȣ 5000
		DatagramPacket packet = new DatagramPacket(buf, buf.length);

		socket.receive(packet); // ��Ŷ�� ������ ������ ��ٸ��� �ȴ�.
		System.out.print("���۵����� : ");
		System.out.println(new String(buf));
		socket.close();
	}

}

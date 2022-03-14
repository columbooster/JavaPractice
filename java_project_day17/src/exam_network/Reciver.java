package exam_network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Reciver {

	public static void main(String[] args) throws IOException {

		byte[] buf = new byte[256];

		DatagramSocket socket = new DatagramSocket(5000); // 포트번호 5000
		DatagramPacket packet = new DatagramPacket(buf, buf.length);

		socket.receive(packet); // 패킷이 도착할 때까지 기다리게 된다.
		System.out.print("전송데이터 : ");
		System.out.println(new String(buf));
		socket.close();
	}

}

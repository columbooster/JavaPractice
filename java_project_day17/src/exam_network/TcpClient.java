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
				System.out.println(" 서버와 연결됨 ");
			}

			System.out.println(" 서버 주소 : " + client.getInetAddress());
			System.out.println(" 서버 포트 : " + client.getPort());
			System.out.println(" 나의 포트 : " + client.getLocalPort());
			System.out.println(" 나의 주소 : " + client.getLocalAddress());

			dis = new DataInputStream(client.getInputStream());
			System.out.println("[서버로부터 전달받은 문자열]");
			System.out.println(dis.readUTF());

			dos = new DataOutputStream(client.getOutputStream());
			dos.writeUTF("실체가 없는 두려움에 뒷걸음치는 것은 자기 자신에 " + "대해 가장 비겁한 짓이다. 더디더라도 노력하면서 앞으로 "
					+ "나아가면 무엇이든 해낼 수 있고 얼만큼이든 이룰 수 있다.");
			dos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

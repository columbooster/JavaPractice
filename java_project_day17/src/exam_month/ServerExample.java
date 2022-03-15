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
			System.out.println("클라이언트를 기다립니다.");

			socket = listener.accept();
			System.out.println("클라이언트와 연결 : " + socket.isConnected());

			dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF("신은 우리가 성공할 것을 요구하지 않는다. 우리가 노력할 것을 요구할 뿐이다.");

			dis = new DataInputStream(socket.getInputStream());
			System.out.println("[클라이언트로부터 전달받은 문자열]");
			System.out.println(dis.readUTF());
			dis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

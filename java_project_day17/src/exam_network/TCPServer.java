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
			server = new ServerSocket(8888); // ServerSocket의 인스턴스를 생성한다.
			System.out.println("클라이언트를 기다린다.");

			Socket st = server.accept(); // 클라이언트의 Socket 클래스를 통해 연결을 승인
			System.out.println("클라이언트와 연결여부 : " + st.isConnected());

			System.out.println("로컬소켓주소 : " + st.getLocalSocketAddress());

			dos = new DataOutputStream(st.getOutputStream());
			dos.writeUTF("노력은 배신하지 않는다.");

			dis = new DataInputStream(st.getInputStream());
			System.out.println("[클라이언트로부터 전달받은 문자열]");
			System.out.println(dis.readUTF());
			dis.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

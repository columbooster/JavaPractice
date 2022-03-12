package exam_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// 클라이언트에서는 한 줄씩 텍스트를 입력받아 서버로 보내고 서버는 받은 텍스트를 출력하는 소켓 프로그램을 작성하라. 클라이언트가 "끝"
// 을 전송하면 클라이언트와 서버 모두 연결을 끊고 종료하면 된다.

public class EchoServer {

	public static void main(String[] args) {

		BufferedReader in = null;
		ServerSocket listener = null;
		Socket socket = null;
		System.out.println("서버입니다. 클라이언트를 기다립니다...");

		try {
			listener = new ServerSocket(9999); // 서버 소켓 생성
			socket = listener.accept(); // 클라이언트로부터 연결 요청 대기
			System.out.println("연결되었습니다.");

			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 클라이언트로부터의 입력 스트림
			String inputMessage;
			while (true) {
				inputMessage = in.readLine(); // 클라이언트로부터 한 행의 텍스트 받음
				if (inputMessage.equals("끝")) { // 클라이언트가 "끝"을 보내면 연결 종료
					System.out.println("접속을 종료합니다.");
					break;
				}
				System.out.println("... " + inputMessage); // 클라이언트가 보낸 메세지 화면 출력
			}
			socket.close(); // 클라이언트와 통신용 소켓 닫기
			listener.close(); // 서버 소켓 닫기

		} catch (IOException e) {
			System.out.println("입출력 오류가 발생하였습니다.");
		}

	}

}

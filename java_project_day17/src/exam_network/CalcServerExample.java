package exam_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

/*서버가 먼저 실행되어 클라이언트의 요청이 있을 때까지 기다린다(포트:9999)
 * 클라이언트는 사용자로 하여금 24 + 45의 수식을 입력받아 서버로 전송하고, 서버는 식을 계산하여 결과를 전송한다.
 * 클라이언트는 결과값을 받아 출력하고 다시 사용자로부터 수식을 입력받는다. 이 과정을 반복하되 "bye"를 전송하면 클라이언트와 서버 모두 연결을 끊고 종료하면 된다.
 */

public class CalcServerExample {

	public static String calc(String exp) {
		StringTokenizer st = new StringTokenizer(exp, " ");
		if (st.countTokens() != 3)
			return "error";

		String res = "";
		int op1 = Integer.parseInt(st.nextToken());
		String opcode = st.nextToken();
		int op2 = Integer.parseInt(st.nextToken());
		switch (opcode) {
		case "+":
			res = Integer.toString(op1 + op2);
			break;
		case "-":
			res = Integer.toString(op1 - op2);
			break;
		case "*":
			res = Integer.toString(op1 * op2);
			break;
		case "/":
			res = Integer.toString(op1 / op2);
			break;
		default:
			res = "error";

		}
		return res;

	}

	public static void main(String[] args) throws IOException {

		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;

		try {
			listener = new ServerSocket(9999); // 서버 소켓 생성
			System.out.println("연결을 기다립니다...");

			socket = listener.accept(); // 클라이언트로부터 연결 요청 대기
			System.out.println("연결 되었습니다.");

			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 소켓 입력 스트림
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 소켓 출력 스트림

			while (true) {
				String inputMessage = in.readLine(); // 클라이언트로부터 한 행 읽기. 수식
				if (inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 연결을 종료함");
					break;
				}
				System.out.println(inputMessage);
				String res = calc(inputMessage);
				out.write(res + "\n"); // 수식의 결과값을 클라이언트에게 문자열로 전송
				out.flush();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (socket != null)
					socket.close(); // 통신용 소켓 닫기
				if (listener != null)
					listener.close(); // 서버 소켓 닫기
			} catch (IOException e2) {
				System.out.println("클라이언트와 채팅 중 오류가 발생하였습니다.");
			}
		}

	}

}

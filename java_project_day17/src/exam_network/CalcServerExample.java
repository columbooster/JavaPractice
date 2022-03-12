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

/*������ ���� ����Ǿ� Ŭ���̾�Ʈ�� ��û�� ���� ������ ��ٸ���(��Ʈ:9999)
 * Ŭ���̾�Ʈ�� ����ڷ� �Ͽ��� 24 + 45�� ������ �Է¹޾� ������ �����ϰ�, ������ ���� ����Ͽ� ����� �����Ѵ�.
 * Ŭ���̾�Ʈ�� ������� �޾� ����ϰ� �ٽ� ����ڷκ��� ������ �Է¹޴´�. �� ������ �ݺ��ϵ� "bye"�� �����ϸ� Ŭ���̾�Ʈ�� ���� ��� ������ ���� �����ϸ� �ȴ�.
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
			listener = new ServerSocket(9999); // ���� ���� ����
			System.out.println("������ ��ٸ��ϴ�...");

			socket = listener.accept(); // Ŭ���̾�Ʈ�κ��� ���� ��û ���
			System.out.println("���� �Ǿ����ϴ�.");

			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // ���� �Է� ��Ʈ��
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // ���� ��� ��Ʈ��

			while (true) {
				String inputMessage = in.readLine(); // Ŭ���̾�Ʈ�κ��� �� �� �б�. ����
				if (inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("Ŭ���̾�Ʈ���� ������ ������");
					break;
				}
				System.out.println(inputMessage);
				String res = calc(inputMessage);
				out.write(res + "\n"); // ������ ������� Ŭ���̾�Ʈ���� ���ڿ��� ����
				out.flush();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (socket != null)
					socket.close(); // ��ſ� ���� �ݱ�
				if (listener != null)
					listener.close(); // ���� ���� �ݱ�
			} catch (IOException e2) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��Ͽ����ϴ�.");
			}
		}

	}

}

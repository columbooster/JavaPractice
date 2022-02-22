package exam_api_stringbuffer;

import java.util.Scanner;

/* StringBuffer Ŭ������ Ȱ���Ͽ� ���ó�� ���ڿ��� �����϶�. (Ŭ������ : WordReplace)
 * �Ʒ� ���� �������� love!LOVE�� love�� ã�� LOVE�� �����϶�� ��ɹ��̴�. ù��° ���� ���ڿ��� �����Ѵ�.
 * 
 * [���࿹��]
 * >> v
 * ���: �츮��!We
 * We love Java Programming.
 * ���: love!LOVE
 * We LOVE Java Programming.
 * ���: love!���
 * ã�� �� �����ϴ�!
 * ���: !JAVA
 * �߸��� ����Դϴ�!
 * ���: ����
 * �����մϴ�
 */

public class WordReplace {

	public static void main(String[] args) {

		System.out.println(">>");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine(); // �� ������ ���ڿ��� �д´�.
		StringBuffer sb = new StringBuffer(text);

		while (true) {
			System.out.println("���: ");
			String cmd = sc.nextLine();
			if (cmd.equals("����")) {
				System.out.println("�����մϴ�.");
				break; // �ݺ����� ��� ��
				// System.exit(1); // ���α׷��� ������ ��. �̶��� Scanner Ŭ������ close()�� ���� ȣ�� �� ���.
			}
			String[] tokens = cmd.split("!");
			if (tokens.length != 2) {
				System.out.println("�߸��� ����Դϴ�.");
			} else {
				if (tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("�߸��� ����Դϴ�.");
					continue;
				}
				int index = sb.indexOf(tokens[0]);
				if (index == -1) { // not found!
					System.out.println("ã�� �� �����ϴ�.");
					continue;
				}
				sb.replace(index, index + tokens[0].length(), tokens[1]);
				System.out.println(sb.toString());
			}
		}
		sc.close();

	}

}

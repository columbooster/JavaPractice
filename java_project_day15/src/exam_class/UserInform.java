package exam_class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*����ڷκ��� ������ ���� �������� �Է¹޾�
 * ������� ��ȣ, �̸�, ��ȭ��ȣ, �̸��� �ּ� ���·� ����(user.txt)�� �����Ѵ�.
 * �׸��� �ٽ� �䱸������ �����Ѵ�. "�Է��� �Ϸ��ҷ��� 1 ��� �Է��Ͻ÷��� 0"�� �����ϰ�.
 * �Է��� ������ ����ڷκ��� ��ȣ�� �Է¹޾Ƽ�
 * �� ��ȣ�� �ش��ϴ� ��ȭ ��ȣ�� ����ϴ� ���α׷��� �ۼ��϶�.
 * ��		ȣ 1
 * ��		�� ȫ�浿
 * �� ȭ �� ȣ 010-2342-4686
 * �̸����ּ� hong1234@hanmail.net
 * 
 * ��		ȣ 2
 * ��		�� ��ö��
 * �� ȭ �� ȣ 010-8765-1254
 * �̸����ּ� kim7979@naver.com
 * 
 */

public class UserInform {

	public static void main(String[] args) throws IOException {

		int num2;
		String search = null;
		String num, name, tel, email;
		PrintWriter in = new PrintWriter(new FileWriter("user.txt"));
		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("����� ��ȣ�� �Է��ϼ���.");
			num = input.next();
			System.out.println("����� �̸��� �Է��ϼ���.");
			name = input.next();
			System.out.println("����� ��ȭ��ȣ�� �Է��ϼ���.");
			tel = input.next();
			System.out.println("����� �̸��ϸ� �Է��ϼ���.");
			email = input.next();
			System.out.println("�Է��� �Ϸ��ҷ��� 1 ����Ͻ÷��� 0");
			num2 = input.nextInt();

			in.print(num + "," + name + "," + tel + "," + email + ",");
			in.flush();
			if (num2 == 1)
				break;

		}
		System.out.println("�˻��Ͻ� ����� ��ȣ�� �Է��ϼ���.");

		num2 = input.nextInt();

		Scanner scan = null;
		scan = new Scanner(new BufferedReader(new FileReader("user.txt")));
		scan.useDelimiter(",");
		while (scan.hasNext()) {
			num = scan.next();
			name = scan.next();
			tel = scan.next();
			if (!scan.hasNext())
				break;
			email = scan.next();

			if (num.equals(num2 + "")) {
				search = tel;
			}

		}
		System.out.println("��ȭ��ȣ�� : " + search);
		if (input != null)
			input.close();
		if (in != null)
			in.close();
		if (scan != null)
			scan.close();

	}

}

package exam_class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/* ����ڷ� �Ͽ��� �̸��� ���̸� �Է¹޾� 	phone.txt ���Ͽ� �����Ѵ�. �� �Է¼��� ������� ����ڰ� "�׸�"�̶��
 * ���ڿ��� �Է��ϸ� �Է� �۾��� �����Ѵ�. writePhoneFile()
 * ������ �����͸� �о�� �̸��� key, ��ȭ��ȣ�� value�� �����Ѵ�. readPhoneFile()
 * �׸��� �ݺ����� ���� �̸��� �Է¹޾� ��ȭ ��ȣ�� ����ϵ� "�׸�" �̶�� ���ڿ��� �ԷµǸ� �˻��� �����Ѵ�. processQuery()
 */

public class PhoneExplorer {
	private String fileName = "phone.txt";
	static Scanner input = new Scanner(System.in);
	private HashMap<String, String> map = new HashMap<String, String>();

	private void writePhoneFile() {
		File f = new File(fileName);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f));) {

			while (true) {
				System.out.println("�̸� ��ȭ��ȣ(�������� ����)");
				String line = input.nextLine(); // �� �� �б�
				if (line.equals("�׸�"))
					break;
				bw.write(line + "\r\n"); // �� �� ��� �����ϱ� ����

			}
			bw.flush();
			System.out.println(f.getPath() + "�� �����Ͽ����ϴ�.");

		} catch (IOException e) { // ������ ������ �� ���� ��� ����
			e.printStackTrace();
		}

	}

	private void readPhoneFile() {
		Scanner scan = null;

		try {
			scan = new Scanner(new FileReader(new File(fileName)));
			while (scan.hasNext()) {
				String name = scan.next();
				String tel = scan.next();
				map.put(name, tel); // �ؽøʿ� ���� 
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (scan != null)
					scan.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	private void processQuery() {
		while (true) {
			System.out.print("�̸� >> ");
			String name = input.nextLine();
			if (name.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			String tel = map.get(name);
			if (tel == null) {
				System.out.println("ã�� �̸��� �����ϴ�.");
			} else {
				System.out.println(tel);
			}
			
		}
	}

	public void run() {
		writePhoneFile();
		readPhoneFile();
		processQuery();
	}

	public static void main(String[] args) {

		PhoneExplorer pe = new PhoneExplorer();

		pe.run();

	}

}

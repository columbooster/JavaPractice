package exam_work;

import java.text.DecimalFormat;
import java.util.*;

public class HashMapNation {

	private Scanner sc = new Scanner(System.in); // Scanner�� ���� �Է�

	static HashMap<String, Integer> map = new HashMap<String, Integer>(); // key-String�� value-Integer Ÿ���� ������ HashMap
																			// �ν��Ͻ� map ����

	private void read() { // ������� �Է��� ���� read() �޼ҵ�
		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.(��: ���ѹα� 51833175)");

		for (int i = 0; i < 10; i++) { // �ݺ����� ���� 10ȸ �����̸��� �α����� �Է¤��޴´�.
			System.out.print("���� �̸�, �α� >>");
			String data = sc.nextLine();
			StringTokenizer st = new StringTokenizer(data, " "); // StringTokenizer�� �Է¹��� data�� " "(����) �����ڷ� ������.
			String name = st.nextToken().trim(); // �Է¹��� �����̸��� �յڰ����� trim()���� �������ش�.
			int pop = Integer.parseInt(st.nextToken().trim()); // Integer.parseInt()�� int������ ����ȯ������ trim()���� ���� ����.

			map.put(name, pop); // ����ڷκ��� �Է¹��� �����̸�(name)�� �α���(pop)�� map�� put()�� �̿��Ͽ� �ִ´�.
		}

	}

	private void search() { // �α����� �˻��� search() �޼ҵ�
		System.out.println("���� �̸��� �Է��ϸ� �α��� �˻��� �� �ֽ��ϴ�. ���� �Է��ϸ� �����մϴ�.");
		
		while (true) { // while ���� ���Ͽ� �ݺ��Ѵ�.
			System.out.print("���� �̸� >> ");
			String name = sc.nextLine(); // �˻��� �����̸��� �Է¹޴´�.
			if (name.equals("��")) { // equals() �޼ҵ带 ����Ͽ� "��"�� �Է� ������
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				return; // �ݺ����� �����Ѵ�.
			}

			for (Map.Entry<String, Integer> entry : map.entrySet()) { // ���� for���� ����Ͽ� ��� map�� �ִ� entry(key,value)��
																		// �˻��Ѵ�.
				String key = entry.getKey();
				Integer val = entry.getValue();
				DecimalFormat df = new DecimalFormat(); // DecimalFormat�� ����ϱ� ���� �ν��Ͻ� df�� �����Ѵ�.
				df = new DecimalFormat("#,###"); // 3�ڸ� ������ ǥ���� �� �ֵ��� �����Ѵ�.
				if (key.equals(name)) {// map�� key���� ����ڷκ��� �Է¹��� name �� �������
					System.out.println(key + "�� �α��� " + df.format(val)); // 3�ڸ��� ��� ����Ѵ�.
					break; // for���� �����.
				}
			}

		}
	}

	public void run() { // read() �޼ҵ�� search() �޼ҵ带 ���� ��Ű������ run() �޼ҵ�
		read();
		search();
	}

	public static void main(String[] args) {

		HashMapNation map = new HashMapNation();

		map.run(); // ���α׷� ����

	}

}

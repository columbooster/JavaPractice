package exam_month;

import java.util.Scanner;

// ��ü �迭 ����

class Phone {
	private String name; // �ʵ�
	private String tel;

	public Phone(String name, String tel) { // ������
		this.name = name;
		this.tel = tel;
	}

	public String getName() { // ������
		return name;
	}

	public String getTel() {
		return tel;
	}

}

public class PhoneBook {

	private Phone[] pArray;
	private Scanner sc;

	public PhoneBook() {
		sc = new Scanner(System.in);
	}

	private void read() {
		System.out.print("�ο��� >> ");
		int n = sc.nextInt();

		pArray = new Phone[n]; // �ο��� n ���� ������ �迭 ����
		for (int i = 0; i < pArray.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�) >> ");
			String name = sc.next();
			String tel = sc.next();
			pArray[i] = new Phone(name, tel);
		}

		System.out.println("���� �Ǿ����ϴ�...");
	}

	private String search(String name) {
		for (int i = 0; i < pArray.length; i++) {
			if (pArray[i].getName().equals(name))
				return pArray[i].getTel();
		}
		return null; // �������� ������ null �� ��ȯ
	}

	public void run() {
		read();
		while (true) {
			System.out.print("�˻��� �̸� >> ");
			String name = sc.next();
			if (name.equals("�׸�"))
				break;
			String tel = search(name);
			if (tel == null)
				System.out.println(name + "��(��) �����ϴ�.");
			else
				System.out.println(name + "�� ��ȣ�� " + tel + " �Դϴ�.");
		}
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
	}

	public static void main(String[] args) {
		new PhoneBook().run();
	}

}

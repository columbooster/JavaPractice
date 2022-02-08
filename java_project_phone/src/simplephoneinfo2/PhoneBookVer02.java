package simplephoneinfo2;

import java.util.Scanner;

public class PhoneBookVer02 {

	static Scanner input = new Scanner(System.in); // ��ĳ�� �޼ҵ�� �Է� �ޱ�.
	
	public static void showMenu() { // �޴� ��� �޼ҵ�
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ���α׷� ����");
		System.out.print("����:");
		
	}
	
	
	public static void readData() { // ����ڿ��� �Է¹޴� �޼ҵ�
		
		System.out.print("�̸� : ");
		String name = input.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone = input.nextLine();
		System.out.print("�������: ");
		String birthday = input.nextLine();
		
		if(birthday.equals("")) // Ȥ ����ڰ� ��������� �Է����� �ʰ� ���͸� �Է��Ͽ��ٸ� ""(����)�� ����
			birthday = null; // showPhonInfo() �޼���� ������Ͽ� ���� ��� null�� ���.
		
		PhoneInfo info = new PhoneInfo(name, phone, birthday);
		System.out.println("\n�Էµ� ���� ���...");
		info.showPhoneInfo();
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int choice; // �ʹ� ������ ���� int�� ���� ����.
		
		
		while(true) { // while���� �ݺ���
			showMenu();
			choice = input.nextInt(); // ������ �Է��� ���� ���α׷� ������ ���� �����ϱ�.
			input.nextLine(); // �Է� �� ���ֱ�
			
			switch (choice) {
			case 1 :
				readData();
				break;
			case 2 :
				System.out.println("���α׷��� �����մϴ�.");
				return;
				
			}
			
			
			
		}
		
		
		
		
		

	}

}




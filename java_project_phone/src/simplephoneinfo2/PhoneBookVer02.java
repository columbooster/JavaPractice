package simplephoneinfo2;

import java.util.Scanner;

public class PhoneBookVer02 {

	public static Scanner input = new Scanner(System.in); // ��ĳ�� �޼ҵ�� �Է� �ޱ�.
	
	public static void inputData(PhoneInfo pi) { // ����ڿ��� �Է¹޴� �޼ҵ�
		
		System.out.print("�̸� : ");
		pi.setName(input.nextLine());
		System.out.print("��ȭ��ȣ: ");
		pi.setPhoneNumber(input.nextLine());
		System.out.print("�������: ");
		pi.setBirthday(input.nextLine());
		
	}
	
	
	
	public static void main(String[] args) {
		
		PhoneInfo pi1 = new PhoneInfo(); // �ν��Ͻ� ����
		
		int select; // �ʹ� ������ ���� int�� ���� ����.
		
		
		while(true) { // while���� �ݺ���
			System.out.print("�����ϼ���.\n1. ������ �Է� \n2. ���α׷� ���� \n���� : ");
			select = input.nextInt(); // ������ �Է��� ���� ���α׷� ������ ���� �����ϱ�.
			input.nextLine(); // �Է� �� ���ֱ�
			
			if(select == 1) { // 1�� ������ ���
				
				inputData(pi1); // ������� ������ �Է¹޾Ƽ�
				
				System.out.println(); // �� ����ֱ�
				
				pi1.showPhoneInfo(); // �Էµ� ������ ������ֱ�.
				
				
			} else if(select == 2) { // 2�� ������ �汸 ���Ṯ ��� �� ����.
				System.out.println("���α׷��� �����մϴ�.");
					break;
			} else System.out.print("1�� 2�߿��� �������ּ���.\n"); // �� ���� ��ȣ �����Ұ�� �ȹٷ� �����϶�� ���.
			
			
			
		}
		
		
		
		
		

	}

}




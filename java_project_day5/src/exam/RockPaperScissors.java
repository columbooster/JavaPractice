package exam;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("����(1), ����(2), ��(3), ������(4) �� �ϳ��� �����ϼ���>>");

			int user = input.nextInt(); // ���������� �Է�
		
			double computer = Math.random()*3+1; // ��ǻ�� 1,2,3(����,����,��)
		
			
			if(user == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		
			if((int)computer == 1) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				switch (user) {
				case 1:
					System.out.println("�����ϴ�.");
					break;
				case 2:
					System.out.println("�̰���ϴ�.");
					break;
				case 3:
					System.out.println("�����ϴ�.");	
				}
			} else if((int)computer == 2) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
				switch (user) {
				case 1:
					System.out.println("�����ϴ�.");
					break;
				case 2:
					System.out.println("�����ϴ�.");
					break;
				case 3:
					System.out.println("�̰���ϴ�.");	
				}
			} else if((int)computer == 3) {
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
				switch (user) {
				case 1:
					System.out.println("�̰���ϴ�.");
					break;
				case 2:
					System.out.println("�����ϴ�.");
					break;
				case 3:
					System.out.println("�����ϴ�.");	
				}
	
			}
			
			}
			
			input.close();

	}

}

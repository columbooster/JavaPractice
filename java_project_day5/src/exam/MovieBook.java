package exam;

import java.util.Scanner;

public class MovieBook {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[10];
		
		while(true) {
			
		System.out.println("-------------------------");
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		System.out.println("-------------------------");
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		
		}
		
		System.out.println();
		System.out.println("-------------------------");
		
		System.out.print("���Ͻô� �¼���ȣ�� �Է��ϼ���(����� -1): ");
		int book = input.nextInt(); // ���ϴ� �¼���ȣ �Է¹ޱ�
		
		
		if(book>0 && book <=10) { // 1~10������ �¼���ȣ �Է¹޾�����
			switch(num[book-1]) {
			case 1: // �̹� ����Ȱ��
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
				break;
			case 0: // ���� �Ǿ� ���� �������
				num[book-1] = 1; // �ش� �ε����� ���� 1�� �ٲٰ� ������ ���ش�.
				System.out.println("����Ǿ����ϴ�.");
				break;
			}	
		} else if(book == -1) {System.out.println("���α׷��� �����մϴ�."); // -1�� �Է� ������ ����.
			break;
		} else if(book<-1 || book>10) System.out.println("�¼� ��ȣ ������ �߸��Ǿ����ϴ�.");	 // -1���� �۰ų� 10���� ũ�� ������ ����ٰ� ���
		else System.out.println("�¼� ��ȣ ������ �߸��Ǿ����ϴ�.");	// 0�� ��쵵 ���� ����ٰ� ���
		
		
		
		
		
		}
		
		input.close();

	}

}

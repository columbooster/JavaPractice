package exam;

import java.util.Scanner;

public class ThreeSixNineExam3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		while(number<1 || number>99) {
			System.out.print("���� ������ �ʰ��Ͽ����ϴ�");
			break;
		}
		
		if(number<10) { // number�� ���� 10 ���� �������
			switch(number%10) { // 10���� ������ �������� 3,6,9�� ��� �ڼ�¦ ���
			case 3:
			case 6:
			case 9:
				System.out.print("�ڼ�¦");
				break;
				} 
			}	
			
		if(number >= 10 && number <= 99){ // number�� ���� 10 �̻��� ���
			if(number/10 == 3 || number/10 == 6 || number/10 ==9) { // 10�ڸ� ���� 3,6,9�� ���
				switch(number%10) { // 10���� ������ �������� 3,6,9�� ��� �ڼ�¦¦ ���
					case 3:
					case 6:
					case 9:
						System.out.print("�ڼ�¦¦");
						break;
					default: System.out.print("�ڼ�¦");	
					}
				}
			else { // 10�� �ڸ� ���� 3,6,9�� �ƴ� ���
				switch(number%10) { // 10���� ������ �������� 3,6,9�� ��� �ڼ�¦ ���
				case 3:
				case 6:
				case 9:
					System.out.print("�ڼ�¦");
					break;
				}
			} 
		}
		
		input.close();

		
		
	}

}

package exam;

import java.util.Scanner;

public class RepititiveExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("�����ڸ� 1 ~ 4����, ����� 5�� ������ �ּ���.\n1. +\n2. -\n3. *\n4. /\n5. ����\n����>>"); // �ʱ� �䱸�� ���
		
		//�ݺ��� start
		while(true) {
			
			num1 = input.nextInt(); // ������ �׸� ����
			
			if(num1 < 1 || num1 >5) { // 1~5���̸� ��� �汸 ��䱸
				System.out.println("1���� 5������ ���� �Է��� �ּ���.\n1. +\n2. -\n3. *\n4. /\n5. ����\n����>>");
				continue; // continue�� ���ؼ� num1 ���Է� �䱸
			} else if(num1 == 5) { // 5�� ��� ���α׷� ���� ��� �� break
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else{ // num1 �� 1~5 ������ ��� �������� ����
			
				System.out.print("��Ģ������ �� �� ���� �Է��ϼ���.");
				num2 = input.nextInt();
				num3 = input.nextInt();
			
				switch (num1) { // switch������ case�� �������ش�.
					case 1 :
						System.out.println(num2 + "+" + num3 + "=" + (num2+num3) + " \n1. +\n2. -\n3. *\n4. /\n5. ����\n����>>");
						break; 
					case 2 :
						System.out.println(num2 + "-" + num3 + "=" + (num2-num3) + " \n1. +\n2. -\n3. *\n4. /\n5. ����\n����>>");
						break;
					case 3 :
						System.out.println(num2 + "*" + num3 + "=" + (num2*num3) + " \n1. +\n2. -\n3. *\n4. /\n5. ����\n����>>");
						break;
					case 4 :
						System.out.println(num2 + "/" + num3 + "=" + (num2/num3) + " \n1. +\n2. -\n3. *\n4. /\n5. ����\n����>>");
						break;
					case 5 :
						System.out.println("���α׷��� �����մϴ�.");
						break;
					default : System.out.println("1���� 5������ ���� �Է��� �ּ���.\n1. +\n2. -\n3. *\n4. /\n5. ����\n����>>");
				}
				
			}
			
			
		}
		
		input.close();
			

	}

}

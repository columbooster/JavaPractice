package exam;

// 100���� 999������ ����(3�ڸ���)�� �Է¹޾� �� �ڸ��� ���� ���� �հ踦 ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		
		number = input.nextInt();
		
		int units = number%10; // ���� �ڸ� : 10���� ���� ������
		int tens = (number/10)%10; // ���� �ڸ� : 10���� ���� ���� ���ϰ� ������ ���� �ٽ� 10���� ���� �������� ���Ѵ�.
		int hundreds = (number/10)/10; //���� �ڸ� : 10���� ���� ���� ���ϰ� ���� �ٽ� 10���� ���� ���� ���Ѵ�.
		
		int sum = (units + tens + hundreds); // ���ڸ����� ��
		
		System.out.print("�� �ڸ����� �� : " + sum);
		
		input.close();

	}

}

package exam;

import java.util.Scanner;

public class CalculatorExam1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("2���� ���ڸ� �Է��� �ּ���.");
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		
		
		System.out.print("�� ���ڸ� �Է��ϼ���.");
		
		char ch = input.next().charAt(0);
		
		if(ch == '+') {
			System.out.print(number1+number2);
		} else if( ch == '-') {
			System.out.print(number1-number2);
		} else if( ch == '*') {
			System.out.print(number1*number2);
		} else if( ch == '/') {
			while(number2 == 0) { // �и� 0�� �Էµ��� �ʵ��� �����Ѵ�.
				System.out.print("0�� ������ ���� �Է��� �ּ���.");
				number2 = input.nextInt();
			}
			System.out.print(number1/number2);
		} else {
			System.out.print("��Ģ������ �ƴմϴ�");
		}
		
		input.close();
		
	}

}

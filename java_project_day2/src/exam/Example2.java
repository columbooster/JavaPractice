package exam;

// x���� ������ y���� �л��鿡�� �Ȱ��� �������ַ��� �� ��, �� �л����� ���� �� �ִ� ������ ���� ���� ������ ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt(); // ���� ����
		int y = input.nextInt(); // �л� ��
		
		int share = x/y; // ��
		int remainder = x%y; // ���� ��������
		
		System.out.println("�� �л����� ���� �� �ִ� ������ �� : " + share);
		System.out.println("���� ������ �� = " + remainder);
		
		input.close();

	}

}

package exam_input;

/*
 * ������ �̸�, ����, �ּҸ� �Է¹޾� �Ʒ��� ���� ����� �� �ֵ��� �ۼ��� �ּ���.
 * 
 * [��¹� ��]
 * ȫ�浿�� �ȳ��ϼ���. 50���̽ó׿�.
 * �ּҴ� ����Ư���� ������ �������14�� 6 �������� 4F
 */

import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		String name = input.next();
		
		System.out.print("���̸� �Է��Ͻÿ�: ");
		int age = input.nextInt();
		input.nextLine();
		
		System.out.print("�ּҸ� �Է��Ͻÿ�: ");
		String address = input.nextLine();
		
		System.out.println(name+"�� �ȳ��ϼ���! " + age +"���̽ó׿�.");
		System.out.println("�ּҴ� " + address);
		
		input.close();

	}

}

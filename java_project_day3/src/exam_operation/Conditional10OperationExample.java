package exam_operation;

import java.util.Scanner;

public class Conditional10OperationExample {

	public static void main(String[] args) {
		
		int x = 100;
		int y = 200;
		
		System.out.println("�� ��(100�� 200) �߿��� �ִ밪 : " + ((x>y) ? x : y));
		
		// ������ ���� ���� ������ �����ϰ� �� ���� ¦������ Ȧ �� ������ ����� �� �ֵ��� �ۼ����ּ���.
		// ���� ��� "4�� ¦�� �Դϴ�."
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���.");
		int a = input.nextInt();
		
		if(a%2 == 0) {
			System.out.println(a + "�� ¦�� �Դϴ�.");
		}else {
			System.out.println(a + "�� Ȧ �� �Դϴ�.");
		}
		
		System.out.println(((a%2 == 0) ? a+"�� ¦�� �Դϴ�" : a+"�� Ȧ�� �Դϴ�."));
		
		// �� ���� ���� ����� �ּ���. �� ū ������ ���� ���� ���� ����� ����մϴ�.
		System.out.println("���ڸ� 2�� �Է����ּ���.");
		int b = input.nextInt();
		int c = input.nextInt();
		
		System.out.println(((b>c) ? b-c : c-b));
		
		input.close();
	}

}

package exam;
//����, ����, ���� ������ �Է� �޾�, ������ ���(�Ҽ� ù����¥��)�� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, sum; double average;
		
		a = sc.nextInt(); //����
		b = sc.nextInt(); //����
		c = sc.nextInt(); //����
		
		sum = a + b + c; // ����
		average = (a+b+c)*0.3; //���
		
		System.out.println("���� : " + sum);
		System.out.printf("��� : %.1f", average);
		
		sc.close();

	}

}

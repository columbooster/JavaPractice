package exam;

// ����, �ܰ��� �Է� �޾� �ݾ��� ����� ��, 25%�� �����Ͽ�, ���� �ݾ�, ���ξ�, ���ұݾ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int count = input.nextInt(); // ����
		int unitPrice = input.nextInt(); // �ܰ�(�����簡��)
		
		int totalPrice = count*unitPrice; // �Ѱ���, �����ݾ�
		double salePrice = totalPrice*0.25; // 25%���ε� �ѱݾ�, ���ұݾ�
		double discount = totalPrice - salePrice; // ���ξ�
		
		System.out.println("���� �ݾ� : " + totalPrice);
		System.out.println("���ξ� : " + discount);
		System.out.println("���ұݾ� : " + salePrice);
		
		input.close();

	}

}

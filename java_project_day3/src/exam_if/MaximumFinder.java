package exam_if;

import java.util.Scanner;
// 3���� ������ �Է� �޾Ƽ� �ִ밪�� ����ϵ��� ���α׷��� �ۼ��� �ּ���.

public class MaximumFinder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, c, max;
		
		System.out.print("ù��° ������ �Է��Ͻÿ�");
		a = input.nextInt();
		System.out.print("�ι�° ������ �Է��Ͻÿ�");
		b = input.nextInt();
		System.out.print("����° ������ �Է��Ͻÿ�");
		c = input.nextInt();
		
		if(a>b && a>c) {
			max = a;
		} else if(b>a && b>c) {
			max = b;
		} else max = c;
		
		
		System.out.println("�ִ밪�� : " + max);
		
		
		//���1
		
		if(a>b) {
			max = a;
		} else {
			max = b;
		}
		
		if(c>max) {
			max = c;
		}
		
		System.out.println("�ִ밪�� : " + max);
		
		//���2
		max = a; // ù��° �Է¹��� ���ڰ� ������ ũ�ٴ� ���� �ʿ�
		
		if(b>max) {
			max = b;
		}
		if(c>max) {
			max = c;
		}
		System.out.println("�ִ밪�� : " + max);
		
		input.close();

	}

}

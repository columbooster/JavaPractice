package exam_for;
//10���� �����͸� �Է� �޾� �ּҰ�, �ִ밪�� ���Ͽ� ����ϴ� �ڵ�� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class MaxMinExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int max, min, number;
		
		number = 0;
		max = -99999;
		min = 99999;
		
		
		for(int i = 0; i <10; i++) {
			System.out.println("���ڸ� �Է��ϼ���.");
			number = input.nextInt();
			
			if(number > max) {
				max = number;
			} else if(number < min) {
				min = number;
			}
			if(i==9) {
				input.close();
			}
		}
		
		
		System.out.printf("�ִ밪 : %d\t  �ּҰ� : %d\n", max, min);

	}

}

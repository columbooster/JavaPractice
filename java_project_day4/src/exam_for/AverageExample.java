package exam_for;

import java.util.Scanner;

public class AverageExample {

	public static void main(String[] args) {
		// 10���� ���ڸ� �Է� �޾� 0���� ū ���ڿ� ���� ��հ� ������ ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		
		Scanner input = new Scanner(System.in);
		
		int number, sum, count; double average;
		
		sum = 0;
		average = 0;
		count = 0;
		
		for(int i = 1; i <11; i++) {
			System.out.println(i+"��° ���ڸ� �Է��� �ּ���.");
			number = input.nextInt();
			if(number>0) {
				sum += number;
				count++;
			}
			if(i == 10) {
				input.close();
			}
		}
		
		if(count !=0) {
			average = (double) sum/count;
			System.out.printf("��� : %.2f ���� : %d\n", average, count);
		} else {
			System.out.println("����� ���� �� �����ϴ�.");
		}
		

	}

}

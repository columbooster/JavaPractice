package exam_for;
// �� ���� �Է� �޾�, �� �� ���̿� Ȧ���� �հ� ¦���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ũ�⿡ ������� ���� �����ؾ��Ѵ�.
import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// ����� ��� 1  -->> �̸� ��ȯ�ؼ� Ǯ��!!!
		int i, start, end, temp, oddSum = 0, evenSum =0;
		
		System.out.println("�� ���� ������ �������� �Է��ϼ���.");
		start = input.nextInt();
		end = input.nextInt();
		input.close();
		
		if (start > end) { // �̷��� ��ȯ�ϸ� �� ���ϳ�!!!
			temp = start;
			start = end;
			end = temp;
		}
		
		for(i = start; i <= end; i++) {
			if (i%2 ==0) 
				evenSum = evenSum + i;
			else
				oddSum = oddSum + i;
		}
		
		
		System.out.printf("Ȧ���� �� : %d  ¦���� �� : %d%n", evenSum, oddSum);
		
		
		
		/* ���� Ǭ ���
		int num1, num2, sum1, sum2;
		
		System.out.println("���ڸ� 2�� �Է��ϼ���.");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		input.close();
		
		sum1 = 0; //Ȧ�� ��
		sum2 = 0; //¦�� ��
		
		if(num1 > num2) {
			for(int i = num2; i <= num1; i++) {
				if(i%2 == 0) {
					sum2 += i;
					
				} else if(i%2 == 1) {
					sum1 += i;
					
				}
			}	
		}
		
		if(num1 < num2 ) {
			for(int i = num1; i <= num2; i++) {
				if(i%2 == 0) {
					sum2 += i;
					
				} else if(i%2 == 1) {
					sum1 += i;
					
				}
			}
		}
		
		
		System.out.printf("Ȧ���� �� : %d  ¦���� �� : %d%n", sum1, sum2);
	*/
	}

}

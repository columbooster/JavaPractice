package exam_while;

import java.util.Scanner;
/*����ڷκ��� 5���� ������ �о �հ� ��հ��� ����Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
 * [��¿���]
 * 1���� �� �Է� : 1
 * 2���� �� �Է� : 2
 * ...
 * 5��° �� �Է� : 5
 * �հ� : 15 ��� : 3.0
 * 
 */

public class NumberSum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i, num, sum =0; double avg;
		i = 1;
		
		while(i <=5) {
			System.out.println(i+"��° �� �Է� : ");
			num = input.nextInt();
			sum += num;
			i++;
		}
		
		input.close();
		
		avg = (sum/5);
		
		System.out.printf("�հ� : %d  ��� : %.1f", sum, avg);

	}

}

package exam_break;

import java.util.Scanner;
// ����ڰ� �Է��� ������ ����, ����� ���� ���α׷��� �ۼ��Ͻÿ�. �� ����� 0 ~ 100 ���̰� �ƴ� ���� �Է��ϸ� �ȴ�.
public class breakExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int score, count, sum; double avg;
		
		count = 0;
		sum = 0;
		
		while(true) {
			System.out.println("������ �Է��� �ּ���. ����� 0~100 ���� ���� ���� �Է����ּ���.");
			score = input.nextInt();
			if(score<0 || score>100) {
				break;
			}
			sum += score;
			count++;
			
		}
		input.close();
		avg = (sum/count);
		
		System.out.printf("���� : %d  ��� : %.2f", sum, avg);

	}

}

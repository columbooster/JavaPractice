package exam_while;

import java.util.Scanner;
// -1�� �Էµɶ����� ������ �Է¹޾� �� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class WhileExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num, sum;
		
		sum = 0;
		
		while(true) {
			System.out.println("���ڸ� �Է��� �ּ���.");
			num = input.nextInt();
			if(num == -1) {
				break;
			}
			sum = sum + num;
			
			
		}
		input.close();
		
		System.out.print(sum);

	}

}

package exam_for;

import java.util.Scanner;
//����ڷ� �Ͽ��� 2�� ~ 9�� ������ ���� �Է¹޾� �ش� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class GugudanExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("����� ���� �����ּ��� : ");
		
		int number = input.nextInt();
		
		if(number<2 || number>9) {
			System.out.println("���� 2�ܿ��� 9�ܱ����� �Է��� �ּ���.");
		} else {
		
			for(int i=1; i <10; i++) {
				System.out.println(number + "*" + i +"=" + (number*i));
			}
		
		input.close();
		}
	}

}

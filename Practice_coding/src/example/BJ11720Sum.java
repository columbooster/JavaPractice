package example;

import java.util.Scanner;

public class BJ11720Sum {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		String num = input.next();
		input.close();
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += num.charAt(i)-'0';
		}
		//  charAt() �� �ش� ������ �ƽ�Ű�ڵ� ���� ��ȯ�ϹǷ� �ݵ�� -48 �Ǵ� -'0' �� ���־�� �츮�� �Է¹��� ���� �� �״�θ� ����� �� �ִ�.
		System.out.println(sum);
		
	}

}

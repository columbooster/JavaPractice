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
		//  charAt() 은 해당 문자의 아스키코드 값을 반환하므로 반드시 -48 또는 -'0' 을 해주어야 우리가 입력받은 숫자 값 그대로를 사용할 수 있다.
		System.out.println(sum);
		
	}

}

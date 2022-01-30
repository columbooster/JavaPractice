package exam;

// 100부터 999까지의 숫자(3자리수)를 입력받아 각 자리의 수를 합한 합계를 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number;
		
		number = input.nextInt();
		
		int units = number%10; // 일의 자리 : 10으로 나눈 나머지
		int tens = (number/10)%10; // 십의 자리 : 10으로 나눠 몫을 구하고 구해진 몫을 다시 10으로 나눠 나머지를 구한다.
		int hundreds = (number/10)/10; //백의 자리 : 10으로 나눠 몫을 구하고 몫을 다시 10으로 나눠 몫을 구한다.
		
		int sum = (units + tens + hundreds); // 각자리수의 합
		
		System.out.print("각 자리수의 합 : " + sum);
		
		input.close();

	}

}

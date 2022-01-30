package exam;

import java.util.Scanner;

public class CalculatorExam1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("2개의 숫자를 입력해 주세요.");
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		
		
		System.out.print("한 문자를 입력하세요.");
		
		char ch = input.next().charAt(0);
		
		if(ch == '+') {
			System.out.print(number1+number2);
		} else if( ch == '-') {
			System.out.print(number1-number2);
		} else if( ch == '*') {
			System.out.print(number1*number2);
		} else if( ch == '/') {
			while(number2 == 0) { // 분모에 0이 입력되지 않도록 제한한다.
				System.out.print("0을 제외한 수를 입력해 주세요.");
				number2 = input.nextInt();
			}
			System.out.print(number1/number2);
		} else {
			System.out.print("사칙연산이 아닙니다");
		}
		
		input.close();
		
	}

}

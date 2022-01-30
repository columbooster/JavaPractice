package exam;

// 수량, 단가를 입력 받아 금액을 계산한 후, 25%를 할인하여, 원래 금액, 할인액, 지불금액을 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int count = input.nextInt(); // 수량
		int unitPrice = input.nextInt(); // 단가(단위당가격)
		
		int totalPrice = count*unitPrice; // 총가격, 원래금액
		double salePrice = totalPrice*0.25; // 25%할인된 총금액, 지불금액
		double discount = totalPrice - salePrice; // 할인액
		
		System.out.println("원래 금액 : " + totalPrice);
		System.out.println("할인액 : " + discount);
		System.out.println("지불금액 : " + salePrice);
		
		input.close();

	}

}

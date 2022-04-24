package example;

import java.util.Scanner;

public class SumInOut {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println(sum(num1,num2));
		
		input.close();
	}
	
	public static int sum(int x, int y) {
		return x + y;
	}

}

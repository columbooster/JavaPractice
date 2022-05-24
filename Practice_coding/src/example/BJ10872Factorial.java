package example;

import java.util.Scanner;

public class BJ10872Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		int num = factorial(n);
		System.out.println(num);
		
	}
	
	public static int factorial(int n) {
		if(n <= 1) return 1; // 재귀 종료 조건
		return n * factorial(n-1);
	}

}

package example;

import java.util.Scanner;

public class Simple_test {
	
	static int[] dp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new int[n+1];
		System.out.println(fibo(n));
		
	}
	// ´Ü¼ø Àç±Í
	static int fibo(int x) {
		if(x == 1 || x==2) return 1;
		return fibo(x-1) + fibo(x-2);
		
	}

}

package org.opentutorials.javatutorials.baekjoon;

import java.util.Scanner;

public class practicewhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B;
		
		while (sc.hasNext()) {
			
			A = sc.nextInt();
			B = sc.nextInt();
			
			System.out.println(A+B);
		}
		sc.close();

	}

}

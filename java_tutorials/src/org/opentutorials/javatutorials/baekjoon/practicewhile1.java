package org.opentutorials.javatutorials.baekjoon;

import java.util.Scanner;

public class practicewhile1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		while(0< A & B <10) {
			
			System.out.println(A+B);
			A = sc.nextInt();
			B = sc.nextInt();
			
			if(A==0 && B==0) {break;}
		}
		sc.close();

	}

}

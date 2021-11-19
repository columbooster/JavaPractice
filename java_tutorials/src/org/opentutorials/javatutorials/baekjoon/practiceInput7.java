package org.opentutorials.javatutorials.baekjoon;

import java.util.Scanner;

public class practiceInput7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		String number = String.valueOf(b);
		
		char[] digits = number.toCharArray();
		
		
		int c = Character.getNumericValue(digits[2]);
		int d = Character.getNumericValue(digits[1]);
		int e = Character.getNumericValue(digits[0]);
		
		System.out.println(a*c);
		System.out.println(a*d);
		System.out.println(a*e);
		System.out.println(a*b);
		
		}
		
}


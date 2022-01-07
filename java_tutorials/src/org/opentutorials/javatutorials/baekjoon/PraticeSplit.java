package org.opentutorials.javatutorials.baekjoon;

import java.util.Scanner;

public class PraticeSplit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		sc.close();
		
		
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			if( i % 10 == 9) {
			System.out.println();
			}
		}
	}

}

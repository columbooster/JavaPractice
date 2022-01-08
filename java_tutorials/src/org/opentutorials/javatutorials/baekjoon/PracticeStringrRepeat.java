package org.opentutorials.javatutorials.baekjoon;

import java.util.Scanner;

public class PracticeStringrRepeat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testnumber = sc.nextInt();
		
		for(int i = 0; i < testnumber; i++) {
			
			int  R = sc.nextInt();
			String S = sc.next();
			String[] arr = S.split("");
			
			for(int j = 0; j < S.length(); j++) {
				System.out.print(arr[j].repeat(R));
			}
			
			System.out.println();
	
		} 
		
		sc.close();

	}

}

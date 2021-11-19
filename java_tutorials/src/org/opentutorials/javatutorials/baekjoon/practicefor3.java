package org.opentutorials.javatutorials.baekjoon;

import java.util.Scanner;

public class practicefor3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%400==0) {
			System.out.println(1);
			return;
		} else if(a%100==0) {
			System.out.println(0);
			return;
		} else if(a%4==0) {
			System.out.println(1);
			return;
		}
		else { System.out.println(0);}

	}

}

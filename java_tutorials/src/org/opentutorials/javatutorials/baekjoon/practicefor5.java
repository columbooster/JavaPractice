package org.opentutorials.javatutorials.baekjoon;

import java.util.Scanner;

public class practicefor5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H>0 && M<45) {
			System.out.println(H-1);
			System.out.println(M+15);
		} else if(H>0 && M>44){
			System.out.println(H);
			System.out.println(M-45);
		} else if(H==0 && M<45) {
			System.out.println(23);
			System.out.println(M+15);
		} else {
			if(H==0 && M>44) {
				System.out.println(0);
				System.out.println(M-45);
			}
		}

	}

}
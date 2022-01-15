package org.opentutorials.javatutorials.baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class Practicebruteforce {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 9;
		int[] member = new int[n];
		int sum = 0;
		
		boolean check = false;
		
		for(int i = 0; i < n; i++) {
			
			member[i] = sc.nextInt();
			
			sum += member[i];
			
		}
		
		
		for(int i = 0; i < n; i++) {
			if(check) break;
			for(int j = 0; j < n; j++) {
				if(i==j) continue;
				if(sum-member[i]-member[j] == 100) {
					member[i] = 0;
					member[j] = 0;
					check = true;
					break;
				}
			}
		}
		
		Arrays.sort(member);
		
		for(int i =0;i<9;i++) {
			if(member[i]!=0)System.out.println(member[i]);
		}
		
		
		sc.close();
	}

}

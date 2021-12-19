package org.opentutorials.javatutorials.baekjoon;

import java.io.*;

public class PracticeArray4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[42];
		int num, remain, result = 0;
		
		
		for(int i = 0; i<10; i++) {
			num= Integer.parseInt(br.readLine());
			remain = num%42;
			arr[remain]++;
			
		}
		for(int i=0; i<42; i++) {
			if(arr[i]!=0) {
				result++;
			}
		}
		System.out.println(result);

	}

}

package org.opentutorials.javatutorials.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class PracticeStringSangsoo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		StringBuffer sb1 = new StringBuffer(A);
		StringBuffer sb2 = new StringBuffer(B);
		
		String reverseA = sb1.reverse().toString();
		String reverseB = sb2.reverse().toString();
		
		int a = Integer.parseInt(reverseA);
		int b = Integer.parseInt(reverseB);
		
		if(a > b) {
			System.out.print(a);
		} else {
			System.out.print(b);
		}
		
		System.out.println("Hello World!");
		System.out.print(123);
		
		System.out.print(283);

	}

}

package org.opentutorials.javatutorials.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class PracticeStringBasketball {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		String A = st.nextToken();
		String B = st.nextToken();

		int C = Integer.parseInt(A);
		int D = Integer.parseInt(B);
		
		System.out.print(C+D);

	}

}

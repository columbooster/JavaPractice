package org.opentutorials.javatutorials.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PracticeArray2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int arr[] = new int[9];
		
		int max = arr[0];
		int maxIndex = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
				if(arr[i] > max) {
					max=arr[i];
					maxIndex=i+1;			
				}
		}
		bw.write(max+"\n");
		bw.write(maxIndex+"\n");
		
		bw.close();
		

	}

}

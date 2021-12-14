package org.opentutorials.javatutorials.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PracticeArray3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		
		
		while(val!=0) {
			arr[val%10]++; //나머지값을 배열의 인덱스로 활용해서 해당 인덱스의 값을 1씩 증가시켜준다.
			val/=10; // 한자릿수씩 줄여나간다.
		}
		
		for(int result : arr) {
			System.out.println(result);
		
		}
	}

}
// String 으로 변환해서 String.charAt() 메소드를 쓰는 것보다 효율적인 느낌이든다.
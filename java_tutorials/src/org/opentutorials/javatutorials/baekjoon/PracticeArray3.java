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
			arr[val%10]++; //���������� �迭�� �ε����� Ȱ���ؼ� �ش� �ε����� ���� 1�� ���������ش�.
			val/=10; // ���ڸ����� �ٿ�������.
		}
		
		for(int result : arr) {
			System.out.println(result);
		
		}
	}

}
// String ���� ��ȯ�ؼ� String.charAt() �޼ҵ带 ���� �ͺ��� ȿ������ �����̵��.
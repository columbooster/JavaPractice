package org.opentutorials.javatutorials.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class PracticeAverage {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr;
		int testcase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		
		for(int i = 0; i < testcase; i++) {
			
			st = new StringTokenizer(br.readLine()," ");
			int student = Integer.parseInt(st.nextToken()); 
			arr = new int[student]; 
			double sum = 0; 
			
			for(int j = 0; j < student; j++) {
			int score = Integer.parseInt(st.nextToken());
			arr[j] = score; 
			sum += score; 
			}
			
			double average = (sum / student); 
			double count = 0; 
			
			for(int j = 0; j < student; j++) {
				if(arr[j] > average) {
					count++; 
				}
			}
		
			System.out.printf("%.3f%%\n",(count/student)*100);
		}
			
	}

}
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class PracticeAverage {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr;
		
		int testcase = Integer.parseInt(br.readLine());

		StringTokenizer st;
		
		
		for(int i = 0; i < testcase; i++) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			int student = Integer.parseInt(st.nextToken()); // �� ���̽� �� �л� ���� ���غ��ƿ�.
			arr = new int[student]; // ���̽� �� �л����� �迭�� �־��ٰſ���.
			double sum = 0; // ���� ���� �� ������ �����ؿ�.
			
			//������ �Է����ٰſ���.
			for(int j = 0; j < student; j++) {
			
			int score = Integer.parseInt(st.nextToken()); //  ���� ������ ���ٰſ���.
			arr[j] = score; // �迭�� ������ �־��ٰſ���.
			sum += score; // ���� ���� ���� ���ؿ�.
			}
			
			double average = (sum / student); // ����� ���غ��ƿ�.
			
			double count = 0; // ����� �Ѵ� �л� �� ������ �����ؿ�.
			
			//����� �Ѵ� �л����� ���Ұſ���.
			for(int j = 0; j < student; j++) {
				if(arr[j] > average) {
					count++; // ��պ��� ������ ���ٸ� ī������ ���ٰſ���.
				}
			}
		
			System.out.printf("%.3f%%\n",(count/student)*100);
		}
			
	}

}
*/

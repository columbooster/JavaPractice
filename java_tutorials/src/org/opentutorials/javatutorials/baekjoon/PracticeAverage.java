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
			
			int student = Integer.parseInt(st.nextToken()); // 각 케이스 별 학생 수를 구해보아요.
			arr = new int[student]; // 케이스 별 학생수를 배열에 넣어줄거에요.
			double sum = 0; // 성적 누적 합 변수를 선언해요.
			
			//성적을 입력해줄거에요.
			for(int j = 0; j < student; j++) {
			
			int score = Integer.parseInt(st.nextToken()); //  성적 저장을 해줄거에요.
			arr[j] = score; // 배열에 성적을 넣어줄거에요.
			sum += score; // 성적 누적 합을 구해요.
			}
			
			double average = (sum / student); // 평균을 구해보아요.
			
			double count = 0; // 평균을 넘는 학생 수 변수를 선언해요.
			
			//평균을 넘는 학생수를 구할거에요.
			for(int j = 0; j < student; j++) {
				if(arr[j] > average) {
					count++; // 평균보다 점수가 높다면 카운팅을 해줄거에요.
				}
			}
		
			System.out.printf("%.3f%%\n",(count/student)*100);
		}
			
	}

}
*/

package exam_array;

import java.util.Scanner;
//학생 수를 입력받고 그 수만큼 점수를 입력받아 합을 구하도록 프로그램을 작성하여 보자.
public class ScoreExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int student = input.nextInt();
		int[] score = new int[student];
		int sum = 0;
		
		for(int i = 0; i < student; i++) {
			System.out.println((i+1) + "번 학생의 점수를 입력해 주세요.");
			score[i] = input.nextInt();
			sum += score[i];
		}
		
		input.close();
		System.out.printf("학생들의 점수 합은 %d 입니다.", sum);
		
	}

}

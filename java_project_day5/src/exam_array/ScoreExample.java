package exam_array;

import java.util.Scanner;
//�л� ���� �Է¹ް� �� ����ŭ ������ �Է¹޾� ���� ���ϵ��� ���α׷��� �ۼ��Ͽ� ����.
public class ScoreExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int student = input.nextInt();
		int[] score = new int[student];
		int sum = 0;
		
		for(int i = 0; i < student; i++) {
			System.out.println((i+1) + "�� �л��� ������ �Է��� �ּ���.");
			score[i] = input.nextInt();
			sum += score[i];
		}
		
		input.close();
		System.out.printf("�л����� ���� ���� %d �Դϴ�.", sum);
		
	}

}

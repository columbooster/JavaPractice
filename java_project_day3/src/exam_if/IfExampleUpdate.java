package exam_if;

import java.util.Scanner;

public class IfExampleUpdate {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// [����1] ����ڷ� �Ͽ��� ���� �ϳ��� �Է¹޾� ¦���� Ȧ���� ����ϴ� �ڵ带 �ۼ��� �ּ���.
	
		System.out.println("���ڸ� �Է��� �ּ���.");
		
		int number = input.nextInt();
		
		if(number%2 == 0) {
			System.out.println(number +"�� ¦�� �Դϴ�.");
		} else {
			System.out.println(number +"�� Ȧ�� �Դϴ�.");
		}
		
		// [����2] ����ڷ� �Ͽ��� ������ �Է¹޾� ������ ����ϴ� ���α׷��� �ۼ��� �ּ���.
		// 90 A 80 B 70 C 60 D F
		
		int score = 0; 
		
		//do while�� ���
		do {
		System.out.print("������ 0~100 ���̷� �Է��� �ּ���.");
		score = input.nextInt();
		} while(score<0 || score>100);
		
		
		char grade = '\0'; // �ƽ�Ű �ڵ� ������ 0 : NUL(NULL)
		
		if(score >=90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		//System.out.println("���� : " + score + " ���� : " + grade);
		
		System.out.printf("���� = %d ���� = %c" , score, grade);
		
		input.close();

	}

}

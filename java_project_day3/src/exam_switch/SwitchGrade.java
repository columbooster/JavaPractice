package exam_switch;

import java.util.Scanner;

public class SwitchGrade {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int score = 0;
		
		System.out.print("������ 0~100 ���̷� �Է��� �ּ���.");
		
		score = input.nextInt();
		
		char grade = '\0'; // �ƽ�Ű �ڵ� ������ 0 : NUL(NULL)
		
		//while�� ���
		
		while(score<0 || score>100) {
			System.out.print("������ 0~100 ���̷� �Է��� �ּ���.");
			score = input.nextInt();
		}
		
		
		// 99/10 =9 91/10=9
		
		if(score <= 100 && score >= 0) {
			
		switch(score/10) { // ���ǽĿ��� �񱳴��(����, �����)
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		
		System.out.println("���� : " + score + " ���� : " + grade);
		System.out.printf("���� = %d ���� = %c" , score, grade);
		} else {
			System.out.print("������ ������ϴ�. 0~100������ ������ �Է��� �ּ���.");
		}
		
		input.close();

	}

}

package exam_switch;

import java.util.Scanner;

public class SwitchGrade {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int score = 0;
		
		System.out.print("점수는 0~100 사이로 입력해 주세요.");
		
		score = input.nextInt();
		
		char grade = '\0'; // 아스키 코드 십진수 0 : NUL(NULL)
		
		//while문 사용
		
		while(score<0 || score>100) {
			System.out.print("점수는 0~100 사이로 입력해 주세요.");
			score = input.nextInt();
		}
		
		
		// 99/10 =9 91/10=9
		
		if(score <= 100 && score >= 0) {
			
		switch(score/10) { // 조건식에는 비교대상(변수, 연산식)
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
		
		System.out.println("점수 : " + score + " 학점 : " + grade);
		System.out.printf("점수 = %d 학점 = %c" , score, grade);
		} else {
			System.out.print("점수를 벗어났습니다. 0~100사이의 점수를 입력해 주세요.");
		}
		
		input.close();

	}

}

package exam_if;

import java.util.Scanner;

public class IfExampleUpdate {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// [예제1] 사용자로 하여금 숫자 하나를 입력받아 짝수와 홀수를 출력하는 코드를 작성해 주세요.
	
		System.out.println("숫자를 입력해 주세요.");
		
		int number = input.nextInt();
		
		if(number%2 == 0) {
			System.out.println(number +"는 짝수 입니다.");
		} else {
			System.out.println(number +"는 홀수 입니다.");
		}
		
		// [예제2] 사용자로 하여금 점수를 입력받아 학점을 출력하는 프로그램을 작성해 주세요.
		// 90 A 80 B 70 C 60 D F
		
		int score = 0; 
		
		//do while문 사용
		do {
		System.out.print("점수는 0~100 사이로 입력해 주세요.");
		score = input.nextInt();
		} while(score<0 || score>100);
		
		
		char grade = '\0'; // 아스키 코드 십진수 0 : NUL(NULL)
		
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
		
		//System.out.println("점수 : " + score + " 학점 : " + grade);
		
		System.out.printf("점수 = %d 학점 = %c" , score, grade);
		
		input.close();

	}

}

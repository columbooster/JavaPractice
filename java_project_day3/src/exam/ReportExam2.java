package exam;

import java.util.Scanner;

public class ReportExam2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//성적 구하기
		double mid, fin, rep, att; double a, b, c, total;
		
		System.out.println("중간고사 점수를 입력해 주세요.");
		mid = input.nextInt(); // 중간고사 점수
		System.out.println("기말고사 점수를 입력해 주세요.");
		fin = input.nextInt(); // 기말고사 점수
		System.out.println("레포트 점수를 입력해 주세요.");
		rep = input.nextInt(); // 레포트 점수
		System.out.println("출석 점수를 입력해 주세요.");
		att = input.nextInt(); // 출석 점수
		
		a = (((mid+fin)/2)*0.6); // 중간+기말 점수 60%적용
		b = (rep*0.2); // 레포트 점수 20% 적용
		c = (att*0.2); // 출석 점수 20% 적용
		
		total = (a+b+c);
		
		//학점 구하기
		char grade = '\0';
		
		if(total >= 90) {
			grade = 'A';
		} else if(total >= 80) {
			grade = 'B';
		} else if(total >= 70) {
			grade = 'C';
		} else if(total >= 60) {
			grade = 'D';
		} else grade = 'F';
		
		//평가 구하기
		String eva ="\0";
		
		switch(grade) {
		case 'A':
		case 'B':
			eva = "excellant";
			break;
		case 'C':
		case 'D':
			eva = "good";
			break;
		case 'F':
			eva = "poor";
		}
		
		
		System.out.println("------ 결과 입니다 ------");
		System.out.printf("중간고사: %.0f\n", mid); // 소수점을 없애고 \n 으로 줄바꾸기
		System.out.println("기말고사: "+ (int)fin); // 소수점을 없애기 위해 int형으로 캐스팅.
		System.out.printf("레포트: %.0f%n", rep); // 소수점을 없애고 %n 으로 줄바꾸기
		System.out.println("출석점수: "+ (int)att);
		System.out.println();
		System.out.printf("성적 : %.2f\n", total);
		System.out.println("학점: "+ grade);
		System.out.println("평가: "+ eva);
		
		input.close();

	}

}

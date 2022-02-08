package exam_class_basic;

import java.util.Scanner;

/*
 * 성적을 구하는 score 클래스를 정의하자.
 * 이름/국어/영어/수학/총점을 저장하고자 한다.
 * 필드에 값을 설정할 수 있는 기능, 점수들의 합을 구하는 기능, 학점을 구하는 기능,
 * 모든 필드를 출력할 수 있는 기능을 포함하도록 한다.
 * 
 * [출력결과]
 * 사용자로 하여금 이름 및 점수들을 입력받아 아래의 결과를 출력하도록 하자.
 * 실행결과는 다음과 같다
 * 
====================================
이름		국어	영어	수학	총점	평균	    학점	
====================================
홍길동	90	75	61	226	75.3	C	
김철수	55	56	46	157	52.3	F	
이진희	90	90	90	270	90.0	A	

 * 
 * 
 * 
 */


public class scoreTest {
	
	public static Scanner input = new Scanner(System.in);
	//데이터를 입력받기 위한 메서드 Score score = s1
	public static void inputData(Score score) { // 매개변수 : 클래스명 참조변수 = 주소값
		//필드에 직접 대입 
		System.out.println("이름 입력: ");
		score.studentName = input.nextLine();
		System.out.println("국어 점수 입력: ");
		score.kor = input.nextInt();
		System.out.println("영어 점수 입력: ");
		score.eng = input.nextInt();
		System.out.println("수학 점수 입력: ");
		score.math = input.nextInt();
		input.nextLine();
		
	}
	//시작을 알리는 main() 메서드
	public static void main(String[] args) {
		Score s1 = new Score();
		//s1.scoreDate("홍길동",90,75,61);
		inputData(s1);
		s1.getSum();
		
		Score s2 = new Score();
		s2.scoreData("김철수",55,56,46);
		//inputData(s2);
		s2.getSum();
		
		Score s3 = new Score();
		s3.scoreData("이진희", 90, 90, 90);
		//inputData(s3);
		s3.getSum();
		
		System.out.println("====================================================");
		String[] subject = {"이름","국어","영어","수학","총점","평균","학점"};
		for(int i = 0; i <subject.length; i++) {
			System.out.printf("%s\t", subject[i]);
		}
		System.out.println("\n====================================================");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		
		

	}

}

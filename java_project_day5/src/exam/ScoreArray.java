package exam;
/*다음 코드와 같은 과목과 점수가 짝을 이루도록 2개의 배열을 작성해라.
 * "종료"를 입력받으면 종료한다.
 */

import java.util.Scanner;

public class ScoreArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] course = {"Java", "C++", "HTML5", "컴퓨터 구조", "안드로이드"};
		int[] score = {95, 88, 76, 62, 55};
		
		
		System.out.println("[과목 정보] \nJava, C++, HTML5, 컴퓨터 구조, 데이터베이스");
		
		while(true) {
			
		System.out.println("과목 이름>>");
		String name = input.next();
		
		if(name.equals("종료"))
			break;
		int i;
		for(i = 0; i < score.length; i++) {
			if(course[i].equals(name)) {
				System.out.println(name + " 의 점수는 " + score[i]);
				break;
			}
		}
		
		if(i == score.length)
			System.out.println("없는 과목입니다.");
		
		}
		System.out.println("프로그램을 종료합니다.");
		
		input.close();

	}

}

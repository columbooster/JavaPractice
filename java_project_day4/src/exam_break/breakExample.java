package exam_break;

import java.util.Scanner;
// 사용자가 입력한 점수의 총점, 평균을 내는 프로그램을 작성하시오. 단 종료는 0 ~ 100 사이가 아닌 값을 입력하면 된다.
public class breakExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int score, count, sum; double avg;
		
		count = 0;
		sum = 0;
		
		while(true) {
			System.out.println("점수를 입력해 주세요. 종료는 0~100 범위 밖의 수를 입력해주세요.");
			score = input.nextInt();
			if(score<0 || score>100) {
				break;
			}
			sum += score;
			count++;
			
		}
		input.close();
		avg = (sum/count);
		
		System.out.printf("총점 : %d  평균 : %.2f", sum, avg);

	}

}

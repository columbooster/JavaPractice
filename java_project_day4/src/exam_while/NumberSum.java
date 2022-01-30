package exam_while;

import java.util.Scanner;
/*사용자로부터 5개의 정수를 읽어서 합과 평균값을 계산하여 출력하는 프로그램을 작성하라.
 * [출력예시]
 * 1번쨰 수 입력 : 1
 * 2번쨰 수 입력 : 2
 * ...
 * 5번째 수 입력 : 5
 * 합계 : 15 평균 : 3.0
 * 
 */

public class NumberSum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i, num, sum =0; double avg;
		i = 1;
		
		while(i <=5) {
			System.out.println(i+"번째 수 입력 : ");
			num = input.nextInt();
			sum += num;
			i++;
		}
		
		input.close();
		
		avg = (sum/5);
		
		System.out.printf("합계 : %d  평균 : %.1f", sum, avg);

	}

}

package exam_while;

import java.util.Scanner;
// -1이 입력될때까지 정수를 입력받아 그 수들의 합을 출력하는 프로그램을 작성하시오.
public class WhileExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num, sum;
		
		sum = 0;
		
		while(true) {
			System.out.println("숫자를 입력해 주세요.");
			num = input.nextInt();
			if(num == -1) {
				break;
			}
			sum = sum + num;
			
			
		}
		input.close();
		
		System.out.print(sum);

	}

}

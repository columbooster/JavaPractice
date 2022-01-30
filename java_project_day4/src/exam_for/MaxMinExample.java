package exam_for;
//10개의 데이터를 입력 받아 최소값, 최대값을 구하여 출력하는 코드랄 작성하시오.
import java.util.Scanner;

public class MaxMinExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int max, min, number;
		
		number = 0;
		max = -99999;
		min = 99999;
		
		
		for(int i = 0; i <10; i++) {
			System.out.println("숫자를 입력하세요.");
			number = input.nextInt();
			
			if(number > max) {
				max = number;
			} else if(number < min) {
				min = number;
			}
			if(i==9) {
				input.close();
			}
		}
		
		
		System.out.printf("최대값 : %d\t  최소값 : %d\n", max, min);

	}

}

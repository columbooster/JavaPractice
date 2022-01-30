package exam_for;

import java.util.Scanner;

public class AverageExample {

	public static void main(String[] args) {
		// 10개의 숫자를 입력 받아 0보다 큰 숫자에 관한 평균과 개수를 출력하는 코드를 작성하시오.
		
		Scanner input = new Scanner(System.in);
		
		int number, sum, count; double average;
		
		sum = 0;
		average = 0;
		count = 0;
		
		for(int i = 1; i <11; i++) {
			System.out.println(i+"번째 숫자를 입력해 주세요.");
			number = input.nextInt();
			if(number>0) {
				sum += number;
				count++;
			}
			if(i == 10) {
				input.close();
			}
		}
		
		if(count !=0) {
			average = (double) sum/count;
			System.out.printf("평균 : %.2f 개수 : %d\n", average, count);
		} else {
			System.out.println("평균을 구할 수 없습니다.");
		}
		

	}

}

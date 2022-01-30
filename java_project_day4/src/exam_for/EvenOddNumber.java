package exam_for;
// 두 수를 입력 받아, 두 수 사이에 홀수의 합과 짝수의 합을 출력하는 프로그램을 작성하시오. 수의 크기에 상관없이 수행 가능해야한다.
import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// 강사님 방법 1  -->> 미리 교환해서 풀자!!!
		int i, start, end, temp, oddSum = 0, evenSum =0;
		
		System.out.println("두 수를 공백을 기준으로 입력하세요.");
		start = input.nextInt();
		end = input.nextInt();
		input.close();
		
		if (start > end) { // 이렇게 교환하면 더 편하네!!!
			temp = start;
			start = end;
			end = temp;
		}
		
		for(i = start; i <= end; i++) {
			if (i%2 ==0) 
				evenSum = evenSum + i;
			else
				oddSum = oddSum + i;
		}
		
		
		System.out.printf("홀수의 합 : %d  짝수의 합 : %d%n", evenSum, oddSum);
		
		
		
		/* 내가 푼 방법
		int num1, num2, sum1, sum2;
		
		System.out.println("숫자를 2개 입력하세요.");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		input.close();
		
		sum1 = 0; //홀수 합
		sum2 = 0; //짝수 합
		
		if(num1 > num2) {
			for(int i = num2; i <= num1; i++) {
				if(i%2 == 0) {
					sum2 += i;
					
				} else if(i%2 == 1) {
					sum1 += i;
					
				}
			}	
		}
		
		if(num1 < num2 ) {
			for(int i = num1; i <= num2; i++) {
				if(i%2 == 0) {
					sum2 += i;
					
				} else if(i%2 == 1) {
					sum1 += i;
					
				}
			}
		}
		
		
		System.out.printf("홀수의 합 : %d  짝수의 합 : %d%n", sum1, sum2);
	*/
	}

}

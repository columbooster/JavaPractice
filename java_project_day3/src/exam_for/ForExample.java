package exam_for;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		//실습1
		
		for(int i = 1; i <=5; i++) {
			System.out.print(i +". ");
			System.out.print("Hello World!");
			System.out.println("I love Coding");
		}
		
		//실습2
		
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			sum += i;
		}
		
		System.out.printf("1부터 10까지 정수의 합 = %d\n", sum);
		System.out.println();
		
		//실습3
		
		int start, end;
		
		Scanner input = new Scanner(System.in);
		System.out.print("두 개의 수를 입력해 주세요 :");
		
		start = input.nextInt();
		end = input.nextInt();
		
		for(int i = start; i <= end; i++) {
			System.out.print(i +" ");
		}
		
		input.close();
		
	}

}

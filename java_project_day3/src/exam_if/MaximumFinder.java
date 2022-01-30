package exam_if;

import java.util.Scanner;
// 3개의 정수를 입력 받아서 최대값을 출력하도록 프로그램을 작성해 주세요.

public class MaximumFinder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, c, max;
		
		System.out.print("첫번째 정수를 입력하시오");
		a = input.nextInt();
		System.out.print("두번째 정수를 입력하시오");
		b = input.nextInt();
		System.out.print("세번째 정수를 입력하시오");
		c = input.nextInt();
		
		if(a>b && a>c) {
			max = a;
		} else if(b>a && b>c) {
			max = b;
		} else max = c;
		
		
		System.out.println("최대값은 : " + max);
		
		
		//방법1
		
		if(a>b) {
			max = a;
		} else {
			max = b;
		}
		
		if(c>max) {
			max = c;
		}
		
		System.out.println("최대값은 : " + max);
		
		//방법2
		max = a; // 첫번째 입력받은 숫자가 무조건 크다는 전제 필요
		
		if(b>max) {
			max = b;
		}
		if(c>max) {
			max = c;
		}
		System.out.println("최대값은 : " + max);
		
		input.close();

	}

}

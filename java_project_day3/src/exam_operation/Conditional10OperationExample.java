package exam_operation;

import java.util.Scanner;

public class Conditional10OperationExample {

	public static void main(String[] args) {
		
		int x = 100;
		int y = 200;
		
		System.out.println("두 수(100과 200) 중에서 최대값 : " + ((x>y) ? x : y));
		
		// 임의의 수를 가진 변수를 선언하고 그 값이 짝수인지 홀 수 인지를 출력할 수 있도록 작성해주세요.
		// 예를 들어 "4는 짝수 입니다."
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int a = input.nextInt();
		
		if(a%2 == 0) {
			System.out.println(a + "는 짝수 입니다.");
		}else {
			System.out.println(a + "는 홀 수 입니다.");
		}
		
		System.out.println(((a%2 == 0) ? a+"는 짝수 입니다" : a+"는 홀수 입니다."));
		
		// 두 수의 차를 출력해 주세요. 단 큰 수에서 작은 수를 빼서 결과를 출력합니다.
		System.out.println("숫자를 2개 입력해주세요.");
		int b = input.nextInt();
		int c = input.nextInt();
		
		System.out.println(((b>c) ? b-c : c-b));
		
		input.close();
	}

}

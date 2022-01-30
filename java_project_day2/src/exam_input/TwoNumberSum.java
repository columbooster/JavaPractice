package exam_input;
//사용자가 입력한 두 개의 숫자를 더해서 출력하는 프로그램을 작성하시오.
import java.util.Scanner;// Scanner 클래스 포함

public class TwoNumberSum {
		//메인 메소드에서부터 실행이 된다.
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x, y, sum;
		
		System.out.print("첫번째 숫자를 입력하시오: "); // 입력안내 출력   ---> 요구사항
		x = input.nextInt(); // 사용자로부터 첫 번째 숫자를 읽는다.
		
		System.out.print("두번째 숫자를 입력하시오: "); // 입력안내 출력
		y = input.nextInt(); // 사용자로부터 두 번째 숫자를 읽는다.
		
		sum = x + y; // 두 개의 숫자를 더한다.
		
		System.out.println("두 수의 합 : " + sum); // 합을 출력한다.
		
		input.close();

	}

}

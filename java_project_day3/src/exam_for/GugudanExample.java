package exam_for;

import java.util.Scanner;
//사용자로 하여금 2단 ~ 9단 사이의 값을 입력받아 해당 구구단을 출력하는 프로그램을 작성하시오.
public class GugudanExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("출력할 단을 적어주세요 : ");
		
		int number = input.nextInt();
		
		if(number<2 || number>9) {
			System.out.println("단은 2단에서 9단까지로 입력해 주세요.");
		} else {
		
			for(int i=1; i <10; i++) {
				System.out.println(number + "*" + i +"=" + (number*i));
			}
		
		input.close();
		}
	}

}

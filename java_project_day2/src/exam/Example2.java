package exam;

// x개의 사탕을 y명의 학생들에게 똑같이 나누어주려고 할 때, 각 학생들이 받을 수 있는 사탕의 수와 남는 사탕의 수를 계산해 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt(); // 사탕 개수
		int y = input.nextInt(); // 학생 수
		
		int share = x/y; // 몫
		int remainder = x%y; // 남는 사탕개수
		
		System.out.println("각 학생들이 받을 수 있는 사탕의 수 : " + share);
		System.out.println("남는 사탕의 수 = " + remainder);
		
		input.close();

	}

}

package exam_input;

/*
 * 각자의 이름, 나이, 주소를 입력받아 아래와 같이 출력할 수 있도록 작성해 주세요.
 * 
 * [출력문 예]
 * 홍길동님 안녕하세요. 50살이시네요.
 * 주소는 서울특별시 강남구 테헤란로14길 6 남도빌딩 4F
 */

import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		String name = input.next();
		
		System.out.print("나이를 입력하시오: ");
		int age = input.nextInt();
		input.nextLine();
		
		System.out.print("주소를 입력하시오: ");
		String address = input.nextLine();
		
		System.out.println(name+"님 안녕하세요! " + age +"살이시네요.");
		System.out.println("주소는 " + address);
		
		input.close();

	}

}

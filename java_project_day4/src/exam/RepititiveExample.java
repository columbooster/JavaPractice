package exam;

import java.util.Scanner;

public class RepititiveExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("연산자를 1 ~ 4으로, 종료는 5를 선택해 주세요.\n1. +\n2. -\n3. *\n4. /\n5. 종료\n선택>>"); // 초기 요구문 출력
		
		//반복문 start
		while(true) {
			
			num1 = input.nextInt(); // 연산자 항목 선택
			
			if(num1 < 1 || num1 >5) { // 1~5사이를 벗어날 경구 재요구
				System.out.println("1에서 5사이의 수를 입력해 주세요.\n1. +\n2. -\n3. *\n4. /\n5. 종료\n선택>>");
				continue; // continue를 통해서 num1 재입력 요구
			} else if(num1 == 5) { // 5일 경우 프로그램 종료 출력 후 break
				System.out.println("프로그램을 종료합니다.");
				break;
			} else{ // num1 이 1~5 사이일 경우 다음으로 진행
			
				System.out.print("사칙연산을 할 두 수를 입력하세요.");
				num2 = input.nextInt();
				num3 = input.nextInt();
			
				switch (num1) { // switch문으로 case를 구분해준다.
					case 1 :
						System.out.println(num2 + "+" + num3 + "=" + (num2+num3) + " \n1. +\n2. -\n3. *\n4. /\n5. 종료\n선택>>");
						break; 
					case 2 :
						System.out.println(num2 + "-" + num3 + "=" + (num2-num3) + " \n1. +\n2. -\n3. *\n4. /\n5. 종료\n선택>>");
						break;
					case 3 :
						System.out.println(num2 + "*" + num3 + "=" + (num2*num3) + " \n1. +\n2. -\n3. *\n4. /\n5. 종료\n선택>>");
						break;
					case 4 :
						System.out.println(num2 + "/" + num3 + "=" + (num2/num3) + " \n1. +\n2. -\n3. *\n4. /\n5. 종료\n선택>>");
						break;
					case 5 :
						System.out.println("프로그램을 종료합니다.");
						break;
					default : System.out.println("1에서 5사이의 수를 입력해 주세요.\n1. +\n2. -\n3. *\n4. /\n5. 종료\n선택>>");
				}
				
			}
			
			
		}
		
		input.close();
			

	}

}

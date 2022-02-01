package exam;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4) 중 하나를 선택하세요>>");

			int user = input.nextInt(); // 가위바위보 입력
		
			double computer = Math.random()*3+1; // 컴퓨터 1,2,3(가위,바위,보)
		
			
			if(user == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		
			if((int)computer == 1) {
				System.out.println("컴퓨터는 가위를 냈습니다.");
				switch (user) {
				case 1:
					System.out.println("비겼습니다.");
					break;
				case 2:
					System.out.println("이겼습니다.");
					break;
				case 3:
					System.out.println("졌습니다.");	
				}
			} else if((int)computer == 2) {
				System.out.println("컴퓨터는 바위를 냈습니다.");
				switch (user) {
				case 1:
					System.out.println("졌습니다.");
					break;
				case 2:
					System.out.println("비겼습니다.");
					break;
				case 3:
					System.out.println("이겼습니다.");	
				}
			} else if((int)computer == 3) {
				System.out.println("컴퓨터는 보를 냈습니다.");
				switch (user) {
				case 1:
					System.out.println("이겼습니다.");
					break;
				case 2:
					System.out.println("졌습니다.");
					break;
				case 3:
					System.out.println("비겼습니다.");	
				}
	
			}
			
			}
			
			input.close();

	}

}

package simplephoneinfo2;

import java.util.Scanner;

public class PhoneBookVer02 {

	public static Scanner input = new Scanner(System.in); // 스캐너 메소드로 입력 받기.
	
	public static void inputData(PhoneInfo pi) { // 사용자에게 입력받는 메소드
		
		System.out.print("이름 : ");
		pi.setName(input.nextLine());
		System.out.print("전화번호: ");
		pi.setPhoneNumber(input.nextLine());
		System.out.print("생년월일: ");
		pi.setBirthday(input.nextLine());
		
	}
	
	
	
	public static void main(String[] args) {
		
		PhoneInfo pi1 = new PhoneInfo(); // 인스턴스 생성
		
		int select; // 초반 선택을 위한 int형 변수 선언.
		
		
		while(true) { // while통한 반복문
			System.out.print("선택하세요.\n1. 데이터 입력 \n2. 프로그램 종료 \n선택 : ");
			select = input.nextInt(); // 데이터 입력할 건지 프로그램 종료할 건지 선택하기.
			input.nextLine(); // 입력 줄 꿔주기
			
			if(select == 1) { // 1번 선택일 경우
				
				inputData(pi1); // 사용자의 정보를 입력받아서
				
				System.out.println(); // 줄 띄워주기
				
				pi1.showPhoneInfo(); // 입력된 정보를 출력해주기.
				
				
			} else if(select == 2) { // 2번 선택할 경구 종료문 출력 후 종료.
				System.out.println("프로그램을 종료합니다.");
					break;
			} else System.out.print("1과 2중에서 선택해주세요.\n"); // 그 외의 번호 선택할경우 똑바로 선택하라고 출력.
			
			
			
		}
		
		
		
		
		

	}

}




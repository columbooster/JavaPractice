package simplephoneinfo2;

import java.util.Scanner;

public class PhoneBookVer02 {

	static Scanner input = new Scanner(System.in); // 스캐너 메소드로 입력 받기.
	
	public static void showMenu() { // 메뉴 출력 메소드
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.print("선택:");
		
	}
	
	
	public static void readData() { // 사용자에게 입력받는 메소드
		
		System.out.print("이름 : ");
		String name = input.nextLine();
		System.out.print("전화번호: ");
		String phone = input.nextLine();
		System.out.print("생년월일: ");
		String birthday = input.nextLine();
		
		if(birthday.equals("")) // 혹 사용자가 생년월일을 입력하지 않고 엔터를 입력하였다면 ""(빈문자)로 대입
			birthday = null; // showPhonInfo() 메서드는 생년웡일에 대한 제어를 null로 명시.
		
		PhoneInfo info = new PhoneInfo(name, phone, birthday);
		System.out.println("\n입력된 정보 출력...");
		info.showPhoneInfo();
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int choice; // 초반 선택을 위한 int형 변수 선언.
		
		
		while(true) { // while통한 반복문
			showMenu();
			choice = input.nextInt(); // 데이터 입력할 건지 프로그램 종료할 건지 선택하기.
			input.nextLine(); // 입력 줄 꿔주기
			
			switch (choice) {
			case 1 :
				readData();
				break;
			case 2 :
				System.out.println("프로그램을 종료합니다.");
				return;
				
			}
			
			
			
		}
		
		
		
		
		

	}

}




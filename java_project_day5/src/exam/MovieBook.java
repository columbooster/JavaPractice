package exam;

import java.util.Scanner;

public class MovieBook {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[10];
		
		while(true) {
			
		System.out.println("-------------------------");
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		System.out.println("-------------------------");
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		
		}
		
		System.out.println();
		System.out.println("-------------------------");
		
		System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1): ");
		int book = input.nextInt(); // 원하는 좌석번호 입력받기
		
		
		if(book>0 && book <=10) { // 1~10사이의 좌석번호 입력받았을때
			switch(num[book-1]) {
			case 1: // 이미 예약된경우
				System.out.println("이미 예약된 자리입니다.");
				break;
			case 0: // 예약 되어 있지 않을경우
				num[book-1] = 1; // 해당 인덱스의 값을 1로 바꾸고 예약을 해준다.
				System.out.println("예약되었습니다.");
				break;
			}	
		} else if(book == -1) {System.out.println("프로그램을 종료합니다."); // -1읍 입력 받으면 종료.
			break;
		} else if(book<-1 || book>10) System.out.println("좌석 번호 선택이 잘못되었습니다.");	 // -1보다 작거나 10보다 크면 범위를 벗어난다고 출력
		else System.out.println("좌석 번호 선택이 잘못되었습니다.");	// 0인 경우도 범위 벗어난다고 출력
		
		
		
		
		
		}
		
		input.close();

	}

}

package exam;

import java.util.Scanner;

public class ThreeSixNineExam3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		while(number<1 || number>99) {
			System.out.print("값의 범위를 초과하였습니다");
			break;
		}
		
		if(number<10) { // number의 값이 10 보다 작을경우
			switch(number%10) { // 10으로 나눠서 나머지가 3,6,9일 경우 박수짝 출력
			case 3:
			case 6:
			case 9:
				System.out.print("박수짝");
				break;
				} 
			}	
			
		if(number >= 10 && number <= 99){ // number의 값이 10 이상일 경우
			if(number/10 == 3 || number/10 == 6 || number/10 ==9) { // 10자리 몫이 3,6,9일 경우
				switch(number%10) { // 10으로 나눠서 나머지가 3,6,9일 경우 박수짝짝 출력
					case 3:
					case 6:
					case 9:
						System.out.print("박수짝짝");
						break;
					default: System.out.print("박수짝");	
					}
				}
			else { // 10의 자리 몫이 3,6,9가 아닌 경우
				switch(number%10) { // 10으로 나눠서 나머지가 3,6,9일 경우 박수짝 출력
				case 3:
				case 6:
				case 9:
					System.out.print("박수짝");
					break;
				}
			} 
		}
		
		input.close();

		
		
	}

}

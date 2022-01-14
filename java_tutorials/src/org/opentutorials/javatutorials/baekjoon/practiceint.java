package org.opentutorials.javatutorials.baekjoon;

import java.util.Scanner;

public class practiceint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 스캐너로 커피값 입력받기
		
		int i = 3; // 커피의 양 초기값 설정
		
		while(i > 0) {
			int b = sc.nextInt(); // 금액 조절 가능
			if(b == 300) { //커피값 300원으로 설정
				System.out.println("커피 나왔습니다");
				i--; // 커피한잔 나올때마다 커피양 감소설정
			} if(i == 0) { //커피가 떨어지면 판매중지&while문 종료
				System.out.print("판매중지"); break;
			}
		} 
		
		sc.close();
	}

}

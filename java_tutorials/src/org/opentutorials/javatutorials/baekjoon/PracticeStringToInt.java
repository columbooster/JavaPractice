package org.opentutorials.javatutorials.baekjoon;

import java.util.Scanner;

public class PracticeStringToInt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		if(s.contains("zero") || s.contains("0") ) {
			System.out.print(0);
		} if(s.contains("one") || s.contains("1") ) {
			System.out.print(1);
		}if(s.contains("two") || s.contains("2") ) {
			System.out.print(2);
		}if(s.contains("three") || s.contains("3") ) {
			System.out.print(3);
		}if(s.contains("four") || s.contains("4") ) {
			System.out.print(4);
		}if(s.contains("five") || s.contains("5") ) {
			System.out.print(5);
		}if(s.contains("six") || s.contains("6") ) {
			System.out.print(6);
		}if(s.contains("seven") || s.contains("7") ) {
			System.out.print(7);
		}if(s.contains("eight") || s.contains("8") ) {
			System.out.print(8);
		}if(s.contains("nine") || s.contains("9") ) {
			System.out.print(9);
		}
		
		
	}

}



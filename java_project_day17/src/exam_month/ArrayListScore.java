package exam_month;

import java.util.ArrayList;
import java.util.Scanner;

// ArrayList 복습

public class ArrayListScore {

	public static void main(String[] args) {

		ArrayList<Character> a = new ArrayList<Character>();

		Scanner scanner = new Scanner(System.in);

		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		for (int i = 0; i < 6; i++) {
			String s = scanner.next();
			if (s.length() > 1) {
				System.out.println("Not character");
				scanner.close();
				return;
			}
			char ch = s.charAt(0);
			if ((ch >= 'A' && ch <= 'D') || ch == 'F')
				a.add(ch);
			else {
				System.out.println("Invalid");
				scanner.close();
				return;
			}
		}

		double score = 0;
		
		//for (int i = 0; i < a.size(); i++) { 
		 for(char ch : a) {
			//char ch = a.get(i);
			switch (ch) {
			case 'A':
				score += 4.0;
				break;
			case 'B':
				score += 3.0;
				break;
			case 'C':
				score += 2.0;
				break;
			case 'D':
				score += 1.0;
				break;
			case 'F':
				score += 0.0;
				break;
			}
		}
		System.out.printf("%.2f", (score / a.size()));
		scanner.close();

	}

}

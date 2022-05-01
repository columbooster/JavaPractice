package example;

import java.util.Scanner;

public class Exammm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int str = Integer.parseInt(sc.nextLine());
		int num = sc.nextInt();
		
		if(str > num) {
			str = 0;
		}
		
		System.out.println(str + num);
		System.out.println(str);
		System.out.println(num);
		System.out.println(num+5);
		
	}

}

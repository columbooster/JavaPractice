package example;

import java.util.Scanner;

public class BusCard {
	public static String getRole(int age) {
		String s;
		
		if(age <= 13) {
			s = "���";
		} else if(14< age && age <= 20) {
			s = "û�ҳ�";
		} else s = "�";
		
		
		return s;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		String role = getRole(age);
		System.out.println(role);

	}

}

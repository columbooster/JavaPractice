package exam_switch;

import java.util.Scanner;

public class CoffeePrice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� Ŀ�Ǹ� �帱���?");
		
		String order = sc.next();
		
		int price = 0;
		
		switch(order) {
		case "īǪġ��":
		case "ī���":
			price = 3500;
			break;
		case "����������":
		case "�Ƹ޸�ī��":
			price = 2000;
			break;
		default:
			System.out.println("�޴��� �����ϴ�.");
		}
		
		if(price != 0) {
			System.out.print(order +"�� " + price + "�� �Դϴ�.");
		}
		
		sc.close();

	}

}

package exam;
/*���� �ڵ�� ���� ����� ������ ¦�� �̷絵�� 2���� �迭�� �ۼ��ض�.
 * "����"�� �Է¹����� �����Ѵ�.
 */

import java.util.Scanner;

public class ScoreArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] course = {"Java", "C++", "HTML5", "��ǻ�� ����", "�ȵ���̵�"};
		int[] score = {95, 88, 76, 62, 55};
		
		
		System.out.println("[���� ����] \nJava, C++, HTML5, ��ǻ�� ����, �����ͺ��̽�");
		
		while(true) {
			
		System.out.println("���� �̸�>>");
		String name = input.next();
		
		if(name.equals("����"))
			break;
		int i;
		for(i = 0; i < score.length; i++) {
			if(course[i].equals(name)) {
				System.out.println(name + " �� ������ " + score[i]);
				break;
			}
		}
		
		if(i == score.length)
			System.out.println("���� �����Դϴ�.");
		
		}
		System.out.println("���α׷��� �����մϴ�.");
		
		input.close();

	}

}

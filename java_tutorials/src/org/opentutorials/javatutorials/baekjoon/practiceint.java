package org.opentutorials.javatutorials.baekjoon;

import java.util.Scanner;

public class practiceint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // ��ĳ�ʷ� Ŀ�ǰ� �Է¹ޱ�
		
		int i = 3; // Ŀ���� �� �ʱⰪ ����
		
		while(i > 0) {
			int b = sc.nextInt(); // �ݾ� ���� ����
			if(b == 300) { //Ŀ�ǰ� 300������ ����
				System.out.println("Ŀ�� ���Խ��ϴ�");
				i--; // Ŀ������ ���ö����� Ŀ�Ǿ� ���Ҽ���
			} if(i == 0) { //Ŀ�ǰ� �������� �Ǹ�����&while�� ����
				System.out.print("�Ǹ�����"); break;
			}
		} 
		
		sc.close();
	}

}

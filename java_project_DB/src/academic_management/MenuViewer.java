package academic_management;

import java.util.Scanner;

public class MenuViewer {
	public static Scanner keyboard = new Scanner(System.in);

	public static void showTopMenu() {
		System.out.println("\n�����ϼ���...");
		System.out.println("1. �а� ����");
		System.out.println("2. �л� ����");
		System.out.println("3. ���α׷� ����");
		System.out.print("����>> ");
	}

	public static void showSubMenu() {
		System.out.println("1. ������ ��ȸ");
		System.out.println("2. ������ �Է�");
		System.out.println("3. ������ ����");
		System.out.println("4. ������ ����");
		System.out.println("5. ������ �˻�(�а���)");
		System.out.print("����>> ");
	}

}

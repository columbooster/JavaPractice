package exam_month;

import java.util.Scanner;
import java.util.Vector;

// vector ����

public class VectorBig {

	public static void printBig(Vector<Integer> v) { // ���� v�� ���� �� ���� ū �� ���
		int big = v.get(0); // �� ó���� �ִ� ���� ���� ū ���� �ʱ�ȭ
		for (int i = 1; i < v.size(); i++) {
			if (big < v.get(i)) // �� ū �� �߰�
				big = v.get(i); // big ���� ��ü
		}
		System.out.println("���� ū ���� " + big);
	}

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		Vector<Integer> vector = new Vector<Integer>();
//
//		System.out.print("����(-1�� �Էµ� ������)>> ");
//		while(true) {
//		vector.add(scan.nextInt());
//		if(scan.nextInt() == -1) break;
//		}
//		
//		vector.sort(null);
//		
//		System.out.println(vector.size());
//		
//		
//		System.out.println("���� ū ���� " + vector.get(0));

		Vector<Integer> v = new Vector<Integer>(); // �÷����� �������� ���� �� ���⶧���� Vector<Integer>�� ����
		Scanner scanner = new Scanner(System.in);

		System.out.print("����(-1�� �Էµ� ������)>> ");
		while (true) {
			int n = scanner.nextInt();
			if (n == -1) // �Էµ� ���� -1�̸�
				break;
			v.add(n);
		}

		if (v.size() == 0) {
			System.out.print("���� �ϳ��� ����");
			scanner.close();
			return;
		}
		printBig(v); // ���� v�� ���� �� ���� ū �� ���
		scanner.close();
	}

}

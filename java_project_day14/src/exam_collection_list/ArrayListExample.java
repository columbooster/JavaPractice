package exam_collection_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/* ����ڶ� ���α׷����� ���� �� �ִ� �ɻ��������� ������ �����ϴ� ���α׷��� �ۼ��϶�.
 * ������ 0.0���� 10.0 ���� �����ϴ�. 10���� ���� �Է¹޾� �� �߿���
 * �ְ� ����(Collections.max(����Ʈ�� ��������))��
 * ���� ����(Collections.min(����Ʈ�� ��������))
 * �� ���ܵȴ�. Double Ÿ���� ArrayList�� ����϶�.
 * 
 * [������]
 * 		�ɻ������� ����: 1
 *  	�ɻ������� ����: 2
 *  	�ɻ������� ����: 3
 *  	�ɻ������� ����: 4
 *  	�ɻ������� ����: 5
 *  	�ɻ������� ����: 6
 *  	�ɻ������� ����: 7
 *  	�ɻ������� ����: 8
 *  	�ɻ������� ����: 9
 *  	�ɻ������� ����: 10
 *  
 *  	������ ��: 44.0
 */

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Double> list = new ArrayList<Double>();

		Scanner scan = new Scanner(System.in);

//		for (int i = 0; i < 10; i++) {
//			System.out.println("�ɻ������� ���� : ");
//			double value = scan.nextDouble();
//			list.add(value);
//		}

		// �Է´ܰ�
		int i = 1;
		double value = 0.0;
		while (true) {
			System.out.printf("(%d��°)�ɻ����� ���� : ", i);
			value = scan.nextDouble();
			if (value < 0 || value > 10) {
				continue;
			}
			list.add(value);
			i++;
			if (i > 10)
				break;
		}

		// ó���ܰ� �� ��´ܰ�
		double max = Collections.max(list);
		double min = Collections.min(list);
		double sum = 0.0;
		double collValue = 0.0;

		for (int j = 0; j < 10; j++) {
			collValue = list.get(j);
			if (collValue != min && collValue != max) {
				sum += collValue;
			}
		}
		System.out.printf("������ �� : %.1f", sum);

		scan.close();

//		list.add((double) 1);
//		list.add((double) 2);
//		list.add((double) 3);
//		list.add((double) 4);
//		list.add((double) 5);
//		list.add((double) 6);
//		list.add((double) 7);
//		list.add((double) 8);
//		list.add((double) 9);
//		list.add((double) 10);
//
//		double count = 0;
//
//		Iterator<Double> it = list.iterator();
//		while (it.hasNext()) {
//			double num = it.next();
//			System.out.printf("\t�ɻ������� ����: %.0f%n", num);
//
//			count += num;
//		}
//
//		System.out.println();
//		System.out.println("\t������ ��: " + (count - Collections.max(list) - Collections.min(list)));

	}

}

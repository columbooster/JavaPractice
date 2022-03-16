package exam_month;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

// map ����
public class Scholarship {

	private String title;
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Double> scoreMap = new HashMap<String, Double>();

	public Scholarship(String name) {
		this.title = name;
	}

	public void read() {
		System.out.println(title + " ���� �ý��� �Դϴ�.");
		for (int i = 0; i < 5; i++) {
			System.out.print("�̸��� ����>> ");
			String name = scanner.next();
			double score = scanner.nextDouble();
			scoreMap.put(name, score);
		}
	}

	public void select() {

		System.out.print("���б� ���� ���� ���� �Է� >> ");
		double cutline = scanner.nextDouble();

		System.out.print("���л� ��� : ");
		Set<String> nameSet = scoreMap.keySet();
		Iterator<String> it = nameSet.iterator();
		while (it.hasNext()) {
			String name = it.next();
			double score = scoreMap.get(name);
			if (score > cutline) {
				System.out.print(name + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		
//		HashMap<String, Double> map = new HashMap<String, Double>();
//		
//		String[] name = new String[5];
//		double[] num = new double[5];
//		int count = 0;
//		
//		System.out.println("���б� ���� �ý����Դϴ�.");
//		while (count<5) {
//			System.out.print("�̸��� ������ �Է��ϼ���>> ");
//			name[count] = scanner.next();
//			num[count] = scanner.nextDouble();
//			map.put(name[count], num[count]);
//			count++;
//		}
//		
//		System.out.println(map);

		Scholarship sship = new Scholarship("���б�");
		sship.read();
		sship.select();

	}

}

package exam_month;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

// map 복습
public class Scholarship {

	private String title;
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Double> scoreMap = new HashMap<String, Double>();

	public Scholarship(String name) {
		this.title = name;
	}

	public void read() {
		System.out.println(title + " 관리 시스템 입니다.");
		for (int i = 0; i < 5; i++) {
			System.out.print("이름과 학점>> ");
			String name = scanner.next();
			double score = scanner.nextDouble();
			scoreMap.put(name, score);
		}
	}

	public void select() {

		System.out.print("장학금 선발 학점 기준 입력 >> ");
		double cutline = scanner.nextDouble();

		System.out.print("장학생 명단 : ");
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
//		System.out.println("장학금 관리 시스템입니다.");
//		while (count<5) {
//			System.out.print("이름과 학접을 입력하세요>> ");
//			name[count] = scanner.next();
//			num[count] = scanner.nextDouble();
//			map.put(name[count], num[count]);
//			count++;
//		}
//		
//		System.out.println(map);

		Scholarship sship = new Scholarship("장학금");
		sship.read();
		sship.select();

	}

}

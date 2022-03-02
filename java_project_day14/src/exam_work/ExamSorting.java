package exam_work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Lotto implements Comparable<Lotto> {
	private int order;
	private int num;

	public Lotto(int order, int num) {

		this.order = order;
		this.num = num;
	}

	@Override
	public String toString() {
		return order + "��° �ڸ� ��ȣ�� " + num;
	}

	@Override
	public int compareTo(Lotto o) {
		if (this.order > o.order)
			return 1;
		else if (this.order == o.order)
			return 0;
		else
			return -1;
	}

}

public class ExamSorting {

	public static void main(String[] args) {

		// 1���� 100���� ������ �������� 10���� ��� �����͸� �����Ͽ� ����� �� ����(��������)�Ͽ� �����͸� ����Ѵ�.

		ArrayList<Integer> array = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) { // �ݺ����� �̿��Ͽ� �������� 10�� �־��ش�.
			array.add((int) (Math.random() * 100) + 1); // random() �޼ҵ带 �̿��Ͽ� ������ ����. // 1~100���̱⶧���� *100�� 1�� �����ش�.
		}

		Collections.sort(array); // sort() �޼ҵ带 ����Ͽ� ������������ ����

		Iterator<Integer> iter = array.iterator(); // �ݺ��ڸ� ����Ͽ� ���
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	
		
		//1~100���� ��2 Ŭ����
		
		Random r = new Random();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) { 
			array.add(r.nextInt(100)+1); 
		}
		
		
		
		// �ζ� ��ȣ 6�ڸ��� ����ϵ��� �ڵ带 �ۼ��� �ּ���.

		TreeSet<Lotto> set1 = new TreeSet<Lotto>();

		for (int i = 1; i < 7; i++) {
			set1.add(new Lotto(i, (int) (Math.random() * 45) + 1));
		}

		System.out.println(set1.toString());
		
		
		
		// �ζ� 2
		
		Lotto2 lotto2 = new Lotto2();
		System.out.println(lotto2.toString());
		
		

	}

}

class Lotto2{
	Set<Integer> set = new HashSet<Integer>();
	
	public Lotto2() {
		int d;
		for (int i =0; i <6; i++) {
			do {
				d = (int)(Math.random()*45.0) + 1;
			} while (set.contains(d));
			set.add(d);
		}
	}

	@Override
	public String toString() {
		return "Lotto ��ȣ" + set.toString();
	}
	
	
	
}






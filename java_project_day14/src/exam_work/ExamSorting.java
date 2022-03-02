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
		return order + "번째 자리 번호는 " + num;
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

		// 1에서 100안의 임의의 정수값을 10개를 얻어 데이터를 저장하여 출력한 후 정렬(오름차순)하여 데이터를 출력한다.

		ArrayList<Integer> array = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) { // 반복문을 이용하여 난수값을 10번 넣어준다.
			array.add((int) (Math.random() * 100) + 1); // random() 메소드를 이용하여 난수를 얻어낸다. // 1~100사이기때문에 *100후 1을 더해준다.
		}

		Collections.sort(array); // sort() 메소드를 사용하여 오름차순으로 정렬

		Iterator<Integer> iter = array.iterator(); // 반복자를 사용하여 출력
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	
		
		//1~100난수 예2 클래스
		
		Random r = new Random();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) { 
			array.add(r.nextInt(100)+1); 
		}
		
		
		
		// 로또 번호 6자리를 출력하도록 코드를 작성해 주세요.

		TreeSet<Lotto> set1 = new TreeSet<Lotto>();

		for (int i = 1; i < 7; i++) {
			set1.add(new Lotto(i, (int) (Math.random() * 45) + 1));
		}

		System.out.println(set1.toString());
		
		
		
		// 로또 2
		
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
		return "Lotto 번호" + set.toString();
	}
	
	
	
}






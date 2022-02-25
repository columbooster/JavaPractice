package exam_collection_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest01 {
	public static void print(int n, List<String> list) {
		System.out.println(n + " : " + list);
	}

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("서울");
		list.add("북경");
		list.add("상해");

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + "\t");
		}
		System.out.println();

		list.add(1, "LA");
		print(1, list);

		list.addFirst("런던");
		print(2, list);

		list.addLast("서울");
		print(3, list);

		list.offer("파리");
		print(4, list);

		list.offerFirst("로마");
		print(5, list);

		list.offerLast("베른");
		print(6, list);

		System.out.println("7 : " + list.peek()); // peak() 메서드는 가장 첫번째 요소를 반환. 단 삭제 안함
		System.out.println("8 : " + list.peekFirst());
		System.out.println("9 : " + list.peekLast());

		list.poll(); // poll() 메서드는 가장 첫 번째 요소를 반환한 후 삭제
		print(10, list);

		list.pollFirst(); // pollFirst() 메소드는 가장 첫 번째 요소를 반환한 후 삭제
		print(11, list);

		list.pollLast(); // pollLast() 메소드는 가장 마지막 요소를 반환한 후 삭제
		print(12, list);

	}

}

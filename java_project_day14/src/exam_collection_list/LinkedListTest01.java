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

		list.add("����");
		list.add("�ϰ�");
		list.add("����");

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next() + "\t");
		}
		System.out.println();

		list.add(1, "LA");
		print(1, list);

		list.addFirst("����");
		print(2, list);

		list.addLast("����");
		print(3, list);

		list.offer("�ĸ�");
		print(4, list);

		list.offerFirst("�θ�");
		print(5, list);

		list.offerLast("����");
		print(6, list);

		System.out.println("7 : " + list.peek()); // peak() �޼���� ���� ù��° ��Ҹ� ��ȯ. �� ���� ����
		System.out.println("8 : " + list.peekFirst());
		System.out.println("9 : " + list.peekLast());

		list.poll(); // poll() �޼���� ���� ù ��° ��Ҹ� ��ȯ�� �� ����
		print(10, list);

		list.pollFirst(); // pollFirst() �޼ҵ�� ���� ù ��° ��Ҹ� ��ȯ�� �� ����
		print(11, list);

		list.pollLast(); // pollLast() �޼ҵ�� ���� ������ ��Ҹ� ��ȯ�� �� ����
		print(12, list);

	}

}

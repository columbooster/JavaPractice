package exam_work;

import java.util.*;

public class WordFreq {

	public static void main(String[] args) {

		String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "problem" }; // �־��� ���ڿ� �迭

		HashMap<String, Integer> map = new HashMap<String, Integer>(); // HashMap�� key Ÿ������ String�� �ְ� value Ÿ������
																		// Integer�� ����.

//		for (int i = 0; i < sample.length; i++) { // for���� �̿��� �迭�� ���� ��ŭ �ݺ��Ͽ� map�� key ���� value ���� �־��ش�.
//			if (map.containsKey(sample[i])) { // key ���� �ߺ��� ��� �ش� value���� +1�� ���ش�.
//				map.put(sample[i], map.get(sample[i]) + 1);
//			} else { // �ߺ����� ���� ���� ������ key ���� value ���� 1�� �������ش�.
//				map.put(sample[i], 1);
//			}
//		}

		for (String a : sample) {
			Integer freq = map.get(a);
			map.put(a, (freq == null) ? 1 : freq + 1);
		}

		System.out.printf("�� �ܾ� �� :  %d��\n", map.size()); // �ܾ� ����

		System.out.println(map.toString()); // ���

	}

}

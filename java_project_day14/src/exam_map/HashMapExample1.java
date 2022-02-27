package exam_map;

import java.util.*;

public class HashMapExample1 {

	public static void main(String[] args) {
		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();

		// ��ü ����
		map.put("������", 85);
		map.put("ȫ�浿", 90);
		map.put("���μ�", 80);
		map.put(new String("ȫ�浿"), Integer.valueOf(95));

		System.out.println("�� Entry �� : " + map.size());

		// ��ü ã��
		System.out.println("\tȫ�浿 ���� ã�� : " + map.get("ȫ�浿"));
		System.out.println();

		// ��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry �� : " + map.size());

		System.out.println(map.toString());
		System.out.println();

		// ��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// Ű�� ���� �� ������ ������ ��ü�� Set�� ��Ƽ� ����
		for (Map.Entry<String, Integer> s : map.entrySet()) {
			String key = s.getKey();
			Integer value = s.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}

	}

}

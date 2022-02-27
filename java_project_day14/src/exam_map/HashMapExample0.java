package exam_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample0 {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();

		// put(key, value) : ���� �߰�
		dic.put("��������", "��� ���� ��ſ��� ��");
		dic.put("�а���", "���� �μ��� ������ ����� ����");
		dic.put("�����߷�", "���и� ���ǻ�� �����");
		dic.put("���л���", "����ġ�� ���鼭 ���� ������");
		// dic.put(null, null); // HashMap�� Null�� ���� ����

		// get(key) : Ư�� Ű�� value�� ��ȯ�ϴ� �޼ҵ�
		System.out.println(dic.get("��������"));

		// ���1
		Set<String> keySet = dic.keySet(); // keySet()�� ��� Ű�� Set ��ü�� ��Ƽ� ����
		Iterator<String> keys = keySet.iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}
		System.out.println();

		// ��� 2

		for (String key : dic.keySet()) {
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}
		System.out.println();

		// ���3

		Set<Map.Entry<String, String>> entrySet = dic.entrySet(); //entrySet() �޼���� Ű�� ���� �� ������ ������ ��ü(Map.Entry)�� Set �� ��Ƽ� ����/
		Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, String> entry = entryIterator.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		System.out.println();

		// ���4
		for (Map.Entry<String, String> elem : dic.entrySet()) {
			System.out.printf("%s : %s\n", elem.getKey(), elem.getValue());
		}

	}

}

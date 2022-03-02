package exam_class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* ����, 112 / ȭ��, 119/ ��ȭ��ȣ, 114 �����Ͱ� HashMap�� ����Ǿ� �ִ�.
 * �� ��(value)�� ArrayList �ڷᱸ���� ������ �� �ֵ��� toArrayList() �޼��带 �����ϰ�
 * Main()���� ����ϵ��� ���α׷��� �ۼ��� �ּ���.
 */



public class HasshToArrayList {
	
	public static ArrayList<String> toArrayList(HashMap<String, String> hash){
		ArrayList<String> list = new ArrayList<String>();
		Set<String> set = hash.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			list.add(hash.get(key));
		}
		return list;
	}
	
	

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("����", "112");
		map.put("ȭ��", "119");
		map.put("��ȭ��ȣ", "114");
		
		ArrayList<String> list = HasshToArrayList.toArrayList(map);
		for(int n=0; n < list.size(); n++)
			System.out.println(list.get(n));

	}

}

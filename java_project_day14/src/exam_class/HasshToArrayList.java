package exam_class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* 범죄, 112 / 화재, 119/ 전화번호, 114 데이터가 HashMap에 저장되어 있다.
 * 이 값(value)을 ArrayList 자료구조에 저장할 수 있도록 toArrayList() 메서드를 정의하고
 * Main()에서 출력하도록 프로그램을 작성해 주세요.
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
		map.put("범죄", "112");
		map.put("화재", "119");
		map.put("전화번호", "114");
		
		ArrayList<String> list = HasshToArrayList.toArrayList(map);
		for(int n=0; n < list.size(); n++)
			System.out.println(list.get(n));

	}

}

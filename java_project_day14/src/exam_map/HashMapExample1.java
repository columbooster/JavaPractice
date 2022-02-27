package exam_map;

import java.util.*;

public class HashMapExample1 {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 객체 저장
		map.put("김희진", 85);
		map.put("홍길동", 90);
		map.put("조민수", 80);
		map.put(new String("홍길동"), Integer.valueOf(95));

		System.out.println("총 Entry 수 : " + map.size());

		// 객체 찾기
		System.out.println("\t홍길동 점수 찾기 : " + map.get("홍길동"));
		System.out.println();

		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());

		System.out.println(map.toString());
		System.out.println();

		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// 키와 값의 한 쌍으로 구성된 객체를 Set에 담아서 리턴
		for (Map.Entry<String, Integer> s : map.entrySet()) {
			String key = s.getKey();
			Integer value = s.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}

	}

}

package example;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Queue11 {

	public static void main(String[] args) throws java.lang.Exception {

		Stack<Integer> stk = new Stack<>();

		if (stk.empty()) {
			stk.push(1);
			stk.push(2);
			stk.push(3);
		}

		if (!stk.empty()) {
			if (stk.peek() == 3)
				stk.pop();

		}

		if (stk.search(3) == -1) {
			System.out.println("3 is poped");
		}

		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("key1", 1);
		hm.put("key2", 2);
		hm.put("key3", 3);

		if (hm.containsKey("key1") && hm.containsValue(1))
			System.out.println("YES");

		hm.put("key1", hm.getOrDefault(("key1"), 0) * 10);

		List<String> keyList = new ArrayList<>(hm.keySet());

		// 오름차순으로 키 정렬
		Collections.sort(keyList, new Comparator<String>() {
			public int compare(String s1, String s2) {
				int v1 = hm.get(s1);
				int v2 = hm.get(s2);

				return Integer.compare(v1, v2);
			}
		});

		// 출력
		for (String s : keyList) {
			System.out.println(s + " = " + hm.get(s));
		}

		System.out.println(hm.size());

	}

}

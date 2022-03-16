package example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Tanos {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "하나");
		map.put(2, "둘");
		map.put(3, "셋");
		
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()) {
			int key = it.next();
			String value = map.get(key);
			System.out.println("key" + key + "value " + value);
		}
		
		
	}

}

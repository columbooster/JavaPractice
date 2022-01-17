package org.opentutorials.javatutorials.baekjoon;

import java.util.HashMap;

public class practiceHashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("A", 12);
		map.put("B", 18);
		map.put("B", 283);
		
		System.out.println("Map Value : " + map.get("B"));
		
		System.out.println("Map size : " + map.size());
		
		map.replace("B", 3948);
		System.out.println("B value : " + map.get("B"));
		
		System.out.println("Key Exist : " + map.containsKey("B"));
		System.out.println("Value Exist : " + map.containsValue(12));
		
		System.out.println("Map Empty : " + map.isEmpty());
		
		map.remove("B");
			
		

	}

}

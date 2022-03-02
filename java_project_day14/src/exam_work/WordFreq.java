package exam_work;

import java.util.*;

public class WordFreq {

	public static void main(String[] args) {

		String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "problem" }; // 주어진 문자열 배열

		HashMap<String, Integer> map = new HashMap<String, Integer>(); // HashMap을 key 타입으로 String을 주고 value 타입으로
																		// Integer로 설정.

//		for (int i = 0; i < sample.length; i++) { // for문을 이용해 배열의 길이 만큼 반복하여 map에 key 값과 value 값을 넣어준다.
//			if (map.containsKey(sample[i])) { // key 값이 중복될 경우 해당 value값에 +1을 해준다.
//				map.put(sample[i], map.get(sample[i]) + 1);
//			} else { // 중복되지 않을 경우는 각각의 key 값에 value 값을 1로 설정해준다.
//				map.put(sample[i], 1);
//			}
//		}

		for (String a : sample) {
			Integer freq = map.get(a);
			map.put(a, (freq == null) ? 1 : freq + 1);
		}

		System.out.printf("총 단어 수 :  %d개\n", map.size()); // 단어 개수

		System.out.println(map.toString()); // 출력

	}

}

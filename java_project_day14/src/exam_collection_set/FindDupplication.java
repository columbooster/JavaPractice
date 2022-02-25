package exam_collection_set;

/* 전체 문자에서 중복된 단어를 검출하는 프로그램을 작성하여 보자.
 * 이 예제 HashSet을 이용하여 코딩하여 보세요.
 * String[] sample = {"단어", "의미", "구정", "의미", "단락"};
 * 
 * [출력결과]
 * 중복된 단어 : 의미
 * 단어 수 : 4
 * 중복되지 않은 단어 : [단락, 의미, 구절, 단어]
 * 
 */

import java.util.*;

public class FindDupplication {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		String[] sample = { "단어", "의미", "구정", "의미", "단락" };

		for (String a : sample) {
			if (!set.add(a)) // !(부정연산자) true -> false false-> true if(set.add(a) == false)
				System.out.println("중복된 단어: " + a);
		}

		System.out.println("단어 수 : " + set.size());
		System.out.println("중복되지 않은 단어: " + set.toString());

	}

}

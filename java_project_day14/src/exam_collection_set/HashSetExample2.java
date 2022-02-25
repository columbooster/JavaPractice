package exam_collection_set;

/* Member 클래스를 생성한다. 필드는 이름(name)과 나이(age)를 갖는다.
 * [요구사항]
 * 나이가 같으면 동일 객체로 본다.
 */


import java.util.*;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 50));
		set.add(new Member("홍길동", 40));
		set.add(new Member("김철수", 36));
		
		System.out.println("총 객체수 : " + set.size());
		System.out.println("\t" + set.toString());

	}

}

package exam_map;

// Student 라는 이름으로 클래스를 생성해주세요. 필드는 학번(sno), 이름(name)을 가진다.

import java.util.*;

class Student {
	private int sno; // 학번
	private String name; // 이름

	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return String.format("이름 : %s 학번 : %d", name, sno);
	}

}

public class HashMapExample2 {

	public static void main(String[] args) {

		HashMap<String, Student> st = new HashMap<String, Student>();
		st.put("1", new Student(99030001, "홍길동"));
		st.put("2", new Student(99030002, "김도훈"));
		st.put("3", new Student(99030003, "윤도희"));

		System.out.println(st.toString());

		Set<String> keySet = st.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			Student sst = st.get(key);
			System.out.println(key + " " + sst.toString());
		}

		// 키와 값의 한 쌍으로 구성된 객체를 Set에 담아서 리턴
		for (Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}

		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(70010001, "홍길동"), 95);
		map.put(new Student(70010001, "홍길동"), 89);

		System.out.println("총 Entry 수 : " + map.size());
		System.out.println(map.toString());

	}

}

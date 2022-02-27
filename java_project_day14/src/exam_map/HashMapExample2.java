package exam_map;

// Student ��� �̸����� Ŭ������ �������ּ���. �ʵ�� �й�(sno), �̸�(name)�� ������.

import java.util.*;

class Student {
	private int sno; // �й�
	private String name; // �̸�

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
		return String.format("�̸� : %s �й� : %d", name, sno);
	}

}

public class HashMapExample2 {

	public static void main(String[] args) {

		HashMap<String, Student> st = new HashMap<String, Student>();
		st.put("1", new Student(99030001, "ȫ�浿"));
		st.put("2", new Student(99030002, "�赵��"));
		st.put("3", new Student(99030003, "������"));

		System.out.println(st.toString());

		Set<String> keySet = st.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			Student sst = st.get(key);
			System.out.println(key + " " + sst.toString());
		}

		// Ű�� ���� �� ������ ������ ��ü�� Set�� ��Ƽ� ����
		for (Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}

		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(70010001, "ȫ�浿"), 95);
		map.put(new Student(70010001, "ȫ�浿"), 89);

		System.out.println("�� Entry �� : " + map.size());
		System.out.println(map.toString());

	}

}

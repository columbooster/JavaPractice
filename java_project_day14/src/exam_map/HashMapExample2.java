package exam_map;

// Student ��� �̸����� Ŭ������ �������ּ���. �ʵ�� �й�(sno), �̸�(name)�� ������.

import java.util.*;

class Student implements Comparable<Student> {
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

	@Override
	public int compareTo(Student o) {
		if (this.sno > o.sno)
			return 1;
		else if (this.sno == 0)
			return 0;
		else
			return -1;
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
		
		
		// (��ȣ, Student ��ü)�� �����ϴ� Ʈ���� ����
		TreeMap<String, Student> tMap = new TreeMap<String, Student>();
		tMap.put("1", new Student(94010001, "ȫ�浿"));
		tMap.put("4", new Student(95020001, "������"));
		tMap.put("2", new Student(97010001, "������"));
		tMap.put("3", new Student(99030003, "��ö��"));
		System.out.println(tMap.toString());
		
		TreeMap<Student, Integer> sMap = new TreeMap<Student, Integer>();
		sMap.put(new Student(97010001, "������"), 89);
		sMap.put(new Student(95020001, "������"), 90);
		sMap.put(new Student(94010001, "ȫ�浿"), 99);
		sMap.put(new Student(99030003, "��ö��"), 79);
		
		for (Map.Entry<Student, Integer> entry : sMap.entrySet()) {
			Student key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("key = " + key + ", value = " + val);
		}
		

	}

}

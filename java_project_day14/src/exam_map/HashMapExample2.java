package exam_map;

// Student ¶ó´Â ÀÌ¸§À¸·Î Å¬·¡½º¸¦ »ı¼ºÇØÁÖ¼¼¿ä. ÇÊµå´Â ÇĞ¹ø(sno), ÀÌ¸§(name)À» °¡Áø´Ù.

import java.util.*;

class Student implements Comparable<Student> {
	private int sno; // ÇĞ¹ø
	private String name; // ÀÌ¸§

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
		return String.format("ÀÌ¸§ : %s ÇĞ¹ø : %d", name, sno);
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
		st.put("1", new Student(99030001, "È«±æµ¿"));
		st.put("2", new Student(99030002, "±èµµÈÆ"));
		st.put("3", new Student(99030003, "À±µµÈñ"));

		System.out.println(st.toString());

		Set<String> keySet = st.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			Student sst = st.get(key);
			System.out.println(key + " " + sst.toString());
		}

		// Å°¿Í °ªÀÇ ÇÑ ½ÖÀ¸·Î ±¸¼ºµÈ °´Ã¼¸¦ Set¿¡ ´ã¾Æ¼­ ¸®ÅÏ
		for (Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}

		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(70010001, "È«±æµ¿"), 95);
		map.put(new Student(70010001, "È«±æµ¿"), 89);

		System.out.println("ÃÑ Entry ¼ö : " + map.size());
		System.out.println(map.toString());
		
		
		// (¹øÈ£, Student °´Ã¼)¸¦ ÀúÀåÇÏ´Â Æ®¸®¸Ê »ı¼º
		TreeMap<String, Student> tMap = new TreeMap<String, Student>();
		tMap.put("1", new Student(94010001, "È«±æµ¿"));
		tMap.put("4", new Student(95020001, "±èÈñÁø"));
		tMap.put("2", new Student(97010001, "À±µµÈñ"));
		tMap.put("3", new Student(99030003, "±èÃ¶¼ö"));
		System.out.println(tMap.toString());
		
		TreeMap<Student, Integer> sMap = new TreeMap<Student, Integer>();
		sMap.put(new Student(97010001, "À±µµÈñ"), 89);
		sMap.put(new Student(95020001, "±èÈñÁø"), 90);
		sMap.put(new Student(94010001, "È«±æµ¿"), 99);
		sMap.put(new Student(99030003, "±èÃ¶¼ö"), 79);
		
		for (Map.Entry<Student, Integer> entry : sMap.entrySet()) {
			Student key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("key = " + key + ", value = " + val);
		}
		

	}

}

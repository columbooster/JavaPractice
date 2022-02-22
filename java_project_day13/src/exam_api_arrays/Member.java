package exam_api_arrays;

//@SuppressWarnings("rawtypes")
//public class Member implements Comparable {
public class Member implements Comparable<Member> { //���׸� �������̽�

	private String name;
	private String add;
	private int age;

	public Member(String name, String add, int age) {
		this.name = name;
		this.add = add;
		this.age = age;
	}

//	@Override
//	public int compareTo(Object obj) {
//		Member m = (Member) obj;
//		// �� ��ü�� �ٸ� ��ü���� ũ�� 1, ������ 0, ������ -1�� ��ȯ�Ѵ�.
//		if (this.age > m.age)
//			return 1;
//		else if (this.age < m.age)
//			return -1;
//		else
//			return 0;
//		// return name.compareTo(m.name);
//	}
	@Override
	public int compareTo(Member o) {
		if (this.age > o.age)
			return 1;
		else if (this.age < o.age)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return String.format("name=%s address=%s age=%d\n", name, add, age);
	}

	public String getName() {
		return name;
	}

	public String getAdd() {
		return add;
	}

	public int getAge() {
		return age;
	}

}

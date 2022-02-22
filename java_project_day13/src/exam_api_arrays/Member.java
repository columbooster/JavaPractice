package exam_api_arrays;

//@SuppressWarnings("rawtypes")
//public class Member implements Comparable {
public class Member implements Comparable<Member> { //제네릭 인터페이스

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
//		// 이 객체가 다른 객체보다 크면 1, 같으면 0, 작으면 -1을 반환한다.
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

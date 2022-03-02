package exam_collection_set;

public class Member implements Comparable<Member> {

	private String name;
	private int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 나이로 비교
//	@Override
//	public int hashCode() {
//		return age;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Member) {
//			Member compareMember = (Member) obj;
//			if (this.age == compareMember.age) {
//				return true;
//			}
//		}
//
//		return false;
//	}

	// 이름으로 비교
//	@Override
//	public int hashCode() {
//		return name.hashCode();
//	}
//
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member compareMember = (Member) obj;
//			if(this.name.equals(compareMember.name))
//				return true;
//		}
//		return false;
//	}

	// 이름 나이로 비교

	@Override
	public int compareTo(Member o) {
		if (this.age > o.age)
			return 1;
		else if (this.age == o.age)
			return 0;
		else
			return -1;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member compareMember = (Member) obj;
			return compareMember.name.equals(name) && (compareMember.age == age);
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return String.format("member - (name : %s, age : %d )", name, age);
	}

}

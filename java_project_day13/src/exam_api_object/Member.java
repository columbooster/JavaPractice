package exam_api_object;

public class Member {

	private String id;
	private int age;

	public Member(String id, int age) {
		this.id = id;
		this.age = age;
	}
	
	

	@Override
	public boolean equals(Object obj) { // 부모클래스 참조변수 = 서브클래스의 참조값(주소값). 업캐스팅. Object obj = m1(Member 주소값);
		if(obj instanceof Member) {
			Member member = (Member) obj; //서브클래스 참조변수 = (서브클래스)부모클래스의 참조변수. 다운캐스팅
			if(this.id.equals(member.id)) {
			//if(this.age == member.age) {
				return true;
			}
		}
		return false;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

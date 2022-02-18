package exam_api_object;

public class Member {

	private String id;
	private int age;

	public Member(String id, int age) {
		this.id = id;
		this.age = age;
	}
	
	

	@Override
	public boolean equals(Object obj) { // �θ�Ŭ���� �������� = ����Ŭ������ ������(�ּҰ�). ��ĳ����. Object obj = m1(Member �ּҰ�);
		if(obj instanceof Member) {
			Member member = (Member) obj; //����Ŭ���� �������� = (����Ŭ����)�θ�Ŭ������ ��������. �ٿ�ĳ����
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

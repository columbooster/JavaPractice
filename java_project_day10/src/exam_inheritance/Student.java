package exam_inheritance;

public class Student extends Person {
	private String major;
	
	public Student() {
		super();
		System.out.println("Student ������ ȣ��");
		
	}
	
	public Student(String name, int age, String major) {
		super(name,age);
		this.major = major;
		System.out.println("Student(name, agr, dept) ������ ȣ��");
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return super.toString() + ":" + getMajor();
	}

}

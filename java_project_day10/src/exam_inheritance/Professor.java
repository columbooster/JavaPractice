package exam_inheritance;

public class Professor extends Person {
	private String subject;

	public Professor() {
		super();
		System.out.println("Professor 생성자 호출");

	}

	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		System.out.println("Professor(name, agr, dept) 생성자 호출");
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return super.toString() + ":" + getSubject();
	}

}

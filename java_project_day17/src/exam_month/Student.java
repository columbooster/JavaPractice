package exam_month;

public class Student extends Person {

	private int id;

	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String show() {
		return super.show() + ", ÇÐ¹ø : " + id;
	}

}

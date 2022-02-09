package exam_inheritance;

public class Employee extends Person {
	private String dept;
	
	public Employee() {
		super();
		System.out.println("Employee ������ ȣ��");
	}
	
	public Employee(String name, int age, String dept) {
		//super();
		//setName(name);
		//setAge(age);
		super(name,age); // ���� Ŭ������ ������ ȣ��. public Person(String name, int age) {}
		this.dept = dept;
		System.out.println("Employee(name, agr, dept) ������ ȣ��");
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	/*
	 * public String toString() { return getName() + ":" + getAge() + ":" +
	 * getDept(); }
	 */
	@Override
	public String toString() { // �޼��� �������̵�
		return super.toString() + ":" + dept;
	}

}

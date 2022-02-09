package exam_inheritance;

public class Employee extends Person {
	private String dept;
	
	public Employee() {
		super();
		System.out.println("Employee 생성자 호출");
	}
	
	public Employee(String name, int age, String dept) {
		//super();
		//setName(name);
		//setAge(age);
		super(name,age); // 슈퍼 클래스의 생성자 호출. public Person(String name, int age) {}
		this.dept = dept;
		System.out.println("Employee(name, agr, dept) 생성자 호출");
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
	public String toString() { // 메서드 오버라이딩
		return super.toString() + ":" + dept;
	}

}

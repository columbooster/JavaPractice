package exam_inheritance2;

public class Employee {
	private String name;
	private String address;
	private String phoneNumber;
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(String name, String address, String phoneNumber, int salary) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	// 전체필드를 설정하기 위한 메서드 (직원정보)
	public void setEmpData(String name, String address, String phoneNumber, int salary) {
		this.name = name;
		this.address = address;
		this.phoneNumber= phoneNumber;
		this.salary = salary;
	}
	
	

	public String toString() {
		return "사원명: " + name + ", 사원주소: " + address + ", 전화번호: " + getPhoneNumber() + ", 급여: " + salary;
	}

}

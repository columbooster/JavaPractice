package exam_class_basic;

public class Employee {
	
	private String employeeName;
	private String employeephoneNumber;
	private int employeesalary;
	
	
	public String getEmployeeName() {
		return  employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmployeephoneNumber() {
		return  employeephoneNumber;
	}
	
	public void setEmployeephoneNumber(String employeephoneNumber) {
		this.employeephoneNumber = employeephoneNumber;
	}
	
	public int getEmployeesalary() {
		return  employeesalary;
	}
	
	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}
	
	public String printData() {
		return "�������� [�����:" + employeeName + ", ��ȭ��ȣ =" + employeephoneNumber +  ", �޿�:"+ employeesalary + "]";
	}
	

}

package exam_class_basic;

/*���������� ������ Employee Ŭ������ �����غ���.
 * ������ �̸�(name), ��ȭ��ȣ(phoneNumber), �޿�(salary)�� �ʵ�� ������.
 * ���� ������ ���� Ŭ�������� ������ ������ �����Ͽ� �ش�.
 * �� �� ȭ�鿡 ��ü �ʵ��� ������ ��µǵ��� �ۼ��Ѵ�.
 * 
 * [������]
 * �������� [�����:ȫ�浿, ��ȭ��ȣ = 010-1234-2345, �޿�:100000000��]
 * �������� [�����:ȫ�ε�, ��ȭ��ȣ = 010-1244-2445, �޿�:130000000��]
 * 
 */


public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee em1 = new Employee();
		
		em1.setEmployeeName("ȫ�浿");
		em1.setEmployeephoneNumber("010-1234-2345");
		em1.setEmployeesalary(1000000);
		
		System.out.println(em1.printData());
		
	Employee em2 = new Employee();
		
		em2.setEmployeeName("ȫ����");
		em2.setEmployeephoneNumber("010-1434-2645");
		em2.setEmployeesalary(1200000);
		
		System.out.println(em2.printData());
		
		

	}

}

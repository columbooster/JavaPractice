package exam_inheritance2;

public class InheritanceTest2 {

	public static void main(String[] args) {
		
		Employee[] e = {new Employee("�Ӳ���", "��⵵ ������", "010-2324-3332", 5000000),
				new Manager("�̼���", "����Ư���� ������", "010-3342-3564", 3000000, 1500000, "����")};
		
		//Employee e = new Employee("�Ӳ���", "��⵵ ������", "010-2324-3332", 5000000);
		//Manager m = new Manager("�̼���", "����Ư���� ������", "010-3342-3564", 3000000, 1500000, "����");
		
		/*
		Employee e = new Employee();
		Manager m = new Manager();

		e.setEmpData("�Ӳ���", "��⵵ ������", "010-2354-2324", 5000000);
		m.setMgrData("�̼���", "����Ư���� ������", "010-2432-3463", 3000000, 1500000, "����");
		
		
		e.setName("�Ӳ���");
		e.setAddress("��⵵ ������ ��¼����¼��");
		e.setPhoneNumber("010-1234-5486");
		e.setSalary(2000000);

		m.setName("�̼���");
		m.setAddress("����Ư���� ������ ��¼����¼��");
		m.setPhoneNumber("010-2435-5832");
		m.setSalary(2100000);
		m.setBonus(300000);
		m.setJob("����");
		*/
		
		//System.out.println(e.toString());
		//System.out.println(m.toString());
		
		for(int i =0; i <e.length; i++) {
			//System.out.println(e[i]);
			System.out.println(e[i].toString());
		}
		
		for(Employee ee : e) {
			//System.out.println(ee.toString());
			System.out.println(ee);
		}

	}

}

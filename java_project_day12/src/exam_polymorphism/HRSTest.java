package exam_polymorphism;

// abstract class Employee extends Object {}  << �����Ϸ��� ���� �ڵ� �߰��Ǵ� ��	��. �ڹ��� ��Ӱ��迡�� Object�� �ֻ��� Ŭ����.
abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary();

	public abstract void clacBonus();

	@Override
	public String toString() {
		return "Employee";
	}

}

class Salesman extends Employee {

	@Override
	public void calcSalary() {
		System.out.println("Salesman �޿� = �⺻�� + �Ǹż���");

	}

	@Override
	public void clacBonus() {
		System.out.println("Salesman ���ʽ� = �⺻�� * 12 * 4");

	}

	@Override
	public String toString() {
		return "Salesman";
	}

}

class Consultant extends Employee {

	@Override
	public void calcSalary() {
		System.out.println("Consultant �޿� = �⺻�� + ������ Ư������");

	}

	@Override
	public void clacBonus() {
		System.out.println("Consultant ���ʽ� = �⺻�� * 12 * 2");

	}

	@Override
	public String toString() {
		return "Consultant";
	}

}

class Manager extends Employee {

	@Override
	public void calcSalary() {
		System.out.println("Manager �޿� = �⺻�� + �� ���� ����");

	}

	@Override
	public void clacBonus() {
		System.out.println("Manager ���ʽ� = �⺻�� * 12 * 6");

	}

	@Override
	public String toString() {
		return "Manager";
	}

}

class Director extends Manager {

	@Override
	public void clacBonus() {
		System.out.println("Director ���ʽ� = �⺻�� * 12 * 6");
		super.clacBonus();
	}

	@Override
	public String toString() {
		return "Director";
	}

}

public class HRSTest {
					//�޼����(����Ŭ���� ��������) <- ����Ŭ���� ��������  = ����Ŭ������ ������. ����Ŭ���� �������� = ����Ŭ������ ������. 
	public static void calcTax(Employee e) {
		//System.out.println("�ҵ漼�� ����մϴ�.");
		
		if(e instanceof Salesman) {
			System.out.println("Salesman �Դϴ�.");
		} else if(e instanceof Manager) {
			System.out.println("Manager �Դϴ�.");
		} else if(e instanceof Consultant) {
			System.out.println("Consultant �Դϴ�.");
		} else {
			System.out.println("Employee �Դϴ�.");
		}
	}

	public static void main(String[] args) {
		
		//Salesman s = new Salesman();
		Manager m = new Manager();
		Consultant c = new Consultant();
		
		calcTax(new Salesman());
		calcTax(m);
		calcTax(c);
		
		Salesman s1 = new Salesman();
		Employee s2 = new Salesman();
		Object s3 = new Salesman();
		
		Object m1 = new Manager();
		Employee m2 = new Manager();
		Manager m3 = new Manager();
		
		Object[] obj = {s1,s2,s3,m1,m2,m3};
		
		for(int i=0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		for(Object obj1 : obj) {
			System.out.println(obj1.toString());
		}
		
		

	}

}

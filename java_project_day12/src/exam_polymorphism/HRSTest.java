package exam_polymorphism;

// abstract class Employee extends Object {}  << 컴파일러에 의해 자동 추가되는 부	분. 자바의 상속관계에서 Object는 최상위 클래스.
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
		System.out.println("Salesman 급여 = 기본급 + 판매수당");

	}

	@Override
	public void clacBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");

	}

	@Override
	public String toString() {
		return "Salesman";
	}

}

class Consultant extends Employee {

	@Override
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별수당");

	}

	@Override
	public void clacBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");

	}

	@Override
	public String toString() {
		return "Consultant";
	}

}

class Manager extends Employee {

	@Override
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");

	}

	@Override
	public void clacBonus() {
		System.out.println("Manager 보너스 = 기본급 * 12 * 6");

	}

	@Override
	public String toString() {
		return "Manager";
	}

}

class Director extends Manager {

	@Override
	public void clacBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
		super.clacBonus();
	}

	@Override
	public String toString() {
		return "Director";
	}

}

public class HRSTest {
					//메서드명(슈퍼클래스 참조변수) <- 슈퍼클래스 참조변수  = 슈퍼클래스의 참조값. 슈퍼클래스 참조변수 = 서브클래스의 참조값. 
	public static void calcTax(Employee e) {
		//System.out.println("소득세를 계산합니다.");
		
		if(e instanceof Salesman) {
			System.out.println("Salesman 입니다.");
		} else if(e instanceof Manager) {
			System.out.println("Manager 입니다.");
		} else if(e instanceof Consultant) {
			System.out.println("Consultant 입니다.");
		} else {
			System.out.println("Employee 입니다.");
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

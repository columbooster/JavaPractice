package exam_inheritance2;

public class InheritanceTest2 {

	public static void main(String[] args) {
		
		Employee[] e = {new Employee("임꺽정", "경기도 성남시", "010-2324-3332", 5000000),
				new Manager("이수향", "서울특별시 강남구", "010-3342-3564", 3000000, 1500000, "팀장")};
		
		//Employee e = new Employee("임꺽정", "경기도 성남시", "010-2324-3332", 5000000);
		//Manager m = new Manager("이수향", "서울특별시 강남구", "010-3342-3564", 3000000, 1500000, "팀장");
		
		/*
		Employee e = new Employee();
		Manager m = new Manager();

		e.setEmpData("임꺽정", "경기도 성남시", "010-2354-2324", 5000000);
		m.setMgrData("이수향", "서울특별시 강남구", "010-2432-3463", 3000000, 1500000, "팀장");
		
		
		e.setName("임꺽정");
		e.setAddress("경기도 성남시 어쩌구저쩌구");
		e.setPhoneNumber("010-1234-5486");
		e.setSalary(2000000);

		m.setName("이수향");
		m.setAddress("서울특별시 강남구 어쩌구저쩌구");
		m.setPhoneNumber("010-2435-5832");
		m.setSalary(2100000);
		m.setBonus(300000);
		m.setJob("팀장");
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

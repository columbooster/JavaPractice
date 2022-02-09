package exam_inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		Employee e = new Employee("홀길동",30,"입학처");
		Professor p = new Professor("김철수", 50, "자바");
		Student s = new Student("김희수", 20, "컴퓨터과학");
		
		/*
		e.setName("홍길동");
		e.setAge(47);
		e.setDept("행정지원팀");
		
		p.setName("김푸름");
		p.setAge(52);
		p.setSubject("데이터베이스");
		
		s.setName("김유빈");
		s.setAge(20);
		s.setMajor("자바 프로그래밍 과정");
		*/
		System.out.println("Employee 정보  " + e.toString());
		System.out.println("Professor 정보  " +p.toString());
		System.out.println("Student 정보  " +s.toString());

	}

}

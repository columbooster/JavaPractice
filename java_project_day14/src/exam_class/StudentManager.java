package exam_class;

import java.util.*;

/* 한 명의 학생 정보를 Student 클래스에는 이름, 학과, 학번, 학점평균을 지정하는 필드가 있다.
 * [요구사항]
 * 실행 클래스의 이름은 StudentManager이다.
 * 사용자로 하여금 학생정보를 입력받아 Student 객체를 생성하고 4명의 학생 정보를 ArrayList<Student> 컬렉션에 저장한 후에(read()),
 * ArrayList<Student>의 모든 학생 (4명) 정보를 출력한다.(printAll())
 * 반복문을 통해서 학생 이름을 입력받아 학생의 정보를 출력하되 종료를 입력하면 프로그램을 종료하도록 (processQuery()) 프로그램을 작성하라.
 * 
 */
class Student {
	private String name;
	private String dep;
	private String id;
	private double avg;

	public Student() {

	}

	public Student(String name, String dep, String id, double avg) {
		super();
		this.name = name;
		this.dep = dep;
		this.id = id;
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}

public class StudentManager {

	private Scanner input = new Scanner(System.in);

	static ArrayList<Student> list = new ArrayList<Student>();

	private void read() {
		System.out.println("이름, 학과, 학번, 학점평균을 입력해 주세요.(,를 구분자로)");

		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String data = input.nextLine();
			StringTokenizer st = new StringTokenizer(data, ",");
			String name = st.nextToken().trim();
			String dept = st.nextToken().trim();
			String id = st.nextToken().trim();
			double avg = Double.parseDouble(st.nextToken().trim());

			Student student = new Student(name, dept, id, avg);
			list.add(student); // ArrayList에 저장
		}
	}

	private void printAll() {
		Iterator<Student> it = list.iterator();
		System.out.println("--------------------------");
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println("이름: " + student.getName());
			System.out.println("학과: " + student.getDep());
			System.out.println("학번: " + student.getId());
			System.out.println("학점평균: " + student.getAvg());
			System.out.println("--------------------------");
		}
	}

	private void processQuery() {
		while (true) {
			System.out.println("학생이름을 입력하세요 :");
			String name = input.nextLine(); // 학생이름 검색
			if (name.equals("종료"))
				return; // 종료

			for (int i = 0; i < list.size(); i++) { // list에 있는 모든 학생 검색
				Student student = list.get(i); // i번째 학생 객체
				if (student.getName().equals(name)) { // 이름이 같은 Student 찾음
					System.out.print(student.getName() + ", ");
					System.out.print(student.getDep() + ", ");
					System.out.print(student.getId() + ", ");
					System.out.println(student.getAvg());
					break; // for 문을 벗어남

				}
			}
		} // end of while

	}

	public void run() {
		read();
		printAll();
		processQuery();
	}

	public static void main(String[] args) {

		StudentManager sm = new StudentManager();

		sm.run();
	}

}

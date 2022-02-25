package exam_class;

import java.util.*;

/* �� ���� �л� ������ Student Ŭ�������� �̸�, �а�, �й�, ��������� �����ϴ� �ʵ尡 �ִ�.
 * [�䱸����]
 * ���� Ŭ������ �̸��� StudentManager�̴�.
 * ����ڷ� �Ͽ��� �л������� �Է¹޾� Student ��ü�� �����ϰ� 4���� �л� ������ ArrayList<Student> �÷��ǿ� ������ �Ŀ�(read()),
 * ArrayList<Student>�� ��� �л� (4��) ������ ����Ѵ�.(printAll())
 * �ݺ����� ���ؼ� �л� �̸��� �Է¹޾� �л��� ������ ����ϵ� ���Ḧ �Է��ϸ� ���α׷��� �����ϵ��� (processQuery()) ���α׷��� �ۼ��϶�.
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
		System.out.println("�̸�, �а�, �й�, ��������� �Է��� �ּ���.(,�� �����ڷ�)");

		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String data = input.nextLine();
			StringTokenizer st = new StringTokenizer(data, ",");
			String name = st.nextToken().trim();
			String dept = st.nextToken().trim();
			String id = st.nextToken().trim();
			double avg = Double.parseDouble(st.nextToken().trim());

			Student student = new Student(name, dept, id, avg);
			list.add(student); // ArrayList�� ����
		}
	}

	private void printAll() {
		Iterator<Student> it = list.iterator();
		System.out.println("--------------------------");
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println("�̸�: " + student.getName());
			System.out.println("�а�: " + student.getDep());
			System.out.println("�й�: " + student.getId());
			System.out.println("�������: " + student.getAvg());
			System.out.println("--------------------------");
		}
	}

	private void processQuery() {
		while (true) {
			System.out.println("�л��̸��� �Է��ϼ��� :");
			String name = input.nextLine(); // �л��̸� �˻�
			if (name.equals("����"))
				return; // ����

			for (int i = 0; i < list.size(); i++) { // list�� �ִ� ��� �л� �˻�
				Student student = list.get(i); // i��° �л� ��ü
				if (student.getName().equals(name)) { // �̸��� ���� Student ã��
					System.out.print(student.getName() + ", ");
					System.out.print(student.getDep() + ", ");
					System.out.print(student.getId() + ", ");
					System.out.println(student.getAvg());
					break; // for ���� ���

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

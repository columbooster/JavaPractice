package exam_inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		Employee e = new Employee("Ȧ�浿",30,"����ó");
		Professor p = new Professor("��ö��", 50, "�ڹ�");
		Student s = new Student("�����", 20, "��ǻ�Ͱ���");
		
		/*
		e.setName("ȫ�浿");
		e.setAge(47);
		e.setDept("����������");
		
		p.setName("��Ǫ��");
		p.setAge(52);
		p.setSubject("�����ͺ��̽�");
		
		s.setName("������");
		s.setAge(20);
		s.setMajor("�ڹ� ���α׷��� ����");
		*/
		System.out.println("Employee ����  " + e.toString());
		System.out.println("Professor ����  " +p.toString());
		System.out.println("Student ����  " +s.toString());

	}

}

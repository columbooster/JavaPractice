package exam_month;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p = new Person("ȫ�浿", 56);
		Student s = new Student("�Ѵú�", 41, 999010001);
		ForeignStudent f = new ForeignStudent("Olivia", 39, 991020392, "U.S.A");
		
		System.out.println("���["+ p.show() + "]");
		System.out.println("�л�["+ s.show() + "]");
		System.out.println("�ܱ�["+ f.show() + "]");
		
	}

}

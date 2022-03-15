package exam_month;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p = new Person("È«±æµ¿", 56);
		Student s = new Student("ÇÑ´Ãº½", 41, 999010001);
		ForeignStudent f = new ForeignStudent("Olivia", 39, 991020392, "U.S.A");
		
		System.out.println("»ç¶÷["+ p.show() + "]");
		System.out.println("ÇÐ»ý["+ s.show() + "]");
		System.out.println("¿Ü±¹["+ f.show() + "]");
		
	}

}

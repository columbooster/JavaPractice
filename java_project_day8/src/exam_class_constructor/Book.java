package exam_class_constructor;

public class Book {
	
	String title;
	String author;
	
	public Book() {
		this("","");
	}
	
	public Book(String title) {
		this(title, "���ڹ̻�");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		System.out.print("�Ű������� �ΰ��� ������\n");
	}
	
	public String toString() {
		return "å���� : " + title + " å���� : " + author;
	}

}

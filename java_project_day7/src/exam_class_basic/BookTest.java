package exam_class_basic;

public class BookTest {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		
		book1.bookData("a-123", "javajava", "�������ǻ�", 30000);
		
		book1.display();
		System.out.println();
		System.out.println(book1.toString());
		
		
		Book book2 = new Book();
		
		book2.bookNumber = "b-2345";
		book2.bookName = "�������Ŭ";
		book2.bookPublisher = "����Ŭ��";
		book2.bookPrice = 100000;
		
		System.out.println(book2.bookNumber);
		System.out.println(book2.bookName);
		System.out.println(book2.bookPublisher);
		System.out.println(book2.bookPrice);
		System.out.println();
		
		book2.display();
		System.out.println();
		
		System.out.println(book2.toString());
		
		

	}

}

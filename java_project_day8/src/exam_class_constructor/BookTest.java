package exam_class_constructor;

public class BookTest {

	public static void main(String[] args) {
		
		Book littlePrince = new Book("�����", "�������丮");
		Book loveStory = new Book("������");
		
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
		
		System.out.println(littlePrince.toString());
		System.out.println(loveStory.toString());
	}

}

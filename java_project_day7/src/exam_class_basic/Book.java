package exam_class_basic;

public class Book {
	//필드정의
	public String bookNumber; //책번호
	public String bookName; // 책이름
	public String bookPublisher; // 출판사명
	public int bookPrice; //책가격
	
	//메소드 정의 - 필드값을 설정해주기 위한 메서드
	public void bookData(String number, String name, String publisher, int price) {
		bookNumber = number;
		bookName = name;
		bookPublisher = publisher;
		bookPrice = price;
	}
	
	//메서드정의  - 필드값을 출력하기 위한 메서드
	public void display() {
		System.out.println("책번호: " + bookNumber + "\n책이름: " + bookName + "\n출판사명: " + bookPublisher + "\n책가격: " + bookPrice);
	}
	
	public String toString() {
		//rturn "책번호: " + bookNumber + "\n책이름: " + bookName + "\n출판사명: " + bookPublisher + "\n책가격: " + bookPrice
		return String.format("책번호: %s\n책이름: %s\n출판사명: %s\n책가격: %d\n", bookNumber, bookName, bookPublisher, bookPrice);
	}
	
}

package exam_class_basic;

public class Book {
	//�ʵ�����
	public String bookNumber; //å��ȣ
	public String bookName; // å�̸�
	public String bookPublisher; // ���ǻ��
	public int bookPrice; //å����
	
	//�޼ҵ� ���� - �ʵ尪�� �������ֱ� ���� �޼���
	public void bookData(String number, String name, String publisher, int price) {
		bookNumber = number;
		bookName = name;
		bookPublisher = publisher;
		bookPrice = price;
	}
	
	//�޼�������  - �ʵ尪�� ����ϱ� ���� �޼���
	public void display() {
		System.out.println("å��ȣ: " + bookNumber + "\nå�̸�: " + bookName + "\n���ǻ��: " + bookPublisher + "\nå����: " + bookPrice);
	}
	
	public String toString() {
		//rturn "å��ȣ: " + bookNumber + "\nå�̸�: " + bookName + "\n���ǻ��: " + bookPublisher + "\nå����: " + bookPrice
		return String.format("å��ȣ: %s\nå�̸�: %s\n���ǻ��: %s\nå����: %d\n", bookNumber, bookName, bookPublisher, bookPrice);
	}
	
}

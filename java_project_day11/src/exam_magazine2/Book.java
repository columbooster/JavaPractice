package exam_magazine2;

public class Book {
	// �ʵ�
	private String title;
	private int page;
	private String author;
	private String date;

	public Book(String title, int page, String author, String date) { // ������
		this.title = title;
		this.page = page;
		this.author = author;
		this.date = date;
	}
	//��� �޼ҵ�
	public void printData() {
		System.out.println("å �̸� : " + title + "\n������ �� : " + page + "\n���� : " + author + "\n�߸��� : " + date);
		System.out.println();
	}
	// getter/setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}

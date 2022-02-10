package exam_book;

public class SeperateVolume implements Lendable {
	
	private String requestNo;
	private String bookTitle;
	private String writer;
	private String borrower;
	private String checkOutDate;
	private int state;
	
	public SeperateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	

	@Override
	public void checkOut(String borrower, String date) { //���� �޼���
		if(state !=0) // �뿩���̶�� 
			return;		// return ��;  return; - �޼��带 �����ϰڴٴ� �ǹ�.
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1; // �������
		System.out.println("*"+ bookTitle + "("+ writer + ") ��(��) ����Ǿ����ϴ�.");
		System.out.println("������ : " + this.borrower);
		System.out.println("������ : " + this.checkOutDate + "\n");
	}

	@Override
	public void checkIn() { //�ݳ� �޼���
		if(state == 0) { // �̹� �ݳ� ó���� �Ǿ��ٸ�
			System.out.println("�̹� �ݳ�ó���� �Ϸ�Ǿ����ϴ�.");
			return;
		}
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0; //�ݳ�����
		System.out.println("*"+ bookTitle + "�� �ݳ��Ǿ����ϴ�.");
	}


	public String getRequestNo() {
		return requestNo;
	}


	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getBorrower() {
		return borrower;
	}


	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}


	public String getChekOutDate() {
		return checkOutDate;
	}


	public void setChekOutDate(String chekOutDate) {
		this.checkOutDate = chekOutDate;
	}


	public int getState() {
		return state;
	}


	public void setState(int state) {
		this.state = state;
	}
	
	
	
	

}

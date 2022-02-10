package exam_book;

public class AppCDInfo extends CDInfo implements Lendable {

	private String registerNo;
	private String title;
	private String borrower;
	private String checkOutDate;
	private int state;
	
	public AppCDInfo(String registerNo, String title) {
		super(registerNo, title);
		this.registerNo = registerNo;
		this.title = title;
	}
	
	
	@Override
	public void checkOut(String borrower, String date) {
		if(state !=0) // �뿩���̶�� 
			return;		// return ��;  return; - �޼��带 �����ϰڴٴ� �ǹ�.
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1; // �������
		System.out.println("*"+ title + " �� ����Ǿ����ϴ�.");
		System.out.println("������ : " + this.borrower);
		System.out.println("������ : " + this.checkOutDate + "\n");
		
	}


	@Override
	public void checkIn() {
		if(state == 0) { // �̹� �ݳ� ó���� �Ǿ��ٸ�
			System.out.println("�̹� �ݳ�ó���� �Ϸ�Ǿ����ϴ�.");
			return;
		}
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0; //�ݳ�����
		System.out.println("*"+ title + "�� �ݳ��Ǿ����ϴ�.");
		
	}



	public String getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	
	
	
	
	
	

}

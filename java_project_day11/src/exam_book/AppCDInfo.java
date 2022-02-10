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
		if(state !=0) // 대여중이라면 
			return;		// return 값;  return; - 메서드를 종료하겠다는 의미.
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1; // 대출상태
		System.out.println("*"+ title + " 이 대출되었습니다.");
		System.out.println("대출인 : " + this.borrower);
		System.out.println("대출일 : " + this.checkOutDate + "\n");
		
	}


	@Override
	public void checkIn() {
		if(state == 0) { // 이미 반납 처리가 되었다면
			System.out.println("이미 반납처리가 완료되었습니다.");
			return;
		}
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0; //반납상태
		System.out.println("*"+ title + "이 반납되었습니다.");
		
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

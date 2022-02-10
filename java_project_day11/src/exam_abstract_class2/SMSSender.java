package exam_abstract_class2;

class SMSSender extends MessageSender {
	String returnPhoneNo;
	String message;
	
	public SMSSender (String title, String senderName, String returnPhoneNo, String message) {
		super(title, senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}
	
	@Override
	public void sendMessage(String recipient) {
		System.out.println("------------------------");
		System.out.println("제목 : " + getTitle() +"\n보내는사람 : "+ getSenderName() + "\n전화번호 : " + recipient + "\n회신 전화번호: "+ returnPhoneNo + "\n메시지 내용 : " + message);
	}

	public String getReturnPhoneNo() {
		return returnPhoneNo;
	}

	public void setReturnPhoneNo(String returnPhoneNo) {
		this.returnPhoneNo = returnPhoneNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

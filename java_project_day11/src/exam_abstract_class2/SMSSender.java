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
		System.out.println("���� : " + getTitle() +"\n�����»�� : "+ getSenderName() + "\n��ȭ��ȣ : " + recipient + "\nȸ�� ��ȭ��ȣ: "+ returnPhoneNo + "\n�޽��� ���� : " + message);
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

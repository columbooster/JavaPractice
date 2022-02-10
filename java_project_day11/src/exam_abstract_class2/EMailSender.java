package exam_abstract_class2;

public class EMailSender extends MessageSender {
	String senderAddr;
	String emailBody;
	
	public EMailSender(String title, String senderName, String senderAddr, String emailBody) {
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}
	
	
	@Override
	public void sendMessage(String recipient) {
		System.out.println("------------------------");
		System.out.println("���� : " + getTitle() +"\n�����»�� : "+ getSenderName() +" " + getSenderAddr() + "\n�޴»�� : " + recipient + "\n���� : " + emailBody);
	}


	public String getSenderAddr() {
		return senderAddr;
	}


	public void setSenderAddr(String senderAddr) {
		this.senderAddr = senderAddr;
	}


	public String getEmailBody() {
		return emailBody;
	}


	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}
	
	
	
	
	
}

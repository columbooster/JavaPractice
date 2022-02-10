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
		System.out.println("제목 : " + getTitle() +"\n보내는사람 : "+ getSenderName() +" " + getSenderAddr() + "\n받는사람 : " + recipient + "\n내용 : " + emailBody);
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

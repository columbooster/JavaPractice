package exam_abstract_class2;

public class MessageSenderTest {

	public static void main(String[] args) {
		
		EMailSender email = new EMailSender(
				"������ �����մϴ�.", "������", "admin@dukeeshop.co.kr", "10%���� ������ ����Ǿ����ϴ�.");
		email.sendMessage("javaone@naver.com");
		
		SMSSender sms = new SMSSender(
				"������ �����մϴ�.", "������", "02-0000-0000", "10%���� ������ ����Ǿ����ϴ�.");
		sms.sendMessage("010-2323-3434");
		
		//MessageSender ms = new MessageSender();
		//�߻� Ŭ������ �ν��Ͻ��� ������ �� ����. �߻� �޼��带 �����ϱ� ������.

	}

}

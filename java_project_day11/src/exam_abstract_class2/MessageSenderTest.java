package exam_abstract_class2;

public class MessageSenderTest {

	public static void main(String[] args) {
		
		EMailSender email = new EMailSender(
				"생일을 축하합니다.", "고객센터", "admin@dukeeshop.co.kr", "10%할인 쿠폰이 발행되었습니다.");
		email.sendMessage("javaone@naver.com");
		
		SMSSender sms = new SMSSender(
				"생일을 축하합니다.", "고객센터", "02-0000-0000", "10%할인 쿠폰이 발행되었습니다.");
		sms.sendMessage("010-2323-3434");
		
		//MessageSender ms = new MessageSender();
		//추상 클래스는 인스턴스를 생성할 수 없다. 추상 메서드를 포함하기 떄문에.

	}

}

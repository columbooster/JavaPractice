package exam_interface_check;

public class IPhoneMessenger extends GraphicIOS implements Messenger {

	@Override
	public String getMessage() {
		return "iPhone";
	}

	@Override
	public void setMessage(String msg) {
		System.out.println("iPhone���� �޽����� �����մϴ�. : " + msg);
		
	}
	
	public void clearMessage() {
		System.out.println("�¿�� ���� ���ڿ��� ����ϴ�.");
	}

	
	

}

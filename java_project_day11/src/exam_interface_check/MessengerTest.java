package exam_interface_check;

public class MessengerTest {

	public static void main(String[] args) {
		
		//Messenger msg = new Messenger(); //�������̽��� �ν��Ͻ��� ������ �� ����. �������� ��������� ����.
		
		IPhoneMessenger iphone = new IPhoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		System.out.println("�޽��� �ּ� ���� ũ�� : " + Messenger.MIN_SIZE);
		System.out.println("�޽��� �ִ� ���� ũ�� : " + Messenger.MAX_SIZE);
		
		iphone.setLogin(true);
		System.out.println(iphone.getMessage());
		iphone.setMessage("�ȳ�~");
		iphone.clearMessage();
		
		iphone.draw_textBox();
		iphone.draw_submitButton();
		
		galaxy.setLogin(true);
		System.out.println(galaxy.getMessage());
		galaxy.setMessage("�ݰ���~");
		galaxy.changeKeyboard();
		
		galaxy.fileUpload();
		galaxy.filedownload();

	}

}

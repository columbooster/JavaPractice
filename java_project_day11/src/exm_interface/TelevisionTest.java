package exm_interface;

public class TelevisionTest {

	public static void main(String[] args) {
		// RemoteControl rc = new RemoteControl(); �������̽� �ν��Ͻ� ���� (x)
		
		Television tv = new Television();
		RemoteControl.changeBattery(); // �������̽���.static�޼���()
		tv.turnOn();
		tv.setVolume(20);
		System.out.println(tv.toString());
		tv.setMute(true); // ����Ʈ �޼��� ȣ��
		tv.turnOff();
		System.out.println();
		
		Radio rd = new Radio("ǥ�� FM", 99.7);
		
		rd.turnOn();
		rd.setVolume(50);
		rd.printRF();	
		System.out.println(rd.toString());
		rd.turnOff();
		System.out.println();
		
		
		SmartTelevision sm = new SmartTelevision();
		sm.turnOn();
		sm.serch("http://www.naver.com(���̹�)");
		sm.turnOff();
		
		//�������� ����
		//�������̽� �������� = new ����Ŭ����������();
		//RemoteControl rcl = new RemoteControl();
		RemoteControl rc = new Television();
		rc.turnOn();

	}

}

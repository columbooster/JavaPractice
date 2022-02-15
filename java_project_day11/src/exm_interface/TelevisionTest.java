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
		rc.turnOn();	//�������̽��� ����� �޼��� ����
		//rc.printChannel(); // ������ �޼��� ������ �Ұ���
		((Television)rc).printChannel();
		rc.turnOff();
		
		rc = new Radio("ǥ��FM (MHz)", 95.9);
		rc.turnOn();
		//���� Ŭ������ �޼��带 ȣ���ϴ� ���1
		((Radio)rc).printRF();
		
		//���� Ŭ������ �޼��带 ȣ���ϴ� ���2
		Radio ro = (Radio)rc;
		ro.printRF();
		
		ro.turnOff();
		
		rc = new SmartTelevision();
		rc.turnOn();
		rc.setVolume(16);
		
		//rc = new Car();
		// RemoteControl �������̽��� �����Ǿ��ִ� Ŭ������ �ƴϱ� ������ ���� ���� ��ô� �Ұ���.

	}

}

package exm_interface;

public interface RemoteControl {
	//���
	public static final int MAX_VOLUME = 32;
	/*public static fianl */ int MIN_VOLUME = 0;
	
	//�߻� �޼���
	public abstract void turnOn();
	
	public /*abstract*/ void turnOff();
	
	/*public abstract */ void setVolume(int volume);
	
	//����Ʈ �޼ҵ�
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		} else { 
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//���� �޼ҵ�
	public static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}

}

package exm_interface;
//����ü���� class ����Ŭ���� implements �������̽��� {}
public class Television implements RemoteControl {
	private int volume;
	private int channel;
	
	@Override
	public void turnOn() {
		//������ TV�� ������ �ѱ����� �޼ҵ�
		System.out.println("TV�ѱ�");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV����");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
	}
	
	public void printChannel() {
		System.out.println("���� ä�� ������ " + channel + "�� �Դϴ�.");
	}
	
	public String toString() {
		return "���� TV ���� : " + volume;
	}

}

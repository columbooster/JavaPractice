package exm_interface;

//���� Ŭ����
public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;

	@Override
	public void serch(String url) {
		System.out.println(url + "�� �˻��մϴ�.");

	}

	@Override
	public void turnOn() {
		System.out.println("SmartTelevison �ѱ�");

	}

	@Override
	public void turnOff() {
		System.out.println("SmartTelevison ����");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
	}

	public String toString() {
		return "���� TV ���� : " + volume;
	}

}

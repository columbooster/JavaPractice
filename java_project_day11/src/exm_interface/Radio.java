package exm_interface;

public class Radio implements RemoteControl {

	private int volume;
	private String standard;
	private double radioFrequency;

	public Radio(String standard, double radioFrequency) {
		this.standard = standard;
		this.radioFrequency = radioFrequency;
	}

	@Override
	public void turnOn() {
		System.out.println("Radion�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Radion�� ���ϴ�.");
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

	public void printRF() {
		System.out.println("���� ���ļ� ������ " + standard +" " + radioFrequency + "MHz(KHz)�Դϴ�.");
	}

	public String toString() {
		return "���� Radio�� ������" + volume + "�Դϴ�.";
	}

}

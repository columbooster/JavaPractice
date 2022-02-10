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
		System.out.println("Radion를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Radion를 끕니다.");
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
		System.out.println("현재 주파수 선택은 " + standard +" " + radioFrequency + "MHz(KHz)입니다.");
	}

	public String toString() {
		return "현재 Radio의 볼륨은" + volume + "입니다.";
	}

}

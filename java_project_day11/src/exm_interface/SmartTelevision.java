package exm_interface;

//구현 클래스
public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;

	@Override
	public void serch(String url) {
		System.out.println(url + "을 검색합니다.");

	}

	@Override
	public void turnOn() {
		System.out.println("SmartTelevison 켜기");

	}

	@Override
	public void turnOff() {
		System.out.println("SmartTelevison 끄기");

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
		return "현재 TV 볼륨 : " + volume;
	}

}

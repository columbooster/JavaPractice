package exm_interface;
//접근체한자 class 구현클래스 implements 인터페이스명 {}
public class Television implements RemoteControl {
	private int volume;
	private int channel;
	
	@Override
	public void turnOn() {
		//실제로 TV의 전원을 켜기위한 메소드
		System.out.println("TV켜기");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV끄기");
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
		System.out.println("현재 채널 선택은 " + channel + "번 입니다.");
	}
	
	public String toString() {
		return "현재 TV 볼륨 : " + volume;
	}

}

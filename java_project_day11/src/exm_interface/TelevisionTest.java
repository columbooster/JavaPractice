package exm_interface;

public class TelevisionTest {

	public static void main(String[] args) {
		// RemoteControl rc = new RemoteControl(); 인터페이스 인스턴스 생성 (x)
		
		Television tv = new Television();
		RemoteControl.changeBattery(); // 인터페이스명.static메서드()
		tv.turnOn();
		tv.setVolume(20);
		System.out.println(tv.toString());
		tv.setMute(true); // 디폴트 메서드 호출
		tv.turnOff();
		System.out.println();
		
		Radio rd = new Radio("표준 FM", 99.7);
		
		rd.turnOn();
		rd.setVolume(50);
		rd.printRF();	
		System.out.println(rd.toString());
		rd.turnOff();
		System.out.println();
		
		
		SmartTelevision sm = new SmartTelevision();
		sm.turnOn();
		sm.serch("http://www.naver.com(네이버)");
		sm.turnOff();
		
		//다형성에 의해
		//인터페이스 참조변수 = new 구현클래스생성자();
		//RemoteControl rcl = new RemoteControl();
		RemoteControl rc = new Television();
		rc.turnOn();

	}

}

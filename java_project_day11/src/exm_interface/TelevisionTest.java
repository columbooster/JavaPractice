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
		rc.turnOn();	//인터페이스에 선언된 메서드 접근
		//rc.printChannel(); // 구현된 메서드 접근은 불가능
		((Television)rc).printChannel();
		rc.turnOff();
		
		rc = new Radio("표준FM (MHz)", 95.9);
		rc.turnOn();
		//구현 클래스의 메서드를 호출하는 방법1
		((Radio)rc).printRF();
		
		//구현 클래스의 메서드를 호출하는 방법2
		Radio ro = (Radio)rc;
		ro.printRF();
		
		ro.turnOff();
		
		rc = new SmartTelevision();
		rc.turnOn();
		rc.setVolume(16);
		
		//rc = new Car();
		// RemoteControl 인터페이스로 구현되어있는 클래스가 아니기 때문에 위와 같이 명시는 불가능.

	}

}

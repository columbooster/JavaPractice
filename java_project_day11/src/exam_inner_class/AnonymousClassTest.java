package exam_inner_class;

import exm_interface.RemoteControl;

public class AnonymousClassTest {

	public static void main(String[] args) {
		// RemoteControl ac = new RemoteControl(); // 객체 생성 불가능 
		
		// 이름없는 클래스의 부모 . 이름이 없는 클래스가 상속받은 객체
		RemoteControl ac = new RemoteControl() { // 무명클래스 정의

			@Override
			public void turnOn() {
				System.out.println("TV전원 켜기");

			}

			@Override
			public void turnOff() {
				System.out.println("TV전원 끄기");

			}

			@Override
			public void setVolume(int volume) {

			}

		}; // 이름없는 클래스 선언
		
		ac.turnOn();
		ac.turnOff();

	}

}

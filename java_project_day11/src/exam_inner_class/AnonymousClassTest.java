package exam_inner_class;

import exm_interface.RemoteControl;

public class AnonymousClassTest {

	public static void main(String[] args) {
		// RemoteControl ac = new RemoteControl(); // ��ü ���� �Ұ��� 
		
		// �̸����� Ŭ������ �θ� . �̸��� ���� Ŭ������ ��ӹ��� ��ü
		RemoteControl ac = new RemoteControl() { // ����Ŭ���� ����

			@Override
			public void turnOn() {
				System.out.println("TV���� �ѱ�");

			}

			@Override
			public void turnOff() {
				System.out.println("TV���� ����");

			}

			@Override
			public void setVolume(int volume) {

			}

		}; // �̸����� Ŭ���� ����
		
		ac.turnOn();
		ac.turnOff();

	}

}

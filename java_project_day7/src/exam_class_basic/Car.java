package exam_class_basic;

public class Car {
	//�ʵ� ����
	public int speed; // �ӵ� 
	public int gear; // ��� �ܼ�
	public String color; // ����

	public 	void carData(int s, int g, String c) {
		//�ʵ忡 �� ����
		speed = s;
		gear = g;
		color = c;
	}
	
	
	// �޼����� ����
	public void speedUp(int s) { // �ӵ� ���� �޼ҵ�. s : �Ű�����
		speed += s;
	}
	
	public void speedDown(int s) { // �ӵ� ���� �޼ҵ�
		speed -= s;
	}
	
	public void printData() { // ��ü�� ���¸� ���ڿ��� ����ϴ� �޼ҵ�
		System.out.println("�ӵ�: " + speed + "��� : " + gear + "���� : " + color );
	}
	
	public String toString() { // ��ü�� ���¸� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		return "�ӵ�: " + speed + "��� : " + gear + "���� : " + color;
	}
	
	
}

package exam_class_constructor;

public class CarConstructor {
	private int speed;
	private int gear;
	private String color;
	//������
	public CarConstructor() { // �ϳ��� Ŭ���� ������ �����ڰ� �ٸ� �����ڸ� ȣ���Ϸ��� �Ҷ�
		// speed = 0;
		// gear = 1;
		// color = "red"
		this(0, 1, "red");
	}
	
	//������
	public CarConstructor(int speed, int gear, String color) {
		this.speed = speed;
		this.gear = gear;
		this.color = color;
	}
	// ������ - ���������� ����Ÿ�� get+�ʵ��() {return �ʵ��; }
	public int getSpeed() {
		return speed;
	}
	
	public int getGear() {
		return gear;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return "�ڵ��� ����[ �ӵ� : " + speed + " ��� : " + gear + " ���� : " + color + "]";
	}
	
	
	

}

package exam_mutator_accessor;

public class CarMutatorAccessor {
	//�ʵ�����
	private int speed; //�ӵ�
	private int gear; // ���ܼ�
	private String color; // ����
	
	//������ : private���� ����� �ʵ��� ���� �����ϴ� �޼���
	// public �ڷ��� get�ʵ��() { return �ʵ��; }
	public int getSpeed() {
		return speed;
	}
	
	//������ : private���� ����� �ʵ��� ���� �����ϴ� �޼���
	// public void set�ʵ��(�ڷ��� ������) { �ʵ�� = ������; }
	public void setSpeed(int s) {
		if(s>0)
			speed = s;
		else 
			speed = 0;
	}
	
	public int getGear() {
		return gear;
	}
	
	public void setGear(int g) {
		gear = g;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String c) {
		color = c;
	}
	
	//�޼ҵ� ����
	public void speedUp(int s) { //�ӵ� ���� �޼ҵ�
		speed += s;	
	}
	
	public void speedDown(int s) { // �ӵ� ���� �޼ҵ�
		speed -= s;
	}
	
	public String toString() { // ��ü�� ���¸� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		return "�ڵ��� ���� ���� [ �ӵ� : " + speed + " ��� : " + gear + " ���� : " + color + "]";
	}
	
	
}

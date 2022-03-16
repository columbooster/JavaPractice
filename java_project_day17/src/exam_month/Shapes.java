package exam_month;

// �������̽� ���� �� ������ ����

interface Shape {

	final double PI = 3.14; // ���

	void draw(); // ������ �׸��� �߻� �޼ҵ�

	double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�

	default public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("---�ٽ� �׸��ϴ�.");
		draw();
	}

}

class Circle implements Shape {

	private double radius; // ������

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public void draw() {
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
	}

	@Override
	public double getArea() {
		return Shape.PI * radius * radius;
	}

}



public class Shapes {

	public static void main(String[] args) {

		Shape donut = new Circle(10); // �������� 10�� �� ��ü

		donut.redraw();

		System.out.println("������ " + donut.getArea());
		
		
		Shape circle = new Shape() { // �͸��� Ŭ���� --> �������̽��� Ŭ������ �����ؼ� ������� �ʰ� �ٷ� ����ϰ� ���� ���! ��ȸ��
			
			private double radius = 10; // ������
			
			@Override
			public void draw() {
				System.out.println("�������� " + radius + "�� ���Դϴ�.");
				
			}

			@Override
			public double getArea() {
				return Shape.PI * radius * radius;
			}
			
		};
		
		circle.redraw();
		
		System.out.println("������ " + circle.getArea());
		

	}

}

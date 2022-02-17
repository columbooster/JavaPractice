package exam_polymorphism.exam_overriding;

class Shape { // ����Ŭ����
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {

	@Override
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Line");
	}

}

class Rect extends Shape {

	@Override
	public void draw() {// �޼ҵ� �������̵�
		System.out.println("Rect");
	}

}

class Circle extends Shape {

	@Override
	public void draw() {// �޼ҵ� �������̵�
		System.out.println("Circle");
	}

}

public class MethodOverridingExample {

	public static void paint(Shape p) {//Shape�� ��ӹ��� ��� ��ü���� �Ű����� p�� �Ѿ�� �� ����
		p.draw();	//p�� ����Ű�� ��ü ���� �������̵��� draw() ȣ��. ���� ���ε�
	}
	
	public static void main(String[] args) {
		
		Line line = new Line();
		
		//���� ȣ����� ��� paint() �޼ҵ� ������ Shape�� ���� ���۷��� p�� ��ĳ���õ�
		paint(line); //Line�� draw() ����. "Line"���
		paint(new Shape()); // Shape�� draw() ����. "Shape"���
		paint(new Line()); // Line�� �������̵��� draw() ����. "Line"���
		paint(new Rect()); // Rect�� �������̵��� draw() ����. "Rect"���
		paint(new Circle()); // Circle�� �������̵��� draw() ����. "Circle"���
		

	}

}
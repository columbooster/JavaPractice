package exam_abstract_class;
//�߻�Ŭ����
abstract class Shape {
	int x,y;
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw(); // �߻� �޼��� (�޼����� ����θ� �����ϰ� ���� �κ��� ������ ���� ���� �޼����.
}

class Retangle extends Shape {
	int width, height;
	public void draw() {
		System.out.println("�簢�� �׸��� �޼ҵ�");
	}
}

class Circle extends Shape {
	int radius;
	public void draw() {
		System.out.println("�� �׸��� �޼ҵ�");
	}
}


public class AbstractShapeTest {

	public static void main(String[] args) {
		
		Retangle r = new Retangle();
		r.draw();
		
		Circle c = new Circle();
		c.draw();
		
		//Shape s = new Shape();  // �߻� Ŭ������ �ν��Ͻ� ������ �Ұ����ϴ�.

	}

}

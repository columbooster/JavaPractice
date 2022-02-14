package exam_polymorphism.exam_abstract;

import java.util.Scanner;

abstract class Shape {
	protected int x, y;

	public abstract double getArea(); // ���̸� ���ϴ� �߻�޼��� ����
}

class Circle extends Shape {
	private int radius;

	public Circle() {

	}

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * 3.14;
	}

}

class Rectangle extends Shape {
	private int width, height;

	public Rectangle() {

	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (double) (width * height);
	}

}

public class ShapeMain {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Shape s = null; // �θ�Ŭ������ �������� ����

		while (true) {
			System.out.print("\n***Shape Select***\n1.�� \n2.�簢��\n3.�� ��\n����(1-3) : ");
			int no = scan.nextInt();
			switch (no) {
			case 1:
				s = new Circle(5);
				break;
			case 2:
				s = new Rectangle(4, 5);
				break;
			case 3:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(1);
			}
			if (s instanceof Circle) {
				System.out.printf("���� ���� : %.2f\n", s.getArea());
			} else {
				System.out.printf("�簢���� ���� : %.0f\n", s.getArea());
			}
		}

	}

}

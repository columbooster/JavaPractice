package exam_month;

// 인터페이스 구현 및 다형성 복습

interface Shape {

	final double PI = 3.14; // 상수

	void draw(); // 도형을 그리는 추상 메소드

	double getArea(); // 도형의 면적을 리턴하는 추상 메소드

	default public void redraw() { // 디폴트 메소드
		System.out.print("---다시 그립니다.");
		draw();
	}

}

class Circle implements Shape {

	private double radius; // 반지름

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public void draw() {
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}

	@Override
	public double getArea() {
		return Shape.PI * radius * radius;
	}

}



public class Shapes {

	public static void main(String[] args) {

		Shape donut = new Circle(10); // 반지름이 10인 원 객체

		donut.redraw();

		System.out.println("면적은 " + donut.getArea());
		
		
		Shape circle = new Shape() { // 익명의 클래스 --> 인터페이스를 클래스로 구현해서 사용하지 않고 바로 사용하고 싶은 경우! 일회성
			
			private double radius = 10; // 반지름
			
			@Override
			public void draw() {
				System.out.println("반지름이 " + radius + "인 원입니다.");
				
			}

			@Override
			public double getArea() {
				return Shape.PI * radius * radius;
			}
			
		};
		
		circle.redraw();
		
		System.out.println("면적은 " + circle.getArea());
		

	}

}

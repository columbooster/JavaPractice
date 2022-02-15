package exam_instanceof;

class Parent {
	String field;

	public void method1() {
		System.out.println("Parent-method1()");
	}

	public void method2() {
		System.out.println("Parent-method2()");
	}
}

class Child extends Parent {
	String field2;

	public void method3() {
		System.out.println("Parent-method3()");
	}
}

public class InstanceodExample {
	// 슈퍼 클래스로부터 상속받은 필드와 메소드. 단, 서브클래스에서 오버라이딩하면 그떄부터 오버라이딩된 메서드 호출
	// 메소드명(슈퍼클래스 참조변수) 수퍼 클래스 참조변수 = 서브클래스의 참조값. 업캐스팅.
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			// 서브클래스의 필드와 메서드
			Child child = (Child) parent;// 서브클래스 참조변수 = (서브클래스) 슈퍼클래스타입 참조변수. 다운캐스팅
			child.field2 = "Child로 변환 성공";
			System.out.println("method1 - " + child.field2);
		} else {
			System.out.println("method1 - Child로 변환되지 않음 ");
		}
	}

	public static void method2(Parent parent) {
		Child child = (Child) parent;
		child.field2 = "Child로 변환 성공";
		System.out.println("method2 - " + child.field2);
	}

	public static void main(String[] args) {
		// 슈퍼클래스 참조변수 = new 서브클래스 생성자(). 업캐스팅
		Parent parentA = new Child();
		method1(parentA); // 메서드명(서브클래스의 참조값)
		method2(parentA); // 메서드명(서브클래스의 참조값)
		// 클래스 참조변수 = new 생성자(). 현재 업캐스팅x
		Parent parentB = new Parent();
		method1(parentB); // 메서드명(Parent클래스의 참조값)
		method2(parentB); // 메서드명(Parent클래스의 참조값)

	}

}

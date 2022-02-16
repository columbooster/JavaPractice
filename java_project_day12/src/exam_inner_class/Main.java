package exam_inner_class;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		//인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		// A.B b = new A().new B();
		b.field1 = 3;
		b.method1();
		System.out.println();
		
		// 정적 멤버 클래스 객체 생성
		A.C c = new A. C();
		c.field1 = 3;
		c.method1();
		//c.method2();
		
		A.C.field2 = 3; // 정적 필드. 외부클래스.내부클래스.정적필드
		A.C.method2(); // 정적 메서드. 외부클래스.내부클래스.정적메서드
		System.out.println();
		
		a.method();

	}

}

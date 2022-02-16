package exam_inner_class;

// 외부클래스
public class A {

	private int num;
	static int number;

	A() {
		System.out.println("A객체가 생성됨");
	}

	// 내부클래스 - 인스턴스멤버 클래스
	class B {
		int field1;

		// static int value; 인스턴트 멤버 클래스는 static 멤버를 가질 수 없다.
		B() {
			num = 5;
			number = 3;
			System.out.println("B객체가 생성됨");
		}

		void method1() {
			System.out.println("name : " + num);
			System.out.println("number : " + number);
			System.out.println("field1 : " + field1);

		}
	}

	// 내부클래스 - 정적 멤버 클래스
	static class C {
		int field1;
		static int field2;

		C() {
			// num = 10; 정적 멤버 클래스는 인스턴스 멤버를 가질 수 없다.
			number = 9;
			System.out.println("C객체가 생성됨");
		}

		void method1() {
			System.out.println("field1 : " + field1);
		}

		static void method2() {
			System.out.println("field2 : " + field2);
		}

	}

	void method() {

		// 내부클래스 - 로컬 클래스

		class D {
			int field3;

			D() {
				System.out.println("D객체가 생성됨");
			}

			void moethod1() {
				System.out.println("field3 : " + field3);
			}

		}
		D d = new D();
		d.field3 = 3;
		d.moethod1();

	}

} // A 클래스의 종료

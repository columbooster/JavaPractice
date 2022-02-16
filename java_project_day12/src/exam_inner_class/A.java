package exam_inner_class;

// �ܺ�Ŭ����
public class A {

	private int num;
	static int number;

	A() {
		System.out.println("A��ü�� ������");
	}

	// ����Ŭ���� - �ν��Ͻ���� Ŭ����
	class B {
		int field1;

		// static int value; �ν���Ʈ ��� Ŭ������ static ����� ���� �� ����.
		B() {
			num = 5;
			number = 3;
			System.out.println("B��ü�� ������");
		}

		void method1() {
			System.out.println("name : " + num);
			System.out.println("number : " + number);
			System.out.println("field1 : " + field1);

		}
	}

	// ����Ŭ���� - ���� ��� Ŭ����
	static class C {
		int field1;
		static int field2;

		C() {
			// num = 10; ���� ��� Ŭ������ �ν��Ͻ� ����� ���� �� ����.
			number = 9;
			System.out.println("C��ü�� ������");
		}

		void method1() {
			System.out.println("field1 : " + field1);
		}

		static void method2() {
			System.out.println("field2 : " + field2);
		}

	}

	void method() {

		// ����Ŭ���� - ���� Ŭ����

		class D {
			int field3;

			D() {
				System.out.println("D��ü�� ������");
			}

			void moethod1() {
				System.out.println("field3 : " + field3);
			}

		}
		D d = new D();
		d.field3 = 3;
		d.moethod1();

	}

} // A Ŭ������ ����

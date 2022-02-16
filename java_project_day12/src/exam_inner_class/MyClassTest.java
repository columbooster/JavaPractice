package exam_inner_class;

//�������̽�
interface MyInterface {
	public void print();
}

//���� Ŭ����
class MyClass1 implements MyInterface {
	// �������̽��� ���ǵ� �߻� �޼��带 �������̵� �ؾ��Ѵ�.
	@Override
	public void print() {
		System.out.println("MyClass1");

	}

}

//���� Ŭ����
class MyClass2 implements MyInterface {

	@Override
	public void print() {
		System.out.println("MyClass2");

	}

}

public class MyClassTest {
	// �������̽��� �������� = new ����Ŭ������ ������() // ������
	// (�������̽� ��������)
	public static void test(MyInterface mi) {
		mi.print();
	}

	public static void main(String[] args) {

		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		mc1.print(); // MyClass1�� �޼ҵ带 ���� ȣ��
		mc2.print(); // MyClass2�� �޼ҵ带 ���� ȣ��
		System.out.println();

		// �������̽��� �������� = new �������̽���() // �̸��� ���� Ŭ������ ��ӹ��� ��ü
		// { }; // �̸��� ���� Ŭ���� ����

		MyInterface mi = new MyInterface() {

			@Override
			public void print() {
				System.out.println("�͸� Ŭ���� ����");
			}

		};

		test(mc1); // MyClass�� �������� ���ڷ� ����
		test(mi); // �͸�Ŭ������ �������� ���ڷ� ����. ����� �͸� Ŭ������ ����
		mi.print(); // �͸�Ŭ������ ����.
		System.out.println();

		(new MyInterface() {
			@Override
			public void print() {
				System.out.println("����, ����, ȣ�� �ѹ��� ó��");
			}

		}).print(); // ����, ����, ȣ�� �ѹ��� ����
		System.out.println();

		test(new MyInterface() {
			@Override
			public void print() {
				System.out.println("�޼��� ȣ��� ����, ����");
			}

		});
		System.out.println();

		MyInterface mi2 = test2();
		mi2.print(); // test2 �޼��忡�� ��ȯ�� MyInterface

	}
	
	public static MyInterface test2() {
		MyInterface mi = new MyInterface() {

			@Override
			public void print() {
				System.out.println("test2()�޼��忡�� ��ȯ�� MyInterface");
			}
		};
		return mi;
	}

}

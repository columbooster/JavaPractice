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
	// ���� Ŭ�����κ��� ��ӹ��� �ʵ�� �޼ҵ�. ��, ����Ŭ�������� �������̵��ϸ� �׋����� �������̵��� �޼��� ȣ��
	// �޼ҵ��(����Ŭ���� ��������) ���� Ŭ���� �������� = ����Ŭ������ ������. ��ĳ����.
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			// ����Ŭ������ �ʵ�� �޼���
			Child child = (Child) parent;// ����Ŭ���� �������� = (����Ŭ����) ����Ŭ����Ÿ�� ��������. �ٿ�ĳ����
			child.field2 = "Child�� ��ȯ ����";
			System.out.println("method1 - " + child.field2);
		} else {
			System.out.println("method1 - Child�� ��ȯ���� ���� ");
		}
	}

	public static void method2(Parent parent) {
		Child child = (Child) parent;
		child.field2 = "Child�� ��ȯ ����";
		System.out.println("method2 - " + child.field2);
	}

	public static void main(String[] args) {
		// ����Ŭ���� �������� = new ����Ŭ���� ������(). ��ĳ����
		Parent parentA = new Child();
		method1(parentA); // �޼����(����Ŭ������ ������)
		method2(parentA); // �޼����(����Ŭ������ ������)
		// Ŭ���� �������� = new ������(). ���� ��ĳ����x
		Parent parentB = new Parent();
		method1(parentB); // �޼����(ParentŬ������ ������)
		method2(parentB); // �޼����(ParentŬ������ ������)

	}

}

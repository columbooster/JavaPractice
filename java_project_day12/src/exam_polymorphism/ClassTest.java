package exam_polymorphism;

class A {
	int a = 10;
	
	void b() {
		System.out.println("A");
	}
}

class AA extends A {
	int a = 20;
	
	@Override
	void b() {
		System.out.println("AA");
	}
	
	void c() {
		System.out.println("C");
	}
}

class BB extends A {
	int a = 30;
	
	@Override
	void b() {
		System.out.println("BB");
	}
	
	void d() {
		System.out.println("D");
	}
}




public class ClassTest {

	public static void main(String[] args) {
		// A a1 = new A();
		// AA a2 = new AA();
		
		A z = new AA(); // AA��ü�� �����ؼ� A Ÿ���� ���۷����� �Ҵ��Ѵ�. ��ĳ����
		System.out.println(z.a); // ����Ŭ���� �ʵ� ����
		z.b(); //����Ŭ������ �޼��� ����. ��!!! ����Ŭ����(AA)���� �޼��� ���ٶ��̵��� �߱⋚���� �����ǵ� �޼ҵ尡 �켱���� ������.
		//z.c(); ������ ����
		
		((AA)z).c();	//����Ŭ������ �޼��� ����
		System.out.println(((AA)z).a); // ���� Ŭ������ �ʵ�����
		
		AA a1 = (AA) z; // �ٿ� ĳ����
		System.out.println(a1.a); //����Ŭ������ �޼��� ����
		a1.c(); // ���� Ŭ������ �ʵ�����
		
		z = new BB(); // ��ĳ���� ����Ŭ���� �������� = new ����Ŭ������ ������();
		System.out.println(z.a);
		z.b();
		((BB)z).d();
		System.out.println(((BB)z).a);
		
		BB b1 = (BB)z; // �ٿ�ĳ����
		b1.d();
		System.out.println(b1.a);
		
		

	}

}

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
		
		A z = new AA(); // AA객체를 생성해서 A 타입의 레퍼런스에 할당한다. 업캐스팅
		System.out.println(z.a); // 슈퍼클래스 필드 접근
		z.b(); //슈퍼클래스의 메서드 접근. 단!!! 서브클래스(AA)에서 메서드 오바라이딩을 했기떄문에 재정의된 메소드가 우선권을 가진다.
		//z.c(); 컴파일 오류
		
		((AA)z).c();	//서브클래스의 메서드 접근
		System.out.println(((AA)z).a); // 서브 클래스의 필드접근
		
		AA a1 = (AA) z; // 다운 캐스팅
		System.out.println(a1.a); //서브클래스의 메서드 접근
		a1.c(); // 서브 클래스의 필드접근
		
		z = new BB(); // 업캐스팅 슈퍼클래스 참조변수 = new 서브클래스의 생성자();
		System.out.println(z.a);
		z.b();
		((BB)z).d();
		System.out.println(((BB)z).a);
		
		BB b1 = (BB)z; // 다운캐스팅
		b1.d();
		System.out.println(b1.a);
		
		

	}

}

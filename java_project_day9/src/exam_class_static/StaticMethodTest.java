package exam_class_static;

public class StaticMethodTest {
	
	private static int num1 = 5; // �����ʵ�. Ŭ���� �ʵ� ����
	private int num2 = 3;	//�ν��Ͻ� �ʵ�

	public static void main(String[] args) {
		
		StaticMethodTest.print1(); // Ŭ������ .(��Ʈ ������) �����޼���� => Ŭ������.�����޼���()�� ȣ��
		print1(); // ���� Ŭ���� ���̱� ������ Ŭ������ ��������
		
		//StaticMethodTest.print2();
		//print2();
		
		StaticMethodTest method = new StaticMethodTest();
		method.print2();
		
	}
	
	
	public static void print1() { //���� �޼���. Ŭ���� �޼���
		int num3 = num1;
		//int num4 = this.num2;
		System.out.println(num3);
		System.out.println("print1() ȣ��");
	}
	
	
	public void print2() { //�ν��Ͻ� �޼���
		int num3 = num1;
		int num4 = num2;
		System.out.println(num3 + "," + num4);
		System.out.println("print2() ȣ��");
	}

}

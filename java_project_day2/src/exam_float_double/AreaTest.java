package exam_float_double;

// ���� ������(radius)�� ���Ƿ� �����ϰ� ���� ���̿� ���� �ѷ��� ���ؼ� ����غ���.

public class AreaTest {

	public static void main(String[] args) {
		double radius, area, cir;
		final double PI = 3.14; // final �������� �빮�ڷ�!!! pi (x) -> PI
		radius = 5.0;
		
		area = PI * radius * radius;
		cir = 2 * PI * radius;
		
		System.out.println("���� ������ = " + area);
		System.out.println("���� �ѷ��� = " + cir);
		
		//��� ���(���� ������ ���� �ѷ��� ���� �Ҽ��� 2�ڸ���..)
		System.out.printf("���� ���� : %.2f ���� �ѷ� : %.2f", area, cir);
		

	}

}

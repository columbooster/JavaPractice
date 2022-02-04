package exam_method_overload;
/*
 * �޼ҵ� �����ε�
 * Ŭ���� ������ ���� �̸��� �޼ҵ带 ������ �����ϴ� ��
 * �ϳ��� �޼ҵ� �̸����� �پ��� �Ű����� �ޱ� ���� �޼ҵ� �����ε�
 * �����ε� ���� : �Ű������� Ÿ��, ������ �޶���Ѵ�.
 * 
 */
public class OverloadCalc {
	
	public int plus(int a, int b) {
		System.out.println("plus(int a, int b)");
		return a+b;
	}
	
	public float plus(float a, float b) {
		System.out.println("plus(float a, float b)");
		return a+b;
	}
	public double plus(double a, double b) {
		System.out.println("plus(double a, double b)");
		return a+b;
	}
	
	public int plus(int ... c) { // int[] c = {5,7,4,2}
		System.out.println("plus(int ... c) ���� ���� �޼��� ȣ��");
		int sum = 0;
		for(int i = 0; i <c.length; i++) {
			sum += c[i];
		}
		return sum;
	}
	
	public int plusInt(int[] v) { // int[] v = values1
		System.out.println("plus(int ... c) ���� ���� �޼��� ȣ��");
		int sum = 0;
		for(int i = 0; i <v.length; i++) {
			sum += v[i];
		}
		return sum;
	}
	
	
	
	
	
	
	
	

}

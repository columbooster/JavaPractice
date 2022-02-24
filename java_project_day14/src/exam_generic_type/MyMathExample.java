package exam_generic_type;

//Ÿ�� �Ű����� T�� ������ Ŭ���� MyMath�� �ۼ��غ���.

//MyMath���� ����� ���ϴ� getAverage() �޼ҵ带 �߰��Ͽ�����.
//Integer�� Double�� ���� �پ��� Ÿ���� �����Ϳ� ���Ͽ�
//����� ���� �� �ֵ��� �϶�.

class MyMath<T extends Number> {
	double v = 0.0;

	public double getAverage(T[] a) {
		for (int i = 0; i < a.length; i++)
			v = v + a[i].doubleValue();
		return v / a.length;
	}
}

public class MyMathExample {

	public static void main(String[] args) {

		Integer[] list = { 1, 2, 3, 4, 5, 6 };

		MyMath<Integer> m = new MyMath<Integer>();
		System.out.println(m.getAverage(list));

		Double[] data = { 6.9, 9.2, 5.3 };

		MyMath<Double> m1 = new MyMath<Double>();
		System.out.printf("%.1f",m1.getAverage(data));

//		String[] value = {"1","2","3"};
//		MyMath<String> m2 = new MyMath<String>();
	}

}

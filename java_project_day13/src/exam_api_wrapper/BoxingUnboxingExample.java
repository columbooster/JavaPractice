package exam_api_wrapper;

public class BoxingUnboxingExample {

	public static void main(String[] args) {
		//Boxing
		//Integer obj1 = new Integer(100); ���� ���������� �����ڸ� �������� �ʴ´�.
		Integer obj1 = Integer.valueOf(300);
		
		//Unboxing
		int value1 = obj1.intValue();
		System.out.println(value1);
		
		Double obj4 = Double.valueOf(3.8);
		double value4 = obj4.doubleValue();
		System.out.println(value4);

	}

}

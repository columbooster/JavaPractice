package exam_method_overload;

public class OverloadCalcTest {

	public static void main(String[] args) {
		
		OverloadCalc over = new OverloadCalc();
		
		int i = over.plus(3, 5);
		System.out.println("int�� �� : " + i + "\n");
		
		float j = over.plus(1.5f, 3.2f);
		System.out.println("float�� �� : " + j + "\n");
		
		double k = over.plus(2.4, 4.5);
		System.out.println("int�� �� : " + k + "\n");
		
		int num = over.plus(5,3,8,9,2);
		System.out.println("\n���� ���� �޼ҵ� ȣ�⿡ ���� �� : " + num + "\n");
		
		int[] values1 = {1,2,3};
		int result = over.plusInt(values1); //plusInt(�迭�� ���� �ּҰ��� ���ڰ�)
		System.out.println("\nint �迭�� �Ű������� ���� �޼ҵ� ȣ�⿡���� ��(1) : " + result);
		
		result = over.plusInt(new int[] {1,2,3,4,5,}); //plusInt(�迭�� ���� �ּҰ��� ���ڰ�)
		System.out.println("\nint �迭�� �Ű������� ���� �޼ҵ� ȣ�⿡���� ��(1) : " + result);

	}

}

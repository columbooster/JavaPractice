package exam_try_catch_finally;

public class DivideByZeroTest {

	public static void main(String[] args) {
		int x = 1, y = 0;
		
		try {
		int result = x / y;
		System.out.println("result : " + result);
		} catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			//System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("���α׷��� ��� ����˴ϴ�.");
	}

}

package exam_user_define_exception;

//����� ���� ���� Ŭ����
@SuppressWarnings("serial")
class DivideByZeroException extends Exception {
//class DivideByZeroException extends ArithmeticException { // class ����� ���� ���� Ŭ���� extends ���� Ŭ������ {}
	private String msg;

	public DivideByZeroException() {
		// super("0���� �������� ����");
	}

	public DivideByZeroException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		if (msg == null) {
			return "0���� �������� ����.";
		} else {
			return msg;
		}
	}

}

public class DivideProgrammaing {

	public static void main(String[] args) {
		double result;
		try {
			result = quotient(1, 0);
			System.out.println(result);
		} catch (DivideByZeroException e) {
			System.out.println(e.getMessage());
			// System.out.println(e.toString());
		}

	}

	public static double quotient(int n, int d) throws DivideByZeroException {
		if (d == 0) // ���� ��Ȳ	
			throw new DivideByZeroException("0���� ���� �� �����ϴ�."); //���� ��ü ����
		return (double) n / d;
	}

}

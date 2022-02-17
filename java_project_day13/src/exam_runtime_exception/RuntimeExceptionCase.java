package exam_runtime_exception;

public class RuntimeExceptionCase {

	public static void main(String[] args) {
		// RuntimeException ���� - ��üũ ���� (���� ó���� �ݵ���ؾ��ϴ°� �ƴϴ�. if������ �����ϸ� �Ǳ⋚���̴�.

		// ArrayIndexOutOfBoundsException ���� �߻�
		try {
			int[] arr = new int[3];
			arr[4] = 20;

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		// ClassCastException ���� �߻�
		try {
			Object x = Integer.valueOf(0);
			// �θ� Ŭ������ �������� = new ����Ŭ����������();
			System.out.println((String) x);
		} catch (ClassCastException e) {
			e.printStackTrace();
		}

		// NegativeArraySizeException �߻�
		try {
			int[] arr = new int[-10];
			System.out.println(arr.toString());
		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
		}

		// NullPointerException ���� �߻�
		try {
			String str = null;
			@SuppressWarnings("null")
			int len = str.length();
			System.out.println(len);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		// NumberFormatException ���� �߻�
		try {
			String data1 = "100";
			String data2 = "a100";

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (NumberFormatException e) {
			e.printStackTrace();

		}

	}

}

package exam_api_object;

public class StringTest {

	public static void main(String[] args) {
		// ���ڿ� �ν��Ͻ� ������� - ���ڿ� ���ͷ��� �̿��� �ν��Ͻ� ����
		String str1 = "Java";
		String str2 = "Java";

		if (str1 == str2) {
			System.out.println("���� ��ü");
		} else {
			System.out.println("���� �ٸ� ��ü");
		}

		// ���ڿ� �ν��Ͻ� ������� - String Ŭ������ �����ڸ� �̿��Ͽ� ���ڿ� �ν��Ͻ� ����

		// �⺻������ == �����ڿ� ������ ��� ���� (�ּҰ� ��)
		String strData1 = new String("Java");
		String strData2 = new String("Java");
		// ������ ������ �ּڰ��� �����ϴ� �����̹Ƿ� �Ʒ� ���ǽ��� �ּڰ� ��
		if (strData1 == strData2) {
			System.out.println("���ϰ�ü");
		} else {
			System.out.println("���� �ٸ� ��ü");
		}

		// ���� �����̶�? ���� ��ü�̰� �ٸ� ��ü�̰� ������� ��ü ���� ������ ����
		// StringŬ������ ���ڿ��� ���ϰ��� equals()�޼ҵ带 �������̵�(������)��
		if (strData1.equals(strData2)) {
			System.out.println("���ϰ�ü");
		} else {
			System.out.println("���� �ٸ� ��ü");
		}
	}

}

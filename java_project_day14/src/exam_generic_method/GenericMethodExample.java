package exam_generic_method;

//���ʸ� �޼��� ����

class GenericMethod {
	// ���ʸ� �޼��� ����
	// ��������(������) Ű���� <Ÿ�ԸŰ�����> ��ȯ�� �޼����(�ڷ��� ����){}
	// ��������(������) Ű���� <Ÿ�ԸŰ�����> Ÿ�ԸŰ����� �޼����(Ÿ�ԸŰ����� ����){}
	public static <T> T getLast(T[] arr) {
		return arr[arr.length - 1];
	}
}

public class GenericMethodExample {

	public static void main(String[] args) {
		String[] language = { "C++", "C#", "JAVA" };
		String last = GenericMethod.getLast(language);
		System.out.println("language �迭�� ������ ���� : " + last);

		last = GenericMethod.getLast(language);
		System.out.println("language �迭�� ������ ���� : " + last);

		Integer[] number = { 70, 67, 88, 90 };
		// int lastNum = GenericMethod.<Integer>getLast(number)
		int lastNum = GenericMethod.getLast(number);
		System.out.println("number �迭�� ������ ���� : " + lastNum);

	}

}

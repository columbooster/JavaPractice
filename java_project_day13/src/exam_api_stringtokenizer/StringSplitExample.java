package exam_api_stringtokenizer;

import java.util.StringTokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "�ڹ�&����Ŭ,,������,HTML-JAVASCRIPT_JQUERY";
		// String[] names = text.split(",");
		String[] names = text.split("&|,|-");
		// �����ڰ� �������� ����� ���ڿ��� �����Ͽ� ���ڿ� ��ȯ

		System.out.println("�迭�� �� : " + names.length);

		for (String name : names) {
			System.out.println(name);
		}
		System.out.println();

		// ���1 : ���� �ִ� ��ū�� Ȯ���ϰ� while������ �ݺ�
		// StringTokenizer(��� ���ڿ�, ������) ������
		StringTokenizer st = new StringTokenizer(text, "&,-");
		int countTokens = st.countTokens(); // ��ū�� ������ ��ȯ
		System.out.println("��ü ��ū �� : " + countTokens);

		while (st.hasMoreTokens()) {// ��ū�� ���̻� �����ϴ��� ���θ� true/false ��ȯ
			String token = st.nextToken(); // ���� ��ū�� ����
			System.out.println(token);
		}
	}

}

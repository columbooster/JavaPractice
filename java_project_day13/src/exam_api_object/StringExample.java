package exam_api_object;

public class StringExample {

	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++");

		System.out.println(a + "�� ���̴� " + a.length()); //���ڿ��� ����(���ڰ���)
		System.out.println(a.contains("#")); //���ڿ� ���� ����

		a = a.concat(b); //���ڿ� ����
		System.out.println(a);

		a = a.trim(); // ���ڿ� �յ� ���� ����
		System.out.println(a);

		a = a.replace("C#", "Java"); //���ڿ� ��ü
		System.out.println(a);

		String s[] = a.split(","); //���ڿ� �и�
		for (int i = 0; i < s.length; i++) {
			System.out.println("�и��� ���ڿ� : " + i + " : " + s[i]);
		}

		a = a.substring(5); //�ε���5���� ������ ���� ��Ʈ�� ����
		//a = a.substring(0,4);
		System.out.println(a);

		char c = a.charAt(2); //�ε��� 2�� ���� ����
		System.out.println(c);

		String subject = "JAVA ���α׷���";
		System.out.println(subject.indexOf("JAVA"));
		//�ڹ� ���õ� å���� �ƴ����� �Ǻ��� �� �ֵ��� ���ǽ��� �ۼ��� �ּ���.
		if (subject.indexOf("JAVA") != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���");
		} else {
			System.out.println("�ڹٿ� ���þ��� å�̱���");
		}
		
		String country = "�ѱ�,�Ϻ�,�߱�,�̱�,����,������";
		//������ �����ڷ� �ڸ� �� ���ڿ� �迭�� ��ȯ
		String[] list = country.split(",");
		//�и��ϴ� ������, �и��ϴ� ���ڿ��� ����(��ü ���ڿ� ������ 2���� ����)
		String[] list2 = country.split(",", 2);
		
		for(String item : list) {
			System.out.println(item);
		}
		System.out.println("=================");
		for(String item : list2) {
			System.out.println(item);
		}
		System.out.println("=================");
		
		
		String email = "purum@rubypaper.co.kr";
		// split() �޼��带 ������� �ʰ� ��µǵ��� �ڵ带 �ۼ��Ͻÿ�.
		int i = email.indexOf("@");
		String id = email.substring(0,i);
		String company = email.substring(i + 1);
		System.out.println(id);
		System.out.println(company);
		// ���� -> ���ڿ� . ���ڿ� -> ����. 10 -> "10". "10" -> 10
		int number = 10;
		String value = String.valueOf(number);
		System.out.println(value);
		
		
	}

}

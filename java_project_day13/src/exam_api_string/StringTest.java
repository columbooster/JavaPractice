package exam_api_string;

public class StringTest {

	public static void main(String[] args) {
		String ssn = "660606-1234561";
		//������ ���ϴ� �޼��� ���� �� 	ȣ��
		System.out.printf("����� ���� : %s\n",getGender(ssn));
		
		/*������ fileName�� ����� ���ϸ�(��: test.txt)���� Ȯ���� üũ�Ͽ� �̹��� ����(gif/jpg/png/jpeg)
		 * �� ������ Ȯ���ڸ� ���� ������ ��� "�̹��� ���ϸ� ��� �����մϴ�"��� �޽����� ����ϵ��� �ۼ��غ�����.
		 * ���� Ȯ���ڸ� üũ�ϴ� �޼���ȣ�� fileExtCheck()
		 */
		
		String fileName = "text.txt";
		System.out.println("���ϸ� : " + fileName);
		//�޼��� ȣ��� ����
		
		fileExtCheck(fileName);
		
	}
	
	public static String getGender(String ssn) {
		String g = ssn.substring(7,8);
		String gender = null;
		
		if(g.equals("1") || g.equals("3")) {
			gender = "����";
		}else if(g.equals("2")||g.equals("4")) {
			gender = "����";
		}
		return gender;
	}
	
	public static boolean fileExtCheck(String fileName) {
		if(fileName.indexOf("gif")  != -1) {
			return true;
		}else if (fileName.indexOf("jpg")  != -1) {
			return true;
		}else if (fileName.indexOf("png")  != -1) {
			return true;
		}else if (fileName.indexOf("jpeg")  != -1) {
			return true;
		} else {
			System.out.println("�̹��� ���ϸ� ��� �����մϴ�.");
		}
		
		return true;
	}

}

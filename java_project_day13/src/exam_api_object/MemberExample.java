package exam_api_object;

/*���̵�� ���̸� �ʵ�� ���� MemberŬ������ �����Ѵ�.
 * ������ ��ü�� �����Ͽ� ���̰� ������ �� ��ü�� "�����մϴ�."
 * �Ǵ� ���̰� �ٸ��� �� ��ü�� "�������� �ʽ��ϴ�"��� ����Ҽ��ֵ���
 * ����Ŭ������ �ۼ����ּ���.
 * 
 */

public class MemberExample {

	public static void main(String[] args) {

		Member m1 = new Member("blue1234", 25);
		Member m2 = new Member("blue1234", 27);
		Member m3 = new Member("red1234", 25);

		// ��ü�� ������ ��
		System.out.println("m1==m2 = " + (m1 == m2));

		//m3 = m1;
		System.out.println("m1==m3 = " + (m1 == m3));

		// equals() �޼��� ������ �� �ٽ� Ȯ��.
		if (m1.equals(m2)) {
			System.out.println("m1��m2�� �����մϴ�.");
		} else {
			System.out.println("m1��m2�� ���������ʽ��ϴ�.");
		}

		if (m1.equals(m3)) {
			System.out.println("m1��m3�� �����մϴ�.");
		} else {
			System.out.println("m1��m3�� ���������ʽ��ϴ�.");
		}

	}

}

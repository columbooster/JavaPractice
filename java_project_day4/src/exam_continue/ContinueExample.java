package exam_continue;
/* ���ڿ� "Do you konw? no news is good news!"�� �������
 * �ݺ��ϸ� ���� 'n'�� ��Ÿ���� Ƚ���� ī�����Ѵ�.
 * ���� ������ ���ڰ� 'n'�� �ƴϸ� continue���� ���Ͽ� ������ ������ �κ��� �����ϰ� ���� ���ڸ� ó���Ѵ�.
 * ���� ������ ���̴� ���ڿ�������.length()�� ���� �� �ִ�.
 * 	���ڿ�������.charAt(0)�� ����ϸ� ���ڿ������� ����� ���ڿ��� ù��° ���� �ϳ�(0)�� ��ȯ�Ѵ�.
 */
public class ContinueExample {

	public static void main(String[] args) {
		
		int count =0;
		
		String string = "Do you know? no news is good news";
		
		for(int i = 0; i < string.length(); i++) {
			if(string.charAt(i) != 'n') 
				continue;
			if(string.charAt(i) == 'n') {
				count++;
			} 
		}
		
		System.out.println("n�� ���� = " + count);

	}

}

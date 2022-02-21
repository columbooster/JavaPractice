package exam_api_stringbuffer;

public class StringBufferExample {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("This");

		sb.append(" is pencil"); // ���ڿ� �����̱�
		System.out.println(sb);

		sb.insert(7, " my"); // ���ڿ� ����
		System.out.println(sb);

		sb.replace(8, 10, "your"); // "my"�� "your"�� ����
		System.out.println(sb);

		sb.delete(8, 13); // "your"����
		System.out.println(sb);

		sb.setLength(4); // ��Ʈ������ �� ���ڿ� ���� ���� setxx() : ������ getxx() : ������ toxx() : ��ȯ  isxx() : ���� �Ǵ�(boolean) 
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		sb.delete(0, sb.length());	
		System.out.println(sb.toString().isEmpty());
		
		
		
		StringBuilder sd = new StringBuilder("This");

		sd.append(" is pencil"); // ���ڿ� �����̱�
		System.out.println(sd);

		sd.insert(7, " my"); // ���ڿ� ����
		System.out.println(sd);

		sd.replace(8, 10, "your"); // "my"�� "your"�� ����
		System.out.println(sd);

		sd.delete(8, 13); // "your"����
		System.out.println(sd);

		sd.setLength(4); // ��Ʈ������ �� ���ڿ� ���� ���� setxx() : ������ getxx() : ������ toxx() : ��ȯ  isxx() : ���� �Ǵ�(boolean) 
		System.out.println(sd);

		sd.reverse();
		System.out.println(sd);

		sd.delete(0, sd.length());	
		System.out.println(sd.toString().isEmpty());
		
		

	}

}

package exam_main_argument;

// ������
// RUn > Run Configurations ���� �ι�° ��(Arguments)�� �����Ͽ� 
// program arguments�� ���� �Է��ϰ� Run ��ư�� Ŭ���ϸ� �ȴ�.


public class Greeting {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("����� ����ڸ��� �Է��� �ּž� �ش� ���ڿ��� ����� �� �ֽ��ϴ�.");
			System.exit(1);
		}
		System.out.println("�ȳ��ϼ���." + args[0] + "��!");
			

	}

}

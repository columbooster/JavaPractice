package exam_main_argument;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length !=2){
			System.out.println("���� ���α׷��� �����ϱ� ���ؼ��� �ݵ�� ���� �� ");
			System.out.println("�� ���� ���ڸ� �Է��� �־�� �մϴ�.");
			System.exit(1); // ���α׷��� ����. exit(����)
		}
		// "2" + "5" = 25
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		// ���� -> ���� 
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		System.out.println(strNum1 + strNum2);
		System.out.println(num1 + num2);
		

	}

}

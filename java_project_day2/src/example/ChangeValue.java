package example;

public class ChangeValue {
	public static void main(String[] args) {
	  /*�ڷ���  ������ = �� >> ���� ��Ʈ�� ���� number1�� ���� ��Ű�ڴ�. "=" -> ���Կ�����
		int number1 = 10;*/
		//�ڷ��� ������ ; <= ���� ����
		int number1, number2, temp;
		
		number1 = 10;
		number2 = 15;
		
		
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		System.out.println("number1 = " + number1 + " number2 = " + number2);
		System.out.println("number1+number2 = " + (number1+number2));
		
		temp = number1; // temp = number1 �� �� ����. 10
		number1 = number2; // number1 = number2�� �� ����. 15
		number2 = temp; // number2 = temp�� �� ����. 10
		
		System.out.println("��ȯ �� �޶��� number1,2�� ��");
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		System.out.println("number1 = " + number1 + " number2 = " + number2);
		System.out.println("number1+number2 = " + (number1+number2));
		
		
		boolean b;
		
		b= true;
		b=(1>2);
		System.out.println(b);
	}

}

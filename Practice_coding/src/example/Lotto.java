package example;

public class Lotto {

	public static void main(String[] args) {
		
		System.out.println(Math.random());
		// Math.ranodm() = 0.9 -> 0.9 * 6 -> 5.4 -> (0~5) + 1 -> 1 ~ 6
		int num1 = (int) (Math.random() * 45) + 1;
		int num2 = (int) (Math.random() * 45) + 1;
		int num3 = (int) (Math.random() * 45) + 1;
		int num4 = (int) (Math.random() * 45) + 1;
		int num5 = (int) (Math.random() * 45) + 1;
		int num6 = (int) (Math.random() * 45) + 1;
		System.out.println("�ζ� 1�� : " + num1);
		System.out.println("�ζ� 2�� : " + num2);
		System.out.println("�ζ� 3�� : " + num3);
		System.out.println("�ζ� 4�� : " + num4);
		System.out.println("�ζ� 5�� : " + num5);
		System.out.println("�ζ� 6�� : " + num6);
		

	}

}

package exam_array;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		int[] numbers = new int[3];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		
		System.out.println("numbers[0] = " + numbers[0]);
		System.out.println("numbers[1] = " + numbers[1]);
		System.out.println("numbers[2] = " + numbers[2]);
		
		double[] arraydouble = new double[2];
		for(int i = 0; i <2; i++) {
			System.out.println("arraydouble[i] = " + arraydouble[i]);
		}
		System.out.println();
		
		String[] arrayString = new String[3];
		arrayString[0] = "java";
		arrayString[1] = "oracle";
		arrayString[2] = "spring";
		for(int i =0; i < 3; i++) {
			System.out.println("arrayString[" + i + " = " + arrayString[i]);
		}
		System.out.println();
		
		
		int[] nums = new int[5];
		Scanner input = new Scanner(System.in);
		
		System.out.println("=== �迭�� �� �Է� ===");
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1)+"�� ° ���� �Է� : ");
			nums[i] = input.nextInt();
		}
		
		System.out.println("=== �迭�� �� ��� ===");
		for(int j = 0; j < 5; j++) {
			System.out.print("nums[" + j + "] = " + nums[j] );
		}
		
		
		input.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}

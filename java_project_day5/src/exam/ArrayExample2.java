package exam;

import java.util.Scanner;
//10 �̸��� ���� �ΰ��� �Է� �޾Ƽ� ù��° ���ҿ� �ι��� ���Ҹ� �Է¹��� ���� �ʱ�ȭ �Ѵ�.
// ����° ���Һ��� ������ ���� ������ �����װ� ������ ���� ���� 1�� �ڸ��̴�.
// ��
// ���� �ΰ��� �Է��� �ּ��� : 3 4
// [3 , 4 , 2 , 8 , 6 , 8 , 8 , 4 , 2 , 8]
public class ArrayExample2 {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		
		do {
			System.out.print("���� �ΰ��� �Է��� �ּ���:");
			array[num] = input.nextInt();
			if(array[num] < 1 || array[num] > 9 ) {
				continue;
			}
			num++;
		} while (num < 2);	
		
		
		for(int i = 2; i <10; i++) {
			array[i] = ((array[i-2]*array[i-1])%10);
		}
		
		
		System.out.print("[");
		for (int i =0 ; i < array.length; i++) {
			System.out.print(array[i]);
			if(i < array.length -1) {
				System.out.print(" , ");
			}
		}
		
		System.out.print("]");
		
		input.close();
		

	}

}

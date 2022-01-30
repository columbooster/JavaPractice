package exam;

import java.util.Scanner;
//10 미만인 정수 두개를 입력 받아서 첫번째 원소와 두번쨰 원소를 입력받은 수로 초기화 한다.
// 세번째 원소부터 마지막 원소 까지는 전전항과 전항을 곱한 값의 1의 자리이다.
// 예
// 숫자 두개를 입력해 주세요 : 3 4
// [3 , 4 , 2 , 8 , 6 , 8 , 8 , 4 , 2 , 8]
public class ArrayExample2 {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		
		do {
			System.out.print("숫자 두개를 입력해 주세요:");
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

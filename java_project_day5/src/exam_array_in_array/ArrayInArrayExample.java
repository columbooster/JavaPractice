package exam_array_in_array;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		//2���� �迭
		//�ڷ��� [][] �迭�� = new �ڷ��� [���ǿ��][���ǿ��];
		int[][] arr1 = new int[2][3];
		
		System.out.println("arr1.length = " + arr1.length); //�迭�� ���� ��
		System.out.println("arr1[0].length = " + arr1[0].length); // 0��° ���� ���� ��
		System.out.println("arr1[1].length = " + arr1[1].length); // 1��° ���� ���� ��
		
		System.out.println();
		
		for(int i = 0; i<arr1.length; i++) {
			for(int k = 0; k<arr1[i].length; k++) {
				System.out.print("arr1["+i+"]["+k+"]="+ arr1[i][k]+" ");
			}
			System.out.println();
		}
		
		int arr2[][] = new int[][] {{10,20,30},{40,50,60}};
		//int arr2[][] = {{10,20,30},{40,50,60}};
		/*     0�� 1�� 2��
		 * 0�� 10  20  30
		 * 1�� 40  50  60
		 */
		
		for(int i = 0; i < arr2.length; i++) {
			for(int k = 0; k < arr2[i].length; k++) {
				System.out.printf("%-5d", arr2[i][k]);
			}
			System.out.println();
		}
		System.out.println();
		
		//2���� �迭(�����迭)
		int[][] arr3 = new int[2][];
		arr3[0] = new int[] {1, 5};
		arr3[1] = new int[3];
		for(int i = 0; i<arr3.length; i++) {
			for(int k = 0; k <arr3[i].length; k++) {
				System.out.print("arr3["+ i + "][" + k +"]="+arr3[i][k]+" ");
			}
			System.out.println();	
		}
		System.out.println();
		
		//5x5 2���� �迭�� 1 ~ 25�� �ʱ�ȭ �Ͽ� ȭ�鿡 ���
		
		/* �迭 �ʱ�ȭ
		for(int i =0; num=1; i<arr4.length; i++) {
			for(int j = 0; j <arr4[j].length; j++) {
				arr4[i][j] = num++;
			}
		}
		*/
		
		//�밢�� �ձ��ϱ�.
		
		
		int[][] arr4 = new int[][] {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		for(int i = 0; i <arr4.length; i++) {
			for(int k = 0; k<arr4[i].length; k++) {
				System.out.printf("%-5d", arr4[i][k]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i = 0; i <arr4.length; i++) {
			for(int k = 0; k<arr4[i].length; k++) {
				if(i == k) {
				System.out.printf("%-5d", arr4[i][k]); // ��ȯ���ڿ� ���ڴ� ��ü �ڸ����� �ǹ�. - ������ ��ġ ����
				}
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		int sum = 0;
		
		for(int i = 0; i <arr4.length; i++) {
			for(int k = 0; k<arr4[i].length; k++) {
				if(i == k) {
				sum += arr4[i][k]; 
				}
			}
		}
		
		System.out.println("�հ� = " + sum);
		System.out.println();
		
		int total = 0;
		
		
		for(int i =0; i<arr4.length; i++) {
			for(int k = 0 ; k <= i; k++) {
					total += arr4[i][k];
			}
		}
		System.out.println("�밢�� �Ʒ� ���� �հ� = " + total);
		System.out.println();
		
		
		
		/*
		
		for(int i =0; i<arr4.length; i++) {
			for(int k = 0 ; k <arr4[i].length; k++) {
				if(k <= i) {
					total += arr4[i][k];
				}
			}
		}
		System.out.println("�밢�� �Ʒ� ���� �հ� = " + total);
		
		*/
		
	


	}

}

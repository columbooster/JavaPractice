package exam_array_in_array;

public class ArrayInArraySum {

	public static void main(String[] args) {
		
		int[][] array = new int[][] {
			{10, 10, 10, 10, 0},
			{30, 30, 30, 30, 0},
			{40, 40, 40, 40, 0},
			{50, 50, 50, 50, 0},
			{0,  0,  0,  0,  0}
		};
		
		// 4행 각 열들의 합
		
		System.out.println("=======실행전==========");
		for(int i = 0; i < array.length; i++) {
			for(int k =0; k < array[i].length; k++) {
				System.out.printf("%-5d", array[i][k]);
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < array.length-1; i++) {
			for(int k =0; k < array[i].length-1; k++) {
				array[i][4] += array[i][k];
				array[4][k] += array[i][k];
				if(i==k)
					array[4][4] += array[i][k];
			}
		}
	
		System.out.println("=======실행후==========");
		for(int i = 0; i < array.length; i++) {
			for(int k =0; k < array[i].length; k++) {
				System.out.printf("%-5d", array[i][k]);
			}
			System.out.println();
		}
		
		

	}

}

package exam_array_in_array;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		//2차원 배열
		//자료형 [][] 배열병 = new 자료형 [행의요소][열의요소];
		int[][] arr1 = new int[2][3];
		
		System.out.println("arr1.length = " + arr1.length); //배열의 행의 수
		System.out.println("arr1[0].length = " + arr1[0].length); // 0번째 행의 열의 수
		System.out.println("arr1[1].length = " + arr1[1].length); // 1번째 행의 열의 수
		
		System.out.println();
		
		for(int i = 0; i<arr1.length; i++) {
			for(int k = 0; k<arr1[i].length; k++) {
				System.out.print("arr1["+i+"]["+k+"]="+ arr1[i][k]+" ");
			}
			System.out.println();
		}
		
		int arr2[][] = new int[][] {{10,20,30},{40,50,60}};
		//int arr2[][] = {{10,20,30},{40,50,60}};
		/*     0열 1열 2열
		 * 0행 10  20  30
		 * 1행 40  50  60
		 */
		
		for(int i = 0; i < arr2.length; i++) {
			for(int k = 0; k < arr2[i].length; k++) {
				System.out.printf("%-5d", arr2[i][k]);
			}
			System.out.println();
		}
		System.out.println();
		
		//2차원 배열(가변배열)
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
		
		//5x5 2차원 배열에 1 ~ 25로 초기화 하여 화면에 출력
		
		/* 배열 초기화
		for(int i =0; num=1; i<arr4.length; i++) {
			for(int j = 0; j <arr4[j].length; j++) {
				arr4[i][j] = num++;
			}
		}
		*/
		
		//대각선 합구하기.
		
		
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
				System.out.printf("%-5d", arr4[i][k]); // 변환문자에 숫자는 전체 자릿수를 의미. - 공백의 위치 포현
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
		
		System.out.println("합계 = " + sum);
		System.out.println();
		
		int total = 0;
		
		
		for(int i =0; i<arr4.length; i++) {
			for(int k = 0 ; k <= i; k++) {
					total += arr4[i][k];
			}
		}
		System.out.println("대각선 아래 영역 합계 = " + total);
		System.out.println();
		
		
		
		/*
		
		for(int i =0; i<arr4.length; i++) {
			for(int k = 0 ; k <arr4[i].length; k++) {
				if(k <= i) {
					total += arr4[i][k];
				}
			}
		}
		System.out.println("대각선 아래 영역 합계 = " + total);
		
		*/
		
	


	}

}

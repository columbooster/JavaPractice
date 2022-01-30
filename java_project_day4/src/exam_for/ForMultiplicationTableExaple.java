package exam_for;

//구구단 출력하기

public class ForMultiplicationTableExaple {

	public static void main(String[] args) {
	
		for(int m = 2; m <= 9; m++) {
			for(int n = 1; n<=9; n++) {
				System.out.printf("%d * %d = %d\n", m, n, (m*n));
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int m = 1; m <=9; m++) {
			for(int n =2; n <=9; n++) {
				System.out.printf("%d x %d = %2d ", n, m, (m *n));
			}
			System.out.println();
		}
		

	}

}

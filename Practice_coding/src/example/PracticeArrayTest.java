package example;

public class PracticeArrayTest {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		int[] b = new int[10];
		
		for(int i = 0; i<a.length; i++) {
			b[i] = a[9-i];
			System.out.print(b[i]);
		}
		
		
	}

}

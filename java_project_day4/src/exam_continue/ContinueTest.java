package exam_continue;

public class ContinueTest {

	public static void main(String[] args) {
		//È¦¼ö Ãâ·Â
		
		int a = 0;
		do {
			a++;
			if(a % 2 ==0)
				continue;
			System.out.printf("%5d", a);
		} while(a<10);
		
		//Â¦¼ö Ãâ·Â
		
		for(int i = 0; i <= 10; i++) {
			if(i %2 != 0 ) {
				continue;
			}
			System.out.printf("%5d", i);
		}
		
		

	}

}

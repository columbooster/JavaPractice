package exam_continue;

public class ContinueTest {

	public static void main(String[] args) {
		//Ȧ�� ���
		
		int a = 0;
		do {
			a++;
			if(a % 2 ==0)
				continue;
			System.out.printf("%5d", a);
		} while(a<10);
		
		//¦�� ���
		
		for(int i = 0; i <= 10; i++) {
			if(i %2 != 0 ) {
				continue;
			}
			System.out.printf("%5d", i);
		}
		
		

	}

}

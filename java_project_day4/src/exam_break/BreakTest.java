package exam_break;

public class BreakTest {

	public static void main(String[] args) {
		int i;
		i = 5;
		
		System.out.println("countdown start!");
		
		while(true) {
			if(i ==0) {
				break;
			}
			System.out.println(i);
			i--;
		}
		
		System.out.println("countup start!");
		
		while(true) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
			i++;
		}

	}

}

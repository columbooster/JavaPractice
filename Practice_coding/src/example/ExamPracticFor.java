package example;

public class ExamPracticFor {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			for (int j = i; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 10; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

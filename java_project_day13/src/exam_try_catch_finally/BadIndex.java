package exam_try_catch_finally;

public class BadIndex {

	public static void main(String[] args) {
		int[] array = new int[10];

		try {
			for (int i = 0; i < 10; i++) {
				array[i] = i + 1;
			}
			int result = array[10];
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 잘못되었습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("과연 이 문장이 실행 될까요?");

	}

}

package exam_generic_method;

public class GenericMethodTest {

	public static <T extends Number, V extends T> boolean isInclude(T num, V[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Integer[] inum = { 1, 2, 3, 4, 5 };
		System.out.println("결과 : " + GenericMethodTest.<Integer, Integer>isInclude(3, inum));

		boolean b1 = isInclude(3, inum);
		System.out.println("결과 : " + b1);

		Double[] dnum = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		boolean b2 = isInclude(5.0, dnum);
		System.out.println("결과 : " + b2);

		System.out.println("결과 : " + GenericMethodTest.<Double, Double>isInclude(5.0, dnum));

//		String[] snum = {"one", "two", "three", "four", "five"};
//		isInclude("one", snum);
//		System.out.println("결과 : " + GenericMethodTest.<String, String>isInclude("one", snum));

	}

}

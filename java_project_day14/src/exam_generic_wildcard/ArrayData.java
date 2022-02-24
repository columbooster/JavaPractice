package exam_generic_wildcard;

public class ArrayData {

	public static <T extends Comparable<T>> T getMin(T[] a) {
		if (a == null || a.length == 0)
			return null;
		T largest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (largest.compareTo(a[i]) > 0)
				largest = a[i];
		}
		return largest;
	}

	public static void main(String[] args) {
		Integer[] i = { 10, 35, 98, 80 };
		int value = getMin(i);
		System.out.println(value);

		String[] s = { "JAVA", "C++", "SPRING", "ORACLE" };
		String data = getMin(s);
		System.out.println(data);

	}

}

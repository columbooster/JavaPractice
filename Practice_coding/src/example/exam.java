package example;

public class exam {

	public static void main(String[] args) {

		String str = "C, Java, Oracle, MySQL";
		String[] array = str.split(", ");
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("Java")) {
				System.out.println(array[i].toString());
			}
		}

	}

}

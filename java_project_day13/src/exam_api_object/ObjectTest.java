package exam_api_object;

public class ObjectTest {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean result1 = (obj1 == obj2);
		System.out.println("obj1 == obj2 = " + result1);
		
		boolean result2 = obj1.equals(obj2);
		System.out.println("obj1.equals(obj2) = " + result2);

	}

}

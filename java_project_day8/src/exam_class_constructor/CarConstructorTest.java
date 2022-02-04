package exam_class_constructor;

public class CarConstructorTest {

	public static void main(String[] args) {
		CarConstructor car1 = new CarConstructor(60, 1, "blue");
		System.out.println(car1.toString());
		
		CarConstructor car2 = new CarConstructor();
		System.out.println(car2.toString());
	}

}

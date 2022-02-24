package exam_multi_type_parameter;

public class ProductExample {

	public static void main(String[] args) {
		
		Product<Car, String> product1 = new Product<Car, String>();
		product1.setKind(new Car());
		product1.getKind().setColor("Red");
		product1.setModel("�贺");
		System.out.println(product1.toString()+ "[color: "+ product1.getKind().getColor()+ "]");
		
		Product<Tv, String> product2 = new Product<Tv, String>();
		product2.setKind(new Tv(48));
		product2.setModel("����ƮTV");
		
		//Product<Tv, String> product2 = new Product<Tv, String>(new Tv(48), "����Ʈ TV");
		
		
		System.out.print(product2.toString()+" ");
		System.out.println(product2.getKind().toString());
		
//		Product<SmartPhone, String> product3 = new Product<SmartPhone, String>();
//		product3.setKind(new SmartPhone("�Ｚ","�ȵ���̵�"));
//		product3.setModel("������ Z�ø�3);
		
		
		Product<SmartPhone, String> product3 = new Product<SmartPhone, String>(new SmartPhone("�Ｚ","�ȵ���̵�"), "������ Z�ø�3");
		
		System.out.print(product3.toString());
		System.out.println(product3.getKind().toString());
		
		// product3.getKind() -> SmartPhone�� �ּڰ�. toString() -> SamrtPhone�� ���� toString()

	}

}

package exam_multi_type_parameter;

public class ProductExample {

	public static void main(String[] args) {
		
		Product<Car, String> product1 = new Product<Car, String>();
		product1.setKind(new Car());
		product1.getKind().setColor("Red");
		product1.setModel("배뉴");
		System.out.println(product1.toString()+ "[color: "+ product1.getKind().getColor()+ "]");
		
		Product<Tv, String> product2 = new Product<Tv, String>();
		product2.setKind(new Tv(48));
		product2.setModel("스마트TV");
		
		//Product<Tv, String> product2 = new Product<Tv, String>(new Tv(48), "스마트 TV");
		
		
		System.out.print(product2.toString()+" ");
		System.out.println(product2.getKind().toString());
		
//		Product<SmartPhone, String> product3 = new Product<SmartPhone, String>();
//		product3.setKind(new SmartPhone("삼성","안드로이드"));
//		product3.setModel("갤럭시 Z플립3);
		
		
		Product<SmartPhone, String> product3 = new Product<SmartPhone, String>(new SmartPhone("삼성","안드로이드"), "갤럭시 Z플립3");
		
		System.out.print(product3.toString());
		System.out.println(product3.getKind().toString());
		
		// product3.getKind() -> SmartPhone의 주솟값. toString() -> SamrtPhone이 가진 toString()

	}

}

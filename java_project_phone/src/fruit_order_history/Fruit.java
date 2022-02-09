package fruit_order_history;

public class Fruit {
	// 필드선언
	private String fname;
	private int price;

	public Fruit() { // 기본 생성자 생성

	}

	public Fruit(String fname, int price) { // 오버로딩, 매개변수 2개를 가지는 생성자 생성
		this.fname = fname;
		this.price = price;
	}

	// getter/setter
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 과일 구입 목록 출력
	public void printFruit() {
		System.out.println(fname + " : " + price);
	}

}

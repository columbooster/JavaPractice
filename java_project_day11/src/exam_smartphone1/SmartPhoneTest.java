package exam_smartphone1;

class SmartPhone {

	private String maker;
	private String name;
	private int price;
	private int discountRate;

	public SmartPhone() { 

	}

	public SmartPhone(String maker, String name, int price) {
		this(maker, name, price, 0);

	}

	public SmartPhone(String maker, String name, int price, int discountRate) {
		this.maker = maker;
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;

	}
	// ���ΰ��� ���ϴ� �޼ҵ�
	public int calculateDiscount() {
		return price * (100 - discountRate) / 100;
	}
	//getter/ setter
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

}
// main Ŭ����
public class SmartPhoneTest {

	public static void main(String[] args) {

		SmartPhone phone1 = new SmartPhone("�����ó�Ʈ9", "[�Ｚ]", 1094500);
		SmartPhone phone2 = new SmartPhone("������XS", "[����]", 1364000, 10);
		SmartPhone phone3 = new SmartPhone("������S8", "[�Ｚ]", 935000, 35);

		System.out.println("==============��ǰ���==============");
		System.out.println("----------------------------------");
		System.out.println(phone1.getMaker() + " " + phone1.getName() + "\n���� : " + phone1.getPrice());
		System.out.println("----------------------------------");
		System.out.println(phone2.getMaker() + " " + phone2.getName() + "\n���� : " + phone2.getPrice() + "\n���ΰ���("
				+ phone2.getDiscountRate() + "%) : " + phone2.calculateDiscount());
		System.out.println("----------------------------------");
		System.out.println(phone3.getMaker() + " " + phone3.getName() + "\n���� : " + phone3.getPrice() + "\n���ΰ���("
				+ phone3.getDiscountRate() + "%) : " + phone3.calculateDiscount());
		System.out.println("----------------------------------");

	}

}

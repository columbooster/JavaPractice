package fruit_order_history;

public class Fruit {
	// �ʵ弱��
	private String fname;
	private int price;

	public Fruit() { // �⺻ ������ ����

	}

	public Fruit(String fname, int price) { // �����ε�, �Ű����� 2���� ������ ������ ����
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

	// ���� ���� ��� ���
	public void printFruit() {
		System.out.println(fname + " : " + price);
	}

}

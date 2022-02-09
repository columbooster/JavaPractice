package exam_Inheritance3;

public class Car {
	
	private String color;
	private int account;
	
	public Car(String color, int account) {
		this.color = color;
		this.account = account;
	}

	public String getColor() {
		return color;
	}


	public int getAccount() {
		return account;
	}

	
	public String toString() {
		return "[색상] " + color + "\t[생산수량] " + account;
	}

}

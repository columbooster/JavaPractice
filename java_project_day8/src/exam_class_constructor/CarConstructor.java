package exam_class_constructor;

public class CarConstructor {
	private int speed;
	private int gear;
	private String color;
	//생성자
	public CarConstructor() { // 하나의 클래스 내에서 생성자가 다른 생성자를 호출하려고 할때
		// speed = 0;
		// gear = 1;
		// color = "red"
		this(0, 1, "red");
	}
	
	//생성자
	public CarConstructor(int speed, int gear, String color) {
		this.speed = speed;
		this.gear = gear;
		this.color = color;
	}
	// 접근자 - 접근제한자 리턴타입 get+필드명() {return 필드명; }
	public int getSpeed() {
		return speed;
	}
	
	public int getGear() {
		return gear;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return "자동차 정보[ 속도 : " + speed + " 기어 : " + gear + " 색상 : " + color + "]";
	}
	
	
	

}

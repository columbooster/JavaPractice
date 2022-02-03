package exam_class_basic;

public class Car {
	//필드 정의
	public int speed; // 속도 
	public int gear; // 기어 단수
	public String color; // 색상

	public 	void carData(int s, int g, String c) {
		//필드에 값 설정
		speed = s;
		gear = g;
		color = c;
	}
	
	
	// 메서드의 정의
	public void speedUp(int s) { // 속도 증가 메소드. s : 매개변수
		speed += s;
	}
	
	public void speedDown(int s) { // 속도 감소 메소드
		speed -= s;
	}
	
	public void printData() { // 객체의 상태를 문자열로 출력하는 메소드
		System.out.println("속도: " + speed + "기어 : " + gear + "색상 : " + color );
	}
	
	public String toString() { // 객체의 상태를 문자열로 반환하는 메소드
		return "속도: " + speed + "기어 : " + gear + "색상 : " + color;
	}
	
	
}

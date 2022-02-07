package exam_class_array;


class Car{
	private int speed;
	private int gear;
	private String color;
	
	public Car() {
		speed = 80;
		gear = 1;
		color = "red";
	}
	
	/*public void carData(){
	 * 	    speed = 80;
	 *		gear = 1; 
	 * 		color = "red";
	 * }
	 */
	
	public void speedUp() { //속도 증가 메소드
		speed += 10;
	}
	
	public String toString() { // 객체의 상태를 문자열로 반환하는 메서드
		return "속도 : " + speed + " 기어 : " + gear + " 색상 : " + color;
	}
	
	
}


public class CarObjectArray {

	public static void main(String[] args) {
		
		Car c1, c2, c3, c4, c5; // 객체 선언
		//객체 생성
		c1 = new Car();
		c2 = new Car();
		c3 = new Car();
		c4 = new Car();
		c5 = new Car();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		System.out.println(c5.toString());
		
		final int NUM_CARS = 5; // 상수 선언
		Car[] cars = new Car[NUM_CARS]; // 객체 배열 선언
		
		for(int i = 0; i < cars.length; i++) {
			cars[i] = new Car(); //객체 생성
			//cars[i].carData();
		}
		
		for(int i = 0; i < cars.length; i++) {
			cars[i].speedUp(); // 메서드 호출
		}
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println("자동차("+(i+1)+") " + cars[i].toString()); // 필드 출력
		}

	}

}

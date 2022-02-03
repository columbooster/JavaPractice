package exam_class_basic;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car(); // 첫번째 객체 생성
		
		//각각의 필드에 값을 설정해주는 방법 - 참조변수명.필드 = 값
		//myCar.speed = 0; //객체의 필드변경
		//myCar.gear = 1; //객체의 필드변경
		//myCar.color = "red"; //객체의 필드변경
		
		myCar.carData(0, 1, "red");
		
		// 객체의 메소드 호출 - 참조변수명.메소드()
		myCar.speedUp(20);
		myCar.printData(); // 출력방법1
		System.out.println(myCar.toString()); // 출력방법2
		System.out.println();
		
		Car yourCar = new Car(); // 두 번째 객체 생성
		
		//yourCar.gear = 3; //객체의 필드변경
		//yourCar.speed = 60; //객체의 필드변경
		//yourCar.color = "blue"; //객체의 필드변경
		
		yourCar.carData(60, 3, "blue");
		
		yourCar.speedDown(40); //객체의 메소드 호출
		yourCar.printData();  // 출력방법1
		System.out.println(yourCar.toString()); // 출력방법2

	}

}

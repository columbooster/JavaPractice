package exam_class_basic;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car(); // ù��° ��ü ����
		
		//������ �ʵ忡 ���� �������ִ� ��� - ����������.�ʵ� = ��
		//myCar.speed = 0; //��ü�� �ʵ庯��
		//myCar.gear = 1; //��ü�� �ʵ庯��
		//myCar.color = "red"; //��ü�� �ʵ庯��
		
		myCar.carData(0, 1, "red");
		
		// ��ü�� �޼ҵ� ȣ�� - ����������.�޼ҵ�()
		myCar.speedUp(20);
		myCar.printData(); // ��¹��1
		System.out.println(myCar.toString()); // ��¹��2
		System.out.println();
		
		Car yourCar = new Car(); // �� ��° ��ü ����
		
		//yourCar.gear = 3; //��ü�� �ʵ庯��
		//yourCar.speed = 60; //��ü�� �ʵ庯��
		//yourCar.color = "blue"; //��ü�� �ʵ庯��
		
		yourCar.carData(60, 3, "blue");
		
		yourCar.speedDown(40); //��ü�� �޼ҵ� ȣ��
		yourCar.printData();  // ��¹��1
		System.out.println(yourCar.toString()); // ��¹��2

	}

}

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
	
	public void speedUp() { //�ӵ� ���� �޼ҵ�
		speed += 10;
	}
	
	public String toString() { // ��ü�� ���¸� ���ڿ��� ��ȯ�ϴ� �޼���
		return "�ӵ� : " + speed + " ��� : " + gear + " ���� : " + color;
	}
	
	
}


public class CarObjectArray {

	public static void main(String[] args) {
		
		Car c1, c2, c3, c4, c5; // ��ü ����
		//��ü ����
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
		
		final int NUM_CARS = 5; // ��� ����
		Car[] cars = new Car[NUM_CARS]; // ��ü �迭 ����
		
		for(int i = 0; i < cars.length; i++) {
			cars[i] = new Car(); //��ü ����
			//cars[i].carData();
		}
		
		for(int i = 0; i < cars.length; i++) {
			cars[i].speedUp(); // �޼��� ȣ��
		}
		
		for(int i = 0; i < cars.length; i++) {
			System.out.println("�ڵ���("+(i+1)+") " + cars[i].toString()); // �ʵ� ���
		}

	}

}

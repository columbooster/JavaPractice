package exam_mutator_accessor;

public class CarMutatorAccessorTest {

	public static void main(String[] args) {
		
		CarMutatorAccessor myCar = new CarMutatorAccessor();
		
		// ������ �޼ҵ� ȣ��
		myCar.setSpeed(-70);
		myCar.setGear(1);
		myCar.setColor("red");
		
		myCar.speedUp(80);
		myCar.speedDown(40);
		
		// ������ �޼ҵ� ȣ��
		System.out.println("=======������ �޼��� ȣ��� �ʵ� ���======");
		System.out.println("���� �ڵ��� �ӵ�" + myCar.getSpeed());
		System.out.println("���� �ڵ��� ���" + myCar.getGear());
		System.out.println("���� �ڵ��� ����" + myCar.getColor());
		System.out.println();
		
		System.out.println("=======toString() �޼���� ��ü �ʵ� ���======");
		System.out.println(myCar.toString());
		
	}

}

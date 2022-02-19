package fruit_order_history;

public class FruitTest {

	public static void main(String[] args) {
		/*
		Fruit f1 = new Fruit("banana", 4800);
		
		Fruit f2 = new Fruit("strawberry", 21000);
		
		Fruit f3 = new Fruit();
		f3.setFname("persimmon");
		f3.setPrice(19000);
		
		Fruit f4 = new Fruit();
		f4.setFname("cherry");
		f4.setPrice(12000);
		
		//�ѱݾ�
		int sum = f1.getPrice()+f2.getPrice()+f3.getPrice()+f4.getPrice();
		//�����ıݾ�
		int sale = (int)(sum*0.85);
		
		System.out.println("==============���ϱ��� ���==============");
		f1.printFruit();
		f2.printFruit();
		f3.printFruit();
		f4.printFruit();
		
		System.out.println("----------------------------\n�ѱݾ� : " + sum + "��\n������ ���� �ݾ�: " + sale + "��");
		
		*/
		
		Fruit[] f = {
				new Fruit("banana", 4800),
				new Fruit("strawberry", 21000),
				new Fruit("persimmon", 19000),
				new Fruit("cherry", 12000)
		};
		
		
		System.out.println("==============���ϱ��� ���==============");
		int totalPrice = 0;
		for(int i = 0; i<f.length; i++) {
			f[i].printFruit();
			totalPrice += f[i].getPrice();
		}
		
		System.out.println("----------------------------\n�ѱݾ� : " + totalPrice + "��\n������ ���� �ݾ�: " + (int)(totalPrice*0.85) + "��");

	}

}

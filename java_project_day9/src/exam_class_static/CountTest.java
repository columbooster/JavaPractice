package exam_class_static;

class Count{
	private static int totalCount; //Ŭ�����ʵ�(�����ʵ�, static�ʵ�)
	private int count; // �ν���Ʈ �ʵ�
	
	//������
	public Count() {
		totalCount++;
		count++;
	}
	
	public void display() {
		System.out.println("count: " + count);
		System.out.println("totalCount : "+ totalCount);
		
		System.out.println();
	}
	
}

public class CountTest {

	public static void main(String[] args) {
		
		Count obj1 = new Count();
		obj1.display();
		
		Count obj2 = new Count();
		obj2.display();
		
		Count obj3 = new Count();
		obj3.display();


	}

}

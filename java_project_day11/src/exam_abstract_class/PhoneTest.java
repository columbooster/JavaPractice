package exam_abstract_class;

abstract class Phone {
	
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}

class SmartPhone extends Phone{
	
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("���ͳ��� �˻� �մϴ�.");
	}
}

public class PhoneTest {

	public static void main(String[] args) {
		//Phone phone = new Phone();  (x)
		
		SmartPhone smartPhone = new SmartPhone("Ȧ�浿");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}

package exam_class_array;

class Phone {
	private String name; // �ڵ�����
	private String comp; // �������
	
	public Phone() { //����Ʈ ������ (�Ű������� ������ ���� ���� ������)
		
	}
	
	public Phone(String name, String comp) { // ������(�Ű������� ������ �ִ� ������)
		this.name = name;
		this.comp = comp;
	}
	
	public void printData() { // �ʵ尪 ��� �޼ҵ�
		//System.out.println("�ڵ�����:" + name + "�������" + comp);
		System.out.printf("�ڵ�����:%10s\t�������:%s\n",name,comp);
	}
	
	
}


public class PhoneObjectArray {

	public static void main(String[] args) {
		
		//���������� ǥ��
		Phone p1,p2,p3; // ��ü ����(�������� ����)
		p1 = new Phone("������12","����"); // ��ü ����(�ν��Ͻ� ����)
		p2 = new Phone("������ s21", "�Ｚ");
		p3 = new Phone("������ ��Ʈ 20","�Ｚ");
		
		p1.printData();
		p2.printData();
		p3.printData();
		
		// ��ü�迭�� ǥ��
		Phone[] p = new Phone[3];
		
		p[0] = new Phone("������12","����");
		p[1] = new Phone("������ s21", "�Ｚ");
		p[2] = new Phone("������ ��Ʈ 20","�Ｚ");
		
		//��±���
		for(int i = 0; i<p.length; i++) {
			p[i].printData();
		}
		System.out.println();
		
		// for~each ��±���    for (�ڷ��� ������ : �迭��){}
		for (Phone ph : p) { //Phone ph = p[0]
			ph.printData();
		}
		System.out.println();
		
		//��ü�迭�� �ʱ�ȭ�� ǥ��
		Phone[] ph = new Phone[] {
				new Phone("������12","����"), // ph[0]
				new Phone("������ s21", "�Ｚ"), //ph[1]
				new Phone("������ ��Ʈ 20","�Ｚ") //ph[2]
				}; 
		
		//��±���
		for(int i = 0; i<ph.length; i++) {
			ph[i].printData();
		}
		
		
		
	}

}

package exam_Inheritance3;

public class CarMain {

	public static void main(String[] args) {

		Monata[] m = new Monata[] { new Monata("���", 5000, "NF", "�¿�"), new Monata("����", 7000, "Brilliant", "����"),
				new Monata("��ȫ��", 4000, "EF", "�ý�"), new Monata("������", 6000, "Hybrid", "�¿�") };
		
		
		System.out.println("======================== Monata ���� ���� ========================");
		
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i].toString());
		}
		
		
		System.out.println("======================== Monata ���� ���� ========================");
		//for(�ڷ��� ������ : �迭��) {}
		for(Monata monata : m) {
			System.out.println(monata.toString());
		}

	}

}

package exam_none_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		
		box.set("ȫ�浿");
		//box.set(new String("ȫ�浿"));
		String name = (String) box.get();
		System.out.println("name = " + name);
		
		// Box�� �������� ��(5) ���� -1
		// Integer iNum = Integer.valueOf(5); //�ڽ�
		// box.set(iNum);
		box.set(Integer.valueOf(5));
		Integer i = (Integer) box.get();
		System.out.println("i = " + i.intValue()); //��ڽ�
		
		// Box�� �������� ��(5) ���� -2
		box.set(5); // ����ڽ�(������ ->������)
		int iValue = (Integer) box.get(); //���� ��ڽ�(������ -> ������)
		System.out.println("iValue = " + iValue);
		
		
		// Box�� �Ǽ����� ��(8.4) ���� -1
		Double dNum = Double.valueOf(8.4);
		box.set(dNum);
		Double d = (Double) box.get();
		System.out.println("d = " + d.doubleValue());
		
		
		// Box�� �Ǽ����� ��(8.4) ���� -2
		// box.set(Double.valueOf(8.4);
		box.set(8.4);
		double dValue = (Double) box.get();
		System.out.println("dValue = " + dValue);
		
		Character ch = Character.valueOf('��');
		box.set(ch);
		Character c = (Character) box.get();
		System.out.println(c.charValue());
		
		box.set('��');
		char cValue = (Character) box.get();
		System.out.println(cValue);
		
//		color�� �ʵ�� ���� Apple Ŭ������ �����Ͽ�
//		Box Ŭ������ �����Ͽ� ����.
//		Apple a = new Apple("������");
//		box.set(a);
		
		box.set(new Apple("������"));
		Apple apple = (Apple) box.get();
		System.out.println(apple.toString());
		
		String str = "java";
		box.set(str);
		System.out.println("�� : " + (Integer) box.get());
		
		
		

	}

}

package exam_collection_list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.addElement("����");
		vector.addElement("����");
		vector.addElement("����");

		// elements() �޼���� Enumeration �������̽��� ������ Ŭ������ �ּڰ� ��ȯ
		Enumeration<String> en = vector.elements();

		while (en.hasMoreElements()) {
			String city = en.nextElement();
			System.out.println(city);
		}

		System.out.println("=======================");

		Enumeration<String> en2 = vector.elements();
		Iterator<String> iter = en2.asIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}

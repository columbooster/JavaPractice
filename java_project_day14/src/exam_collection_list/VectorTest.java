package exam_collection_list;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	static Vector<Movie> list = new Vector();

	public static void main(String[] args) {
		//Vector<Movie> list = new Vector();
		
		list.add(new Movie("�� ��Ʈ��", "�ڡڡڡڡ� 8.78", "�� ���꽺", "2022 ����"));
		list.add(new Movie("��ũ ����Ʈ ������", "�ڡڡڡڡ� 9.02", "�� �Ͽ���", "2020 �簳��"));
		list.add(new Movie("����: ���ƺ� ���", "�ڡڡڡ١� 6.41", "������", "2022����"));
		

		//printData(list);
		printData();
		
	}
//		private static void printData(Vector<Movie> list) {
		private static void printData() {
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.elementAt(i));
//			}
		
			Iterator<Movie> e = list.iterator();
			while(e.hasNext()) {
				System.out.println(e.next());
			}
		
		}
		
		
		
		
	

}

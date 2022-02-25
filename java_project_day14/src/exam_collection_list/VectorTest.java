package exam_collection_list;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	static Vector<Movie> list = new Vector();

	public static void main(String[] args) {
		//Vector<Movie> list = new Vector();
		
		list.add(new Movie("더 배트맨", "★★★★☆ 8.78", "맷 리브스", "2022 개봉"));
		list.add(new Movie("다크 나이트 리턴즈", "★★★★★ 9.02", "론 하워드", "2020 재개봉"));
		list.add(new Movie("해적: 도꺠비 깃발", "★★★☆☆ 6.41", "김정훈", "2022개봉"));
		

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

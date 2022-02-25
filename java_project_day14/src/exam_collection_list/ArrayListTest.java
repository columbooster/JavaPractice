package exam_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Apple {
	private String kind;
	private String color;

	public Apple() {

	}

	public Apple(String kind, String color) {
		this.kind = kind;
		this.color = color;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Apple [kind=" + this.kind + ", color=" + this.color + "]";
	}

}

public class ArrayListTest {

	private static final int String = 0;

	public static void main(String[] args) {
		// 프로그래밍 언어(문자열)를 저장하도록 인스턴스 생성
		ArrayList<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("Java");
		list.add("JSP");
		list.add("SPRING");

		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();

		list.add(1, "ORACLE");
		list.add(2, "Client programming");
		list.remove(3);

		int index = list.indexOf("Java");
		System.out.println(index);

		index = list.lastIndexOf("Java");
		System.out.println(index);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

//		for (String s : list) {
//			System.out.println(s);
//		}
		System.out.println();

		// 정수값을 저장하도록 인스턴스 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(Integer.valueOf(23));
		list1.add(Integer.valueOf(94));
		list1.add(62);
		list1.add(45);

		System.out.println(list1.toString());

		list1.add(2, Integer.valueOf(78));
		System.out.println(list1.toString());
		System.out.println();

		// Apple 이라는 이름으로 클래스를 생성한다. 이 클래스는 품종(kind)과 색상(color)을 필드로 가진다.
		// 여러 사과(Apple)를 저장하도록 인스턴스를 생성하여 출력해 주세요.

		ArrayList<Apple> list2 = new ArrayList<Apple>();

		list2.add(new Apple("홍로", "빨강"));
		list2.add(new Apple("아오리", "녹색"));
		list2.add(new Apple("오래된 사과", "갈색"));
		list2.add(new Apple("썸머킹", "황금"));

		for (int i = 0; i < list2.size(); i++) {
			Apple app = list2.get(i);
			System.out.print("품종 : " + app.getKind());
			System.out.println(", 색상 : " + app.getColor());
		}
		System.out.println();

		for (int i = 0; i < list2.size(); i++) {
//			System.out.print("품종 : " + list2.get(i).getKind());
//			System.out.print("품종 : " + list2.get(i).getColor());
			System.out.println(list2.get(i).toString());
		}
		System.out.println();

		for (Apple apple : list2) {
			System.out.println(apple);
		}

		// printArray(list2);
		System.out.println();

		// 여러 영화(Movie) 정보를 저장하도록 인스턴스 생성
		// Moive 클래스는 영화제목(mTitle), 평점(mGrade), 감독(mDirector), 개봉일(anYear) 등의 필드를 가진다.
		// 인터페이스명<타입 인자> 참조변수 = new 구현클래스 생성자<타입인자>();

		List<Movie> list3 = new ArrayList<Movie>();
		list3.add(new Movie("더 배트맨", "★★★★☆ 8.78", "맷 리브스", "2022 개봉"));
		list3.add(new Movie("다크 나이트 리턴즈", "★★★★★ 9.02", "론 하워드", "2020 재개봉"));
		list3.add(new Movie("해적: 도꺠비 깃발", "★★★☆☆ 6.41", "김정훈", "2022개봉"));

		Movie m = new Movie();
		m.setmTitle("어메이징 그레이스");
		m.setmGrade("★★★★☆ 8.62");
		m.setmDirector("시드니 폴락, 일란 엘리어트");
		m.setAnYear("2019 개봉");
		list3.add(m);

		// 원소의 개수로 인덱스 접근
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i).toString());
		}

		System.out.println();
		// for ~ each : for(자료형 변수 : 배열이나 컬렉션)
		for (Movie movie : list3) {
			System.out.println(movie);
		}
		System.out.println();
		
		//반복자
		Iterator<Movie> it = list3.iterator();
		while(it.hasNext()) {
			//Moive me = it.next();
			// system.out.println(me.toString());
			System.out.println(it.next().toString());
		}

	}

}

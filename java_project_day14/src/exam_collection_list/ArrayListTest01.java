package exam_collection_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest01 {
	public static void print(int n, List<String> list) {
		System.out.println(n + " : " + list.toString());
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		list.add("런던");
		list.add("로마");
		list.add("방콕");
		list.add("북경");
		list.add("도쿄");
		list.add("서울");

		System.out.println("1 : " + list.toString());

		list.add(1, "LA");
		print(2, list);

//		int indexOf(Object o) / int lastIndexOf(Object o)
//		3: 0
//		4: 12	
		System.out.println("3 : " + list.indexOf("서울"));
		System.out.println("4 : " + list.lastIndexOf("서울"));

//		boolean remove(Object o)

		list.remove("LA");
		print(5, list);

		// E remove(int index)
		list.remove(list.indexOf("상해"));
		print(6, list);

		// boolean contains(Object o)
		System.out.println("7 : " + list.contains("LA"));

		// Object[] toArray() : Object 타입의 배열 생성
		String cities[] = new String[0];
		// cities = list.<String>toArray(cities);
		cities = list.toArray(cities);
		System.out.println("9 : " + Arrays.toString(cities) + "" + cities.length);

		// void clear()
		list.clear();
		print(10, list);

		// boolean isEmpty()
		System.out.println("11 : " + list.isEmpty());
		
		list.add("파리");
		list.add("방콕");
		list.add("LA");
		
		
		//Arrays 클래스의 static <T> List<T> asList(T..a) : 제네릭 메서드
		// List<String> list2 : Arrays.<String>asList("서울","뉴욕","상해");
		//배열 -> List<E> 타입으로 변환
		String[] names = new String[] {"서울","뉴욕","상해"};
		List<String> list2 = Arrays.asList(names);
		//List<String> list2 = Arrays.asList(new String[] {"서울","뉴욕","상해"});
		//List<String> list2 = Arrays.asList("서울","뉴욕","상해");
		print(12, list2);

		List<String> list3 = Arrays.asList("서울","부산","상해");
		
		// boolean addAll(Collection<? extends E> c)
		list.addAll(list2);
		print(13, list);
		
		// boolean containsAll(Collection<?> c)
		System.out.println("14 : " + list.containsAll(list3));
		
	}

}

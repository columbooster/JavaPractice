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
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		list.add("����");
		list.add("�θ�");
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		list.add("����");

		System.out.println("1 : " + list.toString());

		list.add(1, "LA");
		print(2, list);

//		int indexOf(Object o) / int lastIndexOf(Object o)
//		3: 0
//		4: 12	
		System.out.println("3 : " + list.indexOf("����"));
		System.out.println("4 : " + list.lastIndexOf("����"));

//		boolean remove(Object o)

		list.remove("LA");
		print(5, list);

		// E remove(int index)
		list.remove(list.indexOf("����"));
		print(6, list);

		// boolean contains(Object o)
		System.out.println("7 : " + list.contains("LA"));

		// Object[] toArray() : Object Ÿ���� �迭 ����
		String cities[] = new String[0];
		// cities = list.<String>toArray(cities);
		cities = list.toArray(cities);
		System.out.println("9 : " + Arrays.toString(cities) + "" + cities.length);

		// void clear()
		list.clear();
		print(10, list);

		// boolean isEmpty()
		System.out.println("11 : " + list.isEmpty());
		
		list.add("�ĸ�");
		list.add("����");
		list.add("LA");
		
		
		//Arrays Ŭ������ static <T> List<T> asList(T..a) : ���׸� �޼���
		// List<String> list2 : Arrays.<String>asList("����","����","����");
		//�迭 -> List<E> Ÿ������ ��ȯ
		String[] names = new String[] {"����","����","����"};
		List<String> list2 = Arrays.asList(names);
		//List<String> list2 = Arrays.asList(new String[] {"����","����","����"});
		//List<String> list2 = Arrays.asList("����","����","����");
		print(12, list2);

		List<String> list3 = Arrays.asList("����","�λ�","����");
		
		// boolean addAll(Collection<? extends E> c)
		list.addAll(list2);
		print(13, list);
		
		// boolean containsAll(Collection<?> c)
		System.out.println("14 : " + list.containsAll(list3));
		
	}

}

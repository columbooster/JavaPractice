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
		// ���α׷��� ���(���ڿ�)�� �����ϵ��� �ν��Ͻ� ����
		ArrayList<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("Java");
		list.add("JSP");
		list.add("SPRING");

		int size = list.size();
		System.out.println("�� ��ü�� : " + size);
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

		// �������� �����ϵ��� �ν��Ͻ� ����
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(Integer.valueOf(23));
		list1.add(Integer.valueOf(94));
		list1.add(62);
		list1.add(45);

		System.out.println(list1.toString());

		list1.add(2, Integer.valueOf(78));
		System.out.println(list1.toString());
		System.out.println();

		// Apple �̶�� �̸����� Ŭ������ �����Ѵ�. �� Ŭ������ ǰ��(kind)�� ����(color)�� �ʵ�� ������.
		// ���� ���(Apple)�� �����ϵ��� �ν��Ͻ��� �����Ͽ� ����� �ּ���.

		ArrayList<Apple> list2 = new ArrayList<Apple>();

		list2.add(new Apple("ȫ��", "����"));
		list2.add(new Apple("�ƿ���", "���"));
		list2.add(new Apple("������ ���", "����"));
		list2.add(new Apple("���ŷ", "Ȳ��"));

		for (int i = 0; i < list2.size(); i++) {
			Apple app = list2.get(i);
			System.out.print("ǰ�� : " + app.getKind());
			System.out.println(", ���� : " + app.getColor());
		}
		System.out.println();

		for (int i = 0; i < list2.size(); i++) {
//			System.out.print("ǰ�� : " + list2.get(i).getKind());
//			System.out.print("ǰ�� : " + list2.get(i).getColor());
			System.out.println(list2.get(i).toString());
		}
		System.out.println();

		for (Apple apple : list2) {
			System.out.println(apple);
		}

		// printArray(list2);
		System.out.println();

		// ���� ��ȭ(Movie) ������ �����ϵ��� �ν��Ͻ� ����
		// Moive Ŭ������ ��ȭ����(mTitle), ����(mGrade), ����(mDirector), ������(anYear) ���� �ʵ带 ������.
		// �������̽���<Ÿ�� ����> �������� = new ����Ŭ���� ������<Ÿ������>();

		List<Movie> list3 = new ArrayList<Movie>();
		list3.add(new Movie("�� ��Ʈ��", "�ڡڡڡڡ� 8.78", "�� ���꽺", "2022 ����"));
		list3.add(new Movie("��ũ ����Ʈ ������", "�ڡڡڡڡ� 9.02", "�� �Ͽ���", "2020 �簳��"));
		list3.add(new Movie("����: ���ƺ� ���", "�ڡڡڡ١� 6.41", "������", "2022����"));

		Movie m = new Movie();
		m.setmTitle("�����¡ �׷��̽�");
		m.setmGrade("�ڡڡڡڡ� 8.62");
		m.setmDirector("�õ�� ����, �϶� ������Ʈ");
		m.setAnYear("2019 ����");
		list3.add(m);

		// ������ ������ �ε��� ����
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(list3.get(i).toString());
		}

		System.out.println();
		// for ~ each : for(�ڷ��� ���� : �迭�̳� �÷���)
		for (Movie movie : list3) {
			System.out.println(movie);
		}
		System.out.println();
		
		//�ݺ���
		Iterator<Movie> it = list3.iterator();
		while(it.hasNext()) {
			//Moive me = it.next();
			// system.out.println(me.toString());
			System.out.println(it.next().toString());
		}

	}

}

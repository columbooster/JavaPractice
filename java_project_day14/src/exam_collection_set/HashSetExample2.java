package exam_collection_set;

/* Member Ŭ������ �����Ѵ�. �ʵ�� �̸�(name)�� ����(age)�� ���´�.
 * [�䱸����]
 * ���̰� ������ ���� ��ü�� ����.
 */


import java.util.*;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿", 50));
		set.add(new Member("ȫ�浿", 40));
		set.add(new Member("��ö��", 36));
		
		System.out.println("�� ��ü�� : " + set.size());
		System.out.println("\t" + set.toString());

	}

}

package exam_collection_set;

/* ��ü ���ڿ��� �ߺ��� �ܾ �����ϴ� ���α׷��� �ۼ��Ͽ� ����.
 * �� ���� HashSet�� �̿��Ͽ� �ڵ��Ͽ� ������.
 * String[] sample = {"�ܾ�", "�ǹ�", "����", "�ǹ�", "�ܶ�"};
 * 
 * [��°��]
 * �ߺ��� �ܾ� : �ǹ�
 * �ܾ� �� : 4
 * �ߺ����� ���� �ܾ� : [�ܶ�, �ǹ�, ����, �ܾ�]
 * 
 */

import java.util.*;

public class FindDupplication {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		String[] sample = { "�ܾ�", "�ǹ�", "����", "�ǹ�", "�ܶ�" };

		for (String a : sample) {
			if (!set.add(a)) // !(����������) true -> false false-> true if(set.add(a) == false)
				System.out.println("�ߺ��� �ܾ�: " + a);
		}

		System.out.println("�ܾ� �� : " + set.size());
		System.out.println("�ߺ����� ���� �ܾ�: " + set.toString());

	}

}

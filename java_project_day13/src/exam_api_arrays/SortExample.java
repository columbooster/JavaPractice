package exam_api_arrays;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] array = { 9, 4, 5, 6, 2, 1 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		String[] subject = { "�ڹ�", "����Ŭ", "������" };
		Arrays.sort(subject);
		printArray(subject);

		System.out.println();

		// Member Ŭ������ �̸�/�ּ�/���̸� �ʵ�� ������ �ִ�. ���̼����� �����ϰ��� �Ѵ�.
		Member m1 = new Member("Ȧ�浿", "����� ������ ���嵿", 50);
		Member m2 = new Member("��ö��", "����� ������ ���ﵿ", 35);
		Member m3 = new Member("������", "����� ������ �Ｚ��", 20);
		Member member[] = { m1, m2, m3 };
		Arrays.sort(member);// Arrays Ŭ������ sort() �޼���� Ȯ��
		printArray(member);
		// System.out.println(Arrays.toString(members));

	}

	// �迭�� ���� ����ϱ� ���� �޼ҵ� ����.
	private static void printArray(Object[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i<array.length-1) {
				System.out.print(", ");
			}
		}
	}

}

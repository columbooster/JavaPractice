package exam_api_stringtokenizer;
//1. StringTokenizer Ŭ������ �̿��Ͽ� ����ڷκ��� ���� ���ڿ��� �ܾ�� �и�(,����)�Ѵ�. �и��� �ܾ�� �ܾ� ������ ����Ѵ�.

//2. �ܾ���� ���ڿ� �迭�� �ְ� �� �迭�� Arrays�� sort()�޼ҵ带 �̿��Ͽ� �����Ѵ�

// respect yourself and others will respect you.

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 0, i = 0;

		System.out.println("���ڿ��� �Է��Ͻÿ�");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ,");
		String[] ars = new String[st.countTokens()];

		System.out.println("�Է¹��� : ");
		while (st.hasMoreTokens()) {
			ars[i] = st.nextToken();
			System.out.println(ars[i]);
			count++;
			i++;
		}

		System.out.println("��� " + count + "���� �ܾ ����ֽ��ϴ�.");
		System.out.println("���Ĺ��� : ");
		Arrays.sort(ars);
		for (String word : ars) {
			System.out.println(word);
		}
		sc.close();

	}

}

package exam_month;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

// ����� ����

public class WordSearch {

	private Vector<String> wordVector = new Vector<String>();

	public WordSearch() {
	}

	private boolean readFile() { // words.txt ���� �б�
		try {
			Scanner fscanner = new Scanner(new FileInputStream("words.txt"));
			while (fscanner.hasNext())
				wordVector.add(fscanner.nextLine()); // �� ���ο� �ϳ��� �ܾ�
			fscanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("������Ʈ ���� ���� ������ �������� �ʽ��ϴ�.");
			return false;
		}
		System.out.println("������Ʈ ���� ���� words.txt ������ �о����ϴ�...");
		return true;
	}

	private void processQuery() { // �ܾ� �˻�
		Scanner scanner = new Scanner(System.in);
		while (true) {
			boolean found = false;
			System.out.print("�ܾ�>> ");
			String searchWord = scanner.nextLine(); // �˻��� �ܾ� �Է�
			if (searchWord.equals("�׸�")) {
				break;
			}

			// ���Ϳ��� �˻�
			for (int i = 0; i < wordVector.size(); i++) {
				String word = wordVector.get(i); // ���� ���� ���ڿ�
				if (word.length() < searchWord.length()) // ������ ���ڿ��� �˻� ���ڿ����� ª�� ���
					continue;

				// ���� ���ڿ��� �պκ��� �˻� ���ڿ� ũ�⸸ŭ �߶󳻱�
				String frontPart = word.substring(0, searchWord.length());

				if (searchWord.equals(frontPart)) {// �˻� ���ڿ��� �߶� �պκ� ��
					System.out.println(word); // ���Ϳ��� �߰��� �ܾ� ���
					found = true;
				}

			}
			if (!found) // �� �ܾ �߰߸��� ���� !(����������)�� false -> true , true -> false
				System.out.println("�߰��� �� ����");
		}
		scanner.close();
	}

	public void run() {
		boolean res = readFile(); // res�� false�̸� �ܾ� ���� �б� ����
		if (res == true)
			processQuery();
		System.out.println("�����մϴ�.");
	}

	public static void main(String[] args) {

		WordSearch ws = new WordSearch();
		ws.run();

//		FileInputStream fis = null;
//		BufferedReader input = null;
//
//		try {
//			fis = new FileInputStream("words.txt");
//			input = new BufferedReader(fis);
//			System.out.println("������Ʈ ���� ���� words.txt ������ �о����ϴ�.");
//
//			Vector<String> vec = new Vector<String>();
//			Iterator<String> iter = vec.iterator();
//			while (iter.hasNext()) {
//				String s = input.readLine();
//				vec.addElement(s);
//			}
//
//			Scanner scanner = new Scanner(System.in);
//
//			while (true) {
//				System.out.print("�ܾ�>> ");
//				String find = scanner.next();
//				if (find.equals("�׸�"))
//					break;
//				System.out.println("�����մϴ�.");
//				if (vec.contains(find)) {
//					System.out.println(vec.contains(find));
//				} else {
//					System.out.println("�߰��� �� ����");
//				}
//			}
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (input != null)
//					input.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}

	}

}

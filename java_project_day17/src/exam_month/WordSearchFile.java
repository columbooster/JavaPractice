package exam_month;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class WordSearchFile {

	private Vector<String> wordVector = new Vector<String>();

	private void readFile() {

		try {
			System.out.print("��� ���ϸ� �Է�>> ");
			Scanner scanner = new Scanner(System.in);
			String fileName = scanner.next(); // ���ϸ� �Է�
			Scanner fscanner = new Scanner(new FileInputStream(fileName)); // ���ϸ� �о���̱�
			while (fscanner.hasNext())
				wordVector.add(fscanner.nextLine()); // �� ���ο� �ϳ��� �ܾ�
			fscanner.close();
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("�ش� ������ ã�� �� �����ϴ�.");
			e.printStackTrace();
		}
	}

	private void processQuery() {
		Scanner input = new Scanner(System.in); 
		while (true) {
			System.out.print("�˻��� �ܾ ����>> ");
			String searchWord = input.nextLine();
			if (searchWord.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

			for (int i = 0; i < wordVector.size(); i++) {
				String word = wordVector.get(i); // ���� ���� ���ڿ�

				if (searchWord.contains(word)) {// �˻� ���ڿ��� �߶� �պκ� ��
					System.out.println(word); // ���Ϳ��� �߰��� �ܾ� ���
				} else {
					System.out.println("�߰��� �� ����");
				}

			}

		}

	}
	
	public void run() {
		readFile();
		processQuery();
	}

	public static void main(String[] args) {
		
		WordSearchFile wsf = new WordSearchFile();
		
		wsf.run();

	}

}

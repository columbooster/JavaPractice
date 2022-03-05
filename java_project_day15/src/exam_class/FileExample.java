package exam_class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*���� �޼��峪 ���� Ŭ���� ���� �̿��Ͽ� ���� 10��(���� ������ ��)�� ���ڿ��� ���·� ����ִ�
 * ����(input.txt)�� �����Ѵ�.
 * ������ ������ �о ������������ ������ ���� ���ĵ� ���ڸ� ���ڿ��� ���·� ����(output.txt)��
 * ���� ���α׷��� �ۼ��϶�.
 * 
 * input.txt   ------------>   output.txt
 * 123							10
 * 25							25
 * 10							127
 * 223							223
 * ...							...
 * 
 * 
 */

public class FileExample {

	public static void main(String[] args) {

		Writer fw = null;
		BufferedReader br = null;
		Writer ofw = null;

		Random r = new Random();

		try {
			// ���� ��� ��� ��Ʈ�� ����
			fw = new FileWriter("input.txt");
			for (int i = 0; i < 10; i++) {
				// fw.write(r.nextInt(300)+""); 80+"" -> "80"
				fw.write(String.valueOf(r.nextInt(300)) + 1); // ���ڸ� ���ڿ��� ��ȯ
				fw.write("\r\n"); // �ٹٲް� Ŀ����ġ �� ������

			}
			fw.flush();

			ArrayList<Integer> list = new ArrayList<Integer>();
			br = new BufferedReader(new FileReader("input.txt"));
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				int value = Integer.parseInt(line); // ���ڿ��� ���ڷ� ��ȯ
				list.add(value); // ArrayList Ŭ������ ���� �߰� add()
			}

			Collections.sort(list); // �÷����� �����͸� ������������ ����

			ofw = new FileWriter("output.txt");
			for (int i = 0; i < list.size(); i++) {
				// ofw.write(list.get(i+""));
				ofw.write(String.valueOf(list.get(i))); // ArrayListŬ������ ���� ��ȯ get(�ε���)
				ofw.write("\r\n");
			}
			ofw.flush();

			System.out.println("���Ͽ� ���������� ����Ǿ����ϴ�.");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
				if (br != null)
					br.close();
				if (ofw != null)
					ofw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

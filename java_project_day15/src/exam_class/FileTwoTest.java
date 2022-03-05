package exam_class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/* �־��� 2���� �ؽ�Ʈ ����(test.txt, result.txt)�� ���Ͽ�
 * �ϳ��� ����(writer.txt)�� ����� ���α׷��� �ۼ��Ͻÿ�.
 */

public class FileTwoTest {

	public static void main(String[] args) {

		BufferedReader br1 = null;
		BufferedReader br2 = null;
		Writer fw = null;

		try {
			br1 = new BufferedReader(new FileReader("test.txt"));
			br2 = new BufferedReader(new FileReader("result.txt"));

			fw = new FileWriter("writer.txt");

			while (true) {
				String line = br1.readLine();
				if (line == null)
					break;
				fw.write(line + "\n");
			}
			while (true) {
				String line = br2.readLine();
				if (line == null)
					break;
				fw.write(line + "\n");
			}
			fw.flush();
			System.out.println("���� ���� �Ϸ�.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
				if (br2 != null)
					br2.close();
				if (br1 != null)
					br1.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

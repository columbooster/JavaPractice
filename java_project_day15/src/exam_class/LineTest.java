package exam_class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

/*�ؽ�Ʈ ����(writer.txt)�� �о �տ� ���� ��ȣ�� �ٿ��� ����ϴ� ���α׷��� �ۼ��϶�.
 * ���� ��ȣ�� ���� 6�̰� ������ ���ĵǵ��� line.txt ���Ͽ� �����Ѵ�.
 * 
 *       1: ���� ������ ������ �� ���� �������� �ʴ°��� �ƴ϶� ������ ������ �ٽ� �Ͼ�� ���� �ִ�.
 *....
 * 
 */

public class LineTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			br = new BufferedReader(new FileReader("writer.txt"));
			pw = new PrintWriter(new FileWriter("line.txt"));

			int count = 0;
			while (true) {
				count++;
				String line = br.readLine();
				if (line == null)
					break;
				pw.format("%6d: %s\n", count, line);

			}
			pw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null)
					pw.close();
				if (br != null)
					br.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}

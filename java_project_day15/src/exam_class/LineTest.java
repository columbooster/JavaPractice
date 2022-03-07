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

/*텍스트 파일(writer.txt)을 읽어서 앞에 라인 번호를 붙여서 출력하는 프로그램을 작성하라.
 * 라인 번호는 폭이 6이고 오른쪽 정렬되도록 line.txt 파일에 저장한다.
 * 
 *       1: 가장 위대한 영광은 한 번도 실패하지 않는것이 아니라 실패할 때마다 다시 일어서는 데에 있다.
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

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

/*�ؽ�Ʈ ����(writer.txt)�� �о �տ� ���� ��ȣ�� �ٿ��� ����ϴ� ���α׷��� �ۼ��϶�.
 * ���� ��ȣ�� ���� 6�̰� ������ ���ĵǵ��� line.txt ���Ͽ� �����Ѵ�.
 * 
 *       1: ���� ������ ������ �� ���� �������� �ʴ°��� �ƴ϶� ������ ������ �ٽ� �Ͼ�� ���� �ִ�.
 *....
 * 
 */

public class LineTest {

	public static void main(String[] args) {
		
		
		try (BufferedReader br = new BufferedReader(new FileReader("writer.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("line.txt"))) {
			String str = null;
			while((str = br.readLine()) != null) {
				System.out.println(str);
				bw.write(String.format("%6s", str));
			}	
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
	}

}

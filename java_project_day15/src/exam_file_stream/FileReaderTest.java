package exam_file_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

// "test.txt" ���Ͽ� "���� ������ ������ �� ���� �������� ������ �ƴ϶� ������ ������ �ٽ� �Ͼ�� ���� �ִ�."��� ���� �����ϰ� (-> ���� ��� ��Ʈ��)
// �� ������ ������ �о� (-> ���� �Է� ��Ʈ��) �ܼ�(ȭ��)�� ����ϵ��� �ڵ��� ������.

public class FileReaderTest {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("test.txt");
		char[] data = "���� ������ ������ �� ���� �������� ������ �ƴ϶� ������ ������ �ٽ� �Ͼ�� ���� �ִ�.".toCharArray();
		for (int i = 0; i < data.length; i++) {
			writer.write(data[i]);
		}
		
		writer.close();

		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.print(str);
		}
		br.close();
		
	}

}

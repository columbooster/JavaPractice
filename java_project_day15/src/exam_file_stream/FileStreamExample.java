package exam_file_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// �̹��� ������ C:/Temp �� �ٿ��ֱ� �Ѵ�. �� �̹��� ������ �о� C:/ImageTest(��������)�� ����ǵ��� �ڵ� �ۼ����ּ���.
public class FileStreamExample {

	public static void main(String[] args) {

		FileInputStream is = null;
		FileOutputStream os = null;

		int readByteNo;
		String originalFileName = "C:/Temp/cloud.jpg";
		String targetFileName = "C:/ImageTest/cloud.jpg";

		try {
			is = new FileInputStream(originalFileName);
			os = new FileOutputStream(targetFileName);

			byte[] readBytes = new byte[100];
			while ((readByteNo = is.read(readBytes)) != -1) {
				os.write(readBytes, 0, readByteNo);
			}

		} catch (IOException io) {
			System.out.println("����¿� ������ �־� �� �̻� ���� �۾��� ������ �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("����½� ���� �߻����� ���� �۾��� ������ �� �����ϴ�.");
		} finally {
			try {
				if (is != null)
					is.close();
				if (os != null)
					os.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("���� ���簡 �Ϸ�Ǿ����ϴ�.");

	}

}

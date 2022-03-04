package exam_buffered_stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {

		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		BufferedInputStream bis = null;

		long start = 0;
		long end = 0;

		fis1 = new FileInputStream("C:/ImageTest/fish.jpg");
		start = System.currentTimeMillis();
		while (fis1.read() != -1) {
		}
		end = System.currentTimeMillis();
		System.out.println("������� �ʾ��� �� : " + (end - start) + "ms");
		fis1.close();

		fis2 = new FileInputStream("C:/ImageTest/fish.jpg");
		bis = new BufferedInputStream(fis2);

		// bis = new BufferedInputStream(new FileInputStream("C:/ImageTest/fish.jpg"));
		start = System.currentTimeMillis();
		while (bis.read() != -1) {

		}
		end = System.currentTimeMillis();
		System.out.println("������� �� : " + (end - start) + "ms");
		bis.close();
		fis2.close();

	}

}

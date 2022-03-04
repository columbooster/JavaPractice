package exam_buffered_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		int data = -1;
		long start = 0;
		long end = 0;

		//fis = new FileInputStream("C:/ImageTest/fish.jpg");
		bis = new BufferedInputStream(new FileInputStream("C:/ImageTest/fish.jpg"));
		fos = new FileOutputStream("C:/Temp/fish1.jpg");
		start = System.currentTimeMillis();
		while ((data = bis.read()) != -1) {
			fos.write(data);
		}
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		//fis.close();
		System.out.println("사용하지 않았을 때 : " + (end - start) + "ms");

		fis = new FileInputStream("C:/ImageTest/fish.jpg");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/fish2.jpg");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while ((data = bis.read()) != -1) {
			bos.write(data);
		}
		end = System.currentTimeMillis();

		bos.close();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("사용했을 때 : " + (end - start) + "ms");

	}

}

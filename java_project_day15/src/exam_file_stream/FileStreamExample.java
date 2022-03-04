package exam_file_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 이미지 파일을 C:/Temp 에 붙여넣기 한다. 그 이미지 파일을 읽어 C:/ImageTest(폴더생성)에 저장되도록 코딩 작성해주세요.
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
			System.out.println("입출력에 문제가 있어 더 이상 복사 작업을 진행할 수 없습니다.");
		} catch (Exception e) {
			System.out.println("입출력시 오류 발생으로 복사 작업을 진행할 수 없습니다.");
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
		System.out.println("파일 복사가 완료되었습니다.");

	}

}

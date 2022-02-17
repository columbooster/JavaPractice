package exam_throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionMethod3 {

	public static void main(String[] args) {
		FileInputStream f1 = null;

		byte[] readBytes = new byte[6];
		int readByteNo;
		String data = "";

		try {
			f1 = new FileInputStream("test.txt");
			while (true) {
				readByteNo = f1.read(readBytes);
				//System.out.println("읽어들인 바이트 수 : " + readByteNo);
				if (readByteNo == -1) // 더이상 읽을 데이터가 없을때 -1
					break;
				data += new String(readBytes, 0, readByteNo);
			}
			System.out.println(data);
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽는 도중에 문제가 발생하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (f1 != null)
					f1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

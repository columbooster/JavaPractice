package exam_inputstream_read;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {

		InputStream is = null; // �߻� Ŭ���� �������� = null;

		try {
			is = new FileInputStream("C:/Temp/test.txt"); // �������� = new ����Ŭ���� ������()
			System.out.println("[�о� ���� ����]");
//		int readByte;
//		while(true) {
//			readByte = is.read();
//			if(readByte == -1) break;
//			System.out.print((char)readByte);
//		}

//			int readByteNo;
//			byte[] readBytes = new byte[4];
//
//			String data = "";
//			while (true) {
//				readByteNo = is.read(readBytes); //
//				System.out.println("���� ����Ʈ �� :" + readByteNo);
//				if (readByteNo == -1)
//					break;
//				data += new String(readBytes, 0, readByteNo);
//			}
//
//			System.out.println(data);

			int readByteNo;
			byte[] readBytes = new byte[10]; // read ����Ʈ �迭�� ������ ���̼��� 5�̰� �迭�� ���� ��ġ�� 2��°����.
			readByteNo = is.read(readBytes, 2, 5);
			System.out.println("���� ����Ʈ �� : " + readByteNo);

			for (int i = 0; i < readBytes.length; i++) {
				System.out.println((char) readBytes[i]);
			}

		} catch (IOException io) { // FileNotFoundException�� IOException�� ����Ŭ�����̴�.
			io.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

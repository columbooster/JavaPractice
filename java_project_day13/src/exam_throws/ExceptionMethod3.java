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
				//System.out.println("�о���� ����Ʈ �� : " + readByteNo);
				if (readByteNo == -1) // ���̻� ���� �����Ͱ� ������ -1
					break;
				data += new String(readBytes, 0, readByteNo);
			}
			System.out.println(data);
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println("������ �д� ���߿� ������ �߻��Ͽ����ϴ�.");
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

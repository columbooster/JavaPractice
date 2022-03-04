package exam_outputstream_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {

		OutputStream os = null; // �߻�Ŭ���� �������� = null

		try {
			os = new FileOutputStream("C:/Temp/test.txt"); // �������� = new ����Ŭ���� ������()
//			byte[] data ="Java".getBytes(); // getBytes() �޼���� ���ڿ��� ����Ʈ �迭�� ��ȯ�Ͽ� ��ȯ�ϴ� �޼���
//			for (int i = 0; i < data.length; i++) {
//				os.write(data[i]);
//			}

//			byte[] data = "Hello! Java".getBytes();
//			os.write(data); // write(����Ʈ�迭)

//			byte[] data = "HelloWorld! Java".getBytes();
//			// write �迭�� �� �߿��� ù��° �ε��� ���� 2���� ���� ��ŭ�� ����.
//			os.write(data, 1,2);

			byte[] data = "God doesn't require us to susseed.\nhe only requires that you try.".getBytes();
			os.write(data); // write(����Ʈ �迭)

			System.out.println("������ �����Ǿ����ϴ�.");
		} catch (FileNotFoundException fnf) {
			System.out.println("������ ������ �����Ǿ� ���� �ʽ��ϴ�.");
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if (os != null) { // �ν��Ͻ� ������ ���������� �̷������ os�� null�� �ƴ϶� �ּڰ��� ������ ��.
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

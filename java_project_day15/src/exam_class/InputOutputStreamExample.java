package exam_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*"C:/Temp/intest.txt"�� �����Ѵ�. (�������ϻ���)
 * �ش� ���Ͽ��� �Ʒ��� ������ ����Ǿ� �ִ�.
 * 	Hello World!
 * 	My Name is IOStream
 * �� ������ �о� C:/Temp/outtest.txt ������ �����Ͽ� �����Ѵ�.
 */

public class InputOutputStreamExample {

	public static void main(String[] args) {

//		InputStream is = null; // ����Ʈ �Է� ��Ƽ��
//		OutputStream os = null; // ����Ʈ ��� ��Ʈ��
//
//		try {
//			is = new FileInputStream("C:/Temp/intest.txt"); // �о�� ����
//			os = new FileOutputStream("C:/Temp/outtest.txt"); // ����� ����
//			int data = -1;
//
//			while ((data = is.read()) != -1) { // �� ����Ʈ�� ���� �����Ͱ� -1(��)�� ���� ����������
//				os.write(data);
//				System.out.print((char) data); // read() Ȯ�ο� ���
//			}
//			System.out.println("���� ���簡 �Ϸ� �Ǿ����ϴ�."); // ���� ���� ����� �Ǿ����� Ȯ�ο� ���
//
//		} catch (FileNotFoundException e) {
//			System.out.println("������ �������� �ʰų� ��ΰ� ���� �ʾ� �� �̻� �۾��� ������ �� �����ϴ�.");
//		} catch (IOException io) {
//			System.out.println("���� ����¿� ������ �߻��Ͽ� �� �̻��� �۾��� ������ �� �����ϴ�.");
//		} catch (Exception e) {
//			System.out.println("���� �߻����� �� �̻��� �۾��� ������ �� �����ϴ�.");
//		} finally {
//			try {
//				if (is != null)
//					is.close();
//				if (os != null)
//					os.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}

		// try with resource�� �̿�
		try (FileInputStream is = new FileInputStream("C:/Temp/intest.txt");
				FileOutputStream os = new FileOutputStream("C:/Temp/outtest.txt");) {

			int data = -1;

			while ((data = is.read()) != -1) { // �� ����Ʈ�� ���� �����Ͱ� -1(��)�� ���� ����������
				os.write(data);
				System.out.print((char) data); // read() Ȯ�ο� ���
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʰų� ��ΰ� ���� �ʾ� �� �̻� �۾��� ������ �� �����ϴ�.");
		} catch (IOException io) {
			System.out.println("���� ����¿� ������ �߻��Ͽ� �� �̻��� �۾��� ������ �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("���� �߻����� �� �̻��� �۾��� ������ �� �����ϴ�.");
		}
		System.out.println("���� ���簡 �Ϸ� �Ǿ����ϴ�.");

	}

}

package exam_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("test.txt");
//		char[] data = {'A', 'B', 'C', 'D', 'E'};
//		char[] data = {'ȫ', '��', '��'};
//		char[] data = "���� �Ϸ絵 �ּ��� ����~".toCharArray();

		// write(int c) �޼���
//		for (int i = 0; i < data.length; i++) {
//			writer.write(data[i]);
//		}

		// write(char[] cbuf) �޼���
		// writer.write(data);

		StringBuffer sb = new StringBuffer();
		sb.append("���� �츮�� ������ ���� ");
		sb.append("�䱸���� �ʴ´�.\n");
		sb.append("�츮�� ����� ���� �䱸�� ");
		sb.append("���̴�.(���� �׷���)");

//		write(String str)
		writer.write(sb.toString());

		System.out.println("���� ��� �Ϸ�.");
		writer.flush();
		writer.close();

	}

}

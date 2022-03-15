package exam_writer_write;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// �������Ͽ� �����͸� �̾ �� �ֵ��� �����ϰ��� �Ѵ�.
// �߸��� �κ� 2���ε� �� �� �� ã�ƺ���.
public class WriteExample5 {

	public static void main(String[] args) {
		
		Writer writer = null;
		
		try {
		writer = new FileWriter("test.txt", true); //  FileWriter�� false �� true�� �ٲ�� �̾�Ⱑ��. �⺻���� false�� ����⸦ �ع�����.
		StringBuffer sb = new StringBuffer();
		sb.append("���� �츮�� ������ ���� ");
		sb.append("�䱸���� �ʴ´�.\n");
		sb.append("�츮�� ����� ���� �䱸�� ");
		sb.append("���̴�.(���� �׷���)");

		writer.write(sb.toString());
		writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(writer != null)
					writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		

	}

}

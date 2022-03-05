package exam_file;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception {

		File dir = new File("C:/Temp3/Dir");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");

		if (!dir.exists()) {
			dir.mkdirs();
		}
		if (file1.exists()) {
			file1.delete();
		}
		if (!file2.exists()) {
			file2.createNewFile();
		}

		// ���Ͽ� ������ ��� �� �б�
		if (file2.exists()) {
			try (PrintWriter out = new PrintWriter(file2)) {
				out.println("hello java!");
			}
			System.out.println("���� �̸� : " + file2.getName());
			System.out.println("���� ��� : " + file2.getPath());
			System.out.println("���� ���� : " + file2.canWrite());
			System.out.println("�б� ���� : " + file2.canRead());
			System.out.println("���� ���� : " + file2.length());

		} else {
			System.out.println("�۾��� ������ �������� ����");
		}

		File temp = new File("C:/Temp");
		System.out.println("��� : " + temp.getPath());
		System.out.println("�θ� : " + temp.getParent());
		System.out.println("������ : " + temp.getAbsolutePath());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd	   a	HH:mm");

		File[] contents = temp.listFiles();
		System.out.println("��¥ \t\t�ð� \t ���� \t\tũ�� \t�̸�");
		System.out.println("-------------------------------------------------------------------------");
		for (File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));

			if (file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();

		}

	}

}

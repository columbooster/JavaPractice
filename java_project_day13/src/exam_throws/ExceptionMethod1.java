package exam_throws;

import java.io.IOException;

public class ExceptionMethod1 {
	
	public static void main(String[] args) {
		System.out.println(readString());

	}
	
	public static String readString() {
		byte[] buf = new byte[100];
		System.out.println("���ڿ��� �Է��Ͻÿ�.");
		int readCount = 0;
		try {
			readCount = System.in.read(buf); // �� : 2byte java : 4byte
			System.out.println(readCount);
		} catch(IOException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		// 		   String(����Ʈ�迭, ��ġ����, ���� ��) : byte �迭�� ���� ���ڿ��� ����
		return new String(buf,0,readCount-2); // -2 ���� ������ ���Ͱ�(2byte)�� ���ֱ� ���ؼ���.
	}

}

package exam_throws;

import java.io.IOException;

public class ExceptionMethod2 {

	public static void main(String[] args) {
		try {
			System.out.println(readString());
		}catch(IOException e) { //���⼭ ����ó��
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	public static String readString() throws IOException {
		byte[] buf = new byte[100];
		System.out.println("���ڿ��� �Է��Ͻÿ�.");
		int readCount = System.in.read(buf);
		return new String(buf,0,readCount-2);
	}

}

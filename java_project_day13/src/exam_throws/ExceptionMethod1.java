package exam_throws;

import java.io.IOException;

public class ExceptionMethod1 {
	
	public static void main(String[] args) {
		System.out.println(readString());

	}
	
	public static String readString() {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하시오.");
		int readCount = 0;
		try {
			readCount = System.in.read(buf); // 자 : 2byte java : 4byte
			System.out.println(readCount);
		} catch(IOException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		// 		   String(바이트배열, 위치정보, 길이 수) : byte 배열의 값을 문자열로 생성
		return new String(buf,0,readCount-2); // -2 해준 이유는 엔터값(2byte)를 뺴주기 위해서다.
	}

}

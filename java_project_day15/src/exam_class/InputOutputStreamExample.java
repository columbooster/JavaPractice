package exam_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*"C:/Temp/intest.txt"를 생성한다. (직접파일생성)
 * 해당 파일에는 아래의 내용이 저장되어 있다.
 * 	Hello World!
 * 	My Name is IOStream
 * 이 내용을 읽어 C:/Temp/outtest.txt 파일을 생성하여 저장한다.
 */

public class InputOutputStreamExample {

	public static void main(String[] args) {

//		InputStream is = null; // 바이트 입력 스티림
//		OutputStream os = null; // 바이트 출력 스트림
//
//		try {
//			is = new FileInputStream("C:/Temp/intest.txt"); // 읽어올 파일
//			os = new FileOutputStream("C:/Temp/outtest.txt"); // 출력할 파일
//			int data = -1;
//
//			while ((data = is.read()) != -1) { // 한 바이트씩 읽은 데이터가 -1(끝)과 같지 않을때까지
//				os.write(data);
//				System.out.print((char) data); // read() 확인용 출력
//			}
//			System.out.println("파일 복사가 완료 되었습니다."); // 파일 생성 제대로 되었는지 확인용 출력
//
//		} catch (FileNotFoundException e) {
//			System.out.println("파일이 존재하지 않거나 경로가 맞지 않아 더 이상 작업을 진행할 수 없습니다.");
//		} catch (IOException io) {
//			System.out.println("파일 입출력에 문제가 발생하여 더 이상의 작업을 진행할 수 없습니다.");
//		} catch (Exception e) {
//			System.out.println("오류 발생으로 더 이상의 작업을 진행할 수 없습니다.");
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

		// try with resource문 이용
		try (FileInputStream is = new FileInputStream("C:/Temp/intest.txt");
				FileOutputStream os = new FileOutputStream("C:/Temp/outtest.txt");) {

			int data = -1;

			while ((data = is.read()) != -1) { // 한 바이트씩 읽은 데이터가 -1(끝)과 같지 않을때까지
				os.write(data);
				System.out.print((char) data); // read() 확인용 출력
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않거나 경로가 맞지 않아 더 이상 작업을 진행할 수 없습니다.");
		} catch (IOException io) {
			System.out.println("파일 입출력에 문제가 발생하여 더 이상의 작업을 진행할 수 없습니다.");
		} catch (Exception e) {
			System.out.println("오류 발생으로 더 이상의 작업을 진행할 수 없습니다.");
		}
		System.out.println("파일 복사가 완료 되었습니다.");

	}

}

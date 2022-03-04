package exam_object_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamTest {

	public static void main(String[] args) {

		ObjectInputStream in = null;
		ObjectOutputStream out = null;

		try {
			out = new ObjectOutputStream(new FileOutputStream("object.dat"));
			out.writeObject(new PhoneInfo("홍길동", "010-3432-8796"));
			out.writeObject(new PhoneInfo("김희진", "010-5901-3546"));

			in = new ObjectInputStream(new FileInputStream("object.dat"));
			while (true) {
				PhoneInfo info = (PhoneInfo) in.readObject();
				if (info == null)
					break;
				System.out.println(info.toString());
			}

		} catch (ClassNotFoundException c) {
			System.out.println("ClassNotFoundException Error");
		} catch (IOException io) { // readObject가 끝까지 일기 때문에 예외가 발생하여 출력되기 때문에 값을 넣을 필요가 없다.
			 //System.out.println("IOException Error");
			 //io.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception Error");
		} finally {
			try {
				if (in != null)
					in.close();
				if (out != null)
					out.close();
			} catch (Exception e2) {
				System.out.println("close Error");
			}
		}

	}

}

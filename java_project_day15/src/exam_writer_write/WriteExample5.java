package exam_writer_write;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// 기존파일에 데이터를 이어쓸 수 있도록 구현하고자 한다.
public class WriteExample5 {

	public static void main(String[] args) {
		
		Writer writer = null;
		
		try {
		writer = new FileWriter("test.txt", true); //  FileWriter에 false 를 true로 바꿔야 이어쓰기가능. 기본값은 false라서 덮어쓰기를 해버린다. 
		StringBuffer sb = new StringBuffer();
		sb.append("신은 우리가 성공할 것을 ");
		sb.append("요구하지 않는다.\n");
		sb.append("우리가 노력할 것을 요구할 ");
		sb.append("뿐이다.(마더 테레사)");

		writer.write(sb.toString());
		writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // close() 메소드를 사용하여 FileWriter를 닫아줘야한다.
			try {
				if(writer != null)
					writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		

	}

}

package exam_file_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

// "test.txt" 파일에 "가장 위대한 영광은 한 번도 실패하지 않음이 아니라 실패할 때마다 다시 일어서는 데에 있다."라는 글을 저장하고 (-> 문자 출력 스트림)
// 이 파일의 내용을 읽어 (-> 문자 입력 스트림) 콘솔(화면)에 출력하도록 코딩해 보세요.

public class FileReaderTest {

	public static void main(String[] args) throws Exception {

		Writer writer = new FileWriter("test.txt");
		char[] data = "가장 위대한 영광은 한 번도 실패하지 않음이 아니라 실패할 때마다 다시 일어서는 데에 있다.".toCharArray();
		for (int i = 0; i < data.length; i++) {
			writer.write(data[i]);
		}
		
		writer.close();

		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.print(str);
		}
		br.close();
		
	}

}

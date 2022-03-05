package exam_class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*랜덤 메서드나 랜덤 클래스 등을 이용하여 정수 10개(각자 임의의 수)를 문자열의 형태로 들어있는
 * 파일(input.txt)을 생성한다.
 * 생성된 파일을 읽어서 오름차순으로 정렬한 다음 정렬된 숫자를 문자열의 형태로 파일(output.txt)에
 * 쓰는 프로그램을 작성하라.
 * 
 * input.txt   ------------>   output.txt
 * 123							10
 * 25							25
 * 10							127
 * 223							223
 * ...							...
 * 
 * 
 */

public class FileExample {

	public static void main(String[] args) {

		Writer fw = null;
		BufferedReader br = null;
		Writer ofw = null;

		Random r = new Random();

		try {
			// 문자 기반 출력 스트림 생성
			fw = new FileWriter("input.txt");
			for (int i = 0; i < 10; i++) {
				// fw.write(r.nextInt(300)+""); 80+"" -> "80"
				fw.write(String.valueOf(r.nextInt(300)) + 1); // 숫자를 문자열로 변환
				fw.write("\r\n"); // 줄바꿈과 커서위치 맨 앞으로

			}
			fw.flush();

			ArrayList<Integer> list = new ArrayList<Integer>();
			br = new BufferedReader(new FileReader("input.txt"));
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				int value = Integer.parseInt(line); // 문자열을 숫자로 변환
				list.add(value); // ArrayList 클래스의 원소 추가 add()
			}

			Collections.sort(list); // 컬렉션의 데이터를 오름차순으로 정렬

			ofw = new FileWriter("output.txt");
			for (int i = 0; i < list.size(); i++) {
				// ofw.write(list.get(i+""));
				ofw.write(String.valueOf(list.get(i))); // ArrayList클래스의 원소 반환 get(인덱스)
				ofw.write("\r\n");
			}
			ofw.flush();

			System.out.println("파일에 정상적으로 복사되었습니다.");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
				if (br != null)
					br.close();
				if (ofw != null)
					ofw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

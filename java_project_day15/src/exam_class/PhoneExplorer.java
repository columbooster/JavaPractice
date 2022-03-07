package exam_class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/* 사용자로 하여금 이름과 나이를 입력받아 	phone.txt 파일에 저장한다. 단 입력수를 관계없이 사용자가 "그만"이라는
 * 문자열을 입력하면 입력 작업을 종료한다. writePhoneFile()
 * 저장한 데이터를 읽어와 이름을 key, 전화번호를 value로 저장한다. readPhoneFile()
 * 그리고 반복문을 통해 이름을 입력받아 전화 번호를 출력하되 "그만" 이라는 문자열이 입력되면 검색을 종료한다. processQuery()
 */

public class PhoneExplorer {
	private String fileName = "phone.txt";
	static Scanner input = new Scanner(System.in);
	private HashMap<String, String> map = new HashMap<String, String>();

	private void writePhoneFile() {
		File f = new File(fileName);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f));) {

			while (true) {
				System.out.println("이름 전화번호(공백으로 구분)");
				String line = input.nextLine(); // 한 줄 읽기
				if (line.equals("그만"))
					break;
				bw.write(line + "\r\n"); // 한 줄 띄어 저장하기 위해

			}
			bw.flush();
			System.out.println(f.getPath() + "에 저장하였습니다.");

		} catch (IOException e) { // 파일을 저장할 수 없는 경우 예외
			e.printStackTrace();
		}

	}

	private void readPhoneFile() {
		Scanner scan = null;

		try {
			scan = new Scanner(new FileReader(new File(fileName)));
			while (scan.hasNext()) {
				String name = scan.next();
				String tel = scan.next();
				map.put(name, tel); // 해시맵에 저장 
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (scan != null)
					scan.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	private void processQuery() {
		while (true) {
			System.out.print("이름 >> ");
			String name = input.nextLine();
			if (name.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			String tel = map.get(name);
			if (tel == null) {
				System.out.println("찾는 이름이 없습니다.");
			} else {
				System.out.println(tel);
			}
			
		}
	}

	public void run() {
		writePhoneFile();
		readPhoneFile();
		processQuery();
	}

	public static void main(String[] args) {

		PhoneExplorer pe = new PhoneExplorer();

		pe.run();

	}

}

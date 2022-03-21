package exam_month;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class WordSearchFile {

	private Vector<String> wordVector = new Vector<String>();

	private void readFile() {

		try {
			System.out.print("대상 파일명 입력>> ");
			Scanner scanner = new Scanner(System.in);
			String fileName = scanner.next(); // 파일명 입력
			Scanner fscanner = new Scanner(new FileInputStream(fileName)); // 파일명 읽어들이기
			while (fscanner.hasNext())
				wordVector.add(fscanner.nextLine()); // 한 라인에 하나의 단어
			fscanner.close();
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾을 수 업습니다.");
			e.printStackTrace();
		}
	}

	private void processQuery() {
		Scanner input = new Scanner(System.in); 
		while (true) {
			System.out.print("검색할 단어나 문장>> ");
			String searchWord = input.nextLine();
			if (searchWord.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			for (int i = 0; i < wordVector.size(); i++) {
				String word = wordVector.get(i); // 벡터 내의 문자열

				if (searchWord.contains(word)) {// 검색 문자열과 잘라낸 앞부분 비교
					System.out.println(word); // 벡터에서 발견한 단어 출력
				} else {
					System.out.println("발견할 수 없음");
				}

			}

		}

	}
	
	public void run() {
		readFile();
		processQuery();
	}

	public static void main(String[] args) {
		
		WordSearchFile wsf = new WordSearchFile();
		
		wsf.run();

	}

}

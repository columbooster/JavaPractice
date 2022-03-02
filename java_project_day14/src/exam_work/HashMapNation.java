package exam_work;

import java.text.DecimalFormat;
import java.util.*;

public class HashMapNation {

	private Scanner sc = new Scanner(System.in); // Scanner를 통해 입력

	static HashMap<String, Integer> map = new HashMap<String, Integer>(); // key-String과 value-Integer 타입을 가지는 HashMap
																			// 인스턴스 map 생성

	private void read() { // 사용자의 입력을 받을 read() 메소드
		System.out.println("나라 이름과 인구를 10개 입력하세요.(예: 대한민국 51833175)");

		for (int i = 0; i < 10; i++) { // 반복문을 통해 10회 나라이름과 인구수를 입력ㄷ받는다.
			System.out.print("나라 이름, 인구 >>");
			String data = sc.nextLine();
			StringTokenizer st = new StringTokenizer(data, " "); // StringTokenizer로 입력받은 data를 " "(공백) 구분자로 나눈다.
			String name = st.nextToken().trim(); // 입력받은 나라이름의 앞뒤공백을 trim()으로 제거해준다.
			int pop = Integer.parseInt(st.nextToken().trim()); // Integer.parseInt()로 int형으로 형변환해준후 trim()으로 공백 제거.

			map.put(name, pop); // 사용자로부터 입력받은 나라이름(name)과 인구수(pop)를 map에 put()을 이용하여 넣는다.
		}

	}

	private void search() { // 인구수를 검색할 search() 메소드
		System.out.println("나라 이름을 입력하면 인구를 검색할 수 있습니다. 끝을 입력하면 종료합니다.");
		
		while (true) { // while 문을 통하여 반복한다.
			System.out.print("나라 이름 >> ");
			String name = sc.nextLine(); // 검색할 나라이름을 입력받는다.
			if (name.equals("끝")) { // equals() 메소드를 사용하여 "끝"을 입력 받으면
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return; // 반복문을 종료한다.
			}

			for (Map.Entry<String, Integer> entry : map.entrySet()) { // 향상된 for문을 사용하여 모든 map에 있는 entry(key,value)를
																		// 검색한다.
				String key = entry.getKey();
				Integer val = entry.getValue();
				DecimalFormat df = new DecimalFormat(); // DecimalFormat을 사용하기 위해 인스턴스 df를 생성한다.
				df = new DecimalFormat("#,###"); // 3자리 단위로 표시할 수 있도록 설정한다.
				if (key.equals(name)) {// map의 key값이 사용자로부터 입력받은 name 과 같을경우
					System.out.println(key + "의 인구는 " + df.format(val)); // 3자리씩 끊어서 출력한다.
					break; // for문을 벗어난다.
				}
			}

		}
	}

	public void run() { // read() 메소드와 search() 메소드를 동작 시키기위한 run() 메소드
		read();
		search();
	}

	public static void main(String[] args) {

		HashMapNation map = new HashMapNation();

		map.run(); // 프로그램 실행

	}

}

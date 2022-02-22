package exam_api_stringbuffer;

import java.util.Scanner;

/* StringBuffer 클래스를 활용하여 명령처럼 문자열을 수정하라. (클래스명 : WordReplace)
 * 아래 실행 예제에서 love!LOVE는 love를 찾아 LOVE로 수정하라는 명령문이다. 첫번째 만난 문자열만 수정한다.
 * 
 * [실행예시]
 * >> v
 * 명령: 우리는!We
 * We love Java Programming.
 * 명령: love!LOVE
 * We LOVE Java Programming.
 * 명령: love!사랑
 * 찾을 수 없습니다!
 * 명령: !JAVA
 * 잘못된 명령입니다!
 * 명령: 종료
 * 종료합니다
 */

public class WordReplace {

	public static void main(String[] args) {

		System.out.println(">>");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine(); // 한 라인을 문자열로 읽는다.
		StringBuffer sb = new StringBuffer(text);

		while (true) {
			System.out.println("명령: ");
			String cmd = sc.nextLine();
			if (cmd.equals("종료")) {
				System.out.println("종료합니다.");
				break; // 반복문을 벗어날 때
				// System.exit(1); // 프로그램을 종료할 때. 이때는 Scanner 클래스의 close()를 먼저 호출 후 명시.
			}
			String[] tokens = cmd.split("!");
			if (tokens.length != 2) {
				System.out.println("잘못된 명령입니다.");
			} else {
				if (tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("잘못된 명령입니다.");
					continue;
				}
				int index = sb.indexOf(tokens[0]);
				if (index == -1) { // not found!
					System.out.println("찾을 수 없습니다.");
					continue;
				}
				sb.replace(index, index + tokens[0].length(), tokens[1]);
				System.out.println(sb.toString());
			}
		}
		sc.close();

	}

}

package exam_class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*사용자로부터 다음과 같은 형식으로 입력받아
 * 사용자의 번호, 이름, 전화번호, 이메일 주소 형태로 파일(user.txt)에 저장한다.
 * 그리고 다시 요구사항을 제시한다. "입력을 완료할려면 1 계속 입력하시려면 0"을 선택하게.
 * 입력이 끝나면 사용자로부터 번호를 입력받아서
 * 그 번호에 해당하는 전화 번호를 출력하는 프로그램을 작성하라.
 * 번		호 1
 * 이		름 홍길동
 * 전 화 번 호 010-2342-4686
 * 이메일주소 hong1234@hanmail.net
 * 
 * 번		호 2
 * 이		름 김철수
 * 전 화 번 호 010-8765-1254
 * 이메일주소 kim7979@naver.com
 * 
 */

public class UserInform {

	public static void main(String[] args) throws IOException {

		int num2;
		String search = null;
		String num, name, tel, email;
		PrintWriter in = new PrintWriter(new FileWriter("user.txt"));
		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("사용자 번호를 입력하세요.");
			num = input.next();
			System.out.println("사용자 이름를 입력하세요.");
			name = input.next();
			System.out.println("사용자 전화번호를 입력하세요.");
			tel = input.next();
			System.out.println("사용자 이메일를 입력하세요.");
			email = input.next();
			System.out.println("입력을 완료할려면 1 계속하시려면 0");
			num2 = input.nextInt();

			in.print(num + "," + name + "," + tel + "," + email + ",");
			in.flush();
			if (num2 == 1)
				break;

		}
		System.out.println("검색하실 사용자 번호를 입력하세요.");

		num2 = input.nextInt();

		Scanner scan = null;
		scan = new Scanner(new BufferedReader(new FileReader("user.txt")));
		scan.useDelimiter(",");
		while (scan.hasNext()) {
			num = scan.next();
			name = scan.next();
			tel = scan.next();
			if (!scan.hasNext())
				break;
			email = scan.next();

			if (num.equals(num2 + "")) {
				search = tel;
			}

		}
		System.out.println("전화번호는 : " + search);
		if (input != null)
			input.close();
		if (in != null)
			in.close();
		if (scan != null)
			scan.close();

	}

}

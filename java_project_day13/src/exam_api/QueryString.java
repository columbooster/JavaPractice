package exam_api;

import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

/*다음은 프로그램의 실행 방법과 결과를 보여준다. 동일하게 작성하도록 자바 프로그램을 완성하라.
 * 
 * [실행결과]
 * 문자를 입력해 주세요:name=홍길동&id=javauser&email=java1234@naver.com
 * name 홀길동
 * id	javauser
 * email	java1234@naver.com
 * 
 */

public class QueryString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력해 주세요:");
		
		String query = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(query, "&"); //&로 문자열 분리
		StringTokenizer subSt = null;
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();// name=홍길동
			subSt = new StringTokenizer(token, "="); //서브 문자열은 =로 분리
			
//			int m = subSt.countTokens();
//			for(int j=0; j<m; j++) {
//				System.out.println(subSt.nextToken() + '\t');
//			}
			
			while(subSt.hasMoreTokens()) {
				System.out.print(subSt.nextToken() + '\t');
			}
			System.out.println();
			
		}
		
		sc.close();

	}

}

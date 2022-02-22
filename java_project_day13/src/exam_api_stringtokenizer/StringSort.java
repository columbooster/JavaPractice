package exam_api_stringtokenizer;
//1. StringTokenizer 클래스를 이용하여 사용자로부터 받은 문자열을 단어로 분리(,공백)한다. 분리된 단어와 단어 개수를 출력한다.

//2. 단어들을 문자열 배열에 넣고 이 배열을 Arrays의 sort()메소드를 이용하여 정렬한다

// respect yourself and others will respect you.

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 0, i = 0;

		System.out.println("문자열을 입력하시오");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ,");
		String[] ars = new String[st.countTokens()];

		System.out.println("입력문자 : ");
		while (st.hasMoreTokens()) {
			ars[i] = st.nextToken();
			System.out.println(ars[i]);
			count++;
			i++;
		}

		System.out.println("모두 " + count + "개의 단어가 들어있습니다.");
		System.out.println("정렬문자 : ");
		Arrays.sort(ars);
		for (String word : ars) {
			System.out.println(word);
		}
		sc.close();

	}

}

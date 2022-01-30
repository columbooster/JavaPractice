package exam_array;

public class CharArray {

	public static void main(String[] args) {
		char letter ='A'; // A 유니코드값 65
		char[] alphabet = new char[26];
		
		for(int i = 0; i < 26; i++) {
			alphabet[i] = (char) (letter + i);
		}
		
		System.out.println("대문자 출력 : ");
		
		for(char c : alphabet) {
			System.out.printf("%2c", c);
		}
		
		System.out.println();
		
		char[] ch = new char[26];
		
		for(int i = 0, code = 65; i < 26; i++, code++) {
			ch[i] = (char) code;
		}
		
		System.out.println("대문자 출력 : ");
		
		for(char  c :ch) {
			System.out.printf("%2c", c);
		}
		
		System.out.println();
		
		System.out.println("소문자 출력 : ");
		
		for(int i = 0; i < ch.length; i++) {
			System.out.printf("%2c", ch[i]+32);
		}
		
		System.out.println();

	}

}

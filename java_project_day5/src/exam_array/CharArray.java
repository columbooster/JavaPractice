package exam_array;

public class CharArray {

	public static void main(String[] args) {
		char letter ='A'; // A �����ڵ尪 65
		char[] alphabet = new char[26];
		
		for(int i = 0; i < 26; i++) {
			alphabet[i] = (char) (letter + i);
		}
		
		System.out.println("�빮�� ��� : ");
		
		for(char c : alphabet) {
			System.out.printf("%2c", c);
		}
		
		System.out.println();
		
		char[] ch = new char[26];
		
		for(int i = 0, code = 65; i < 26; i++, code++) {
			ch[i] = (char) code;
		}
		
		System.out.println("�빮�� ��� : ");
		
		for(char  c :ch) {
			System.out.printf("%2c", c);
		}
		
		System.out.println();
		
		System.out.println("�ҹ��� ��� : ");
		
		for(int i = 0; i < ch.length; i++) {
			System.out.printf("%2c", ch[i]+32);
		}
		
		System.out.println();

	}

}

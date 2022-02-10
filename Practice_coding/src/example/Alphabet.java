package example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Alphabet {

	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		char[] s = input.readLine().toCharArray();

		int[] alphabet = new int[26];

		for (int i = 0; i < s.length; i++) {
			alphabet[(int) s[i] - 97] += 1;
		}

		for (int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}

	}

}

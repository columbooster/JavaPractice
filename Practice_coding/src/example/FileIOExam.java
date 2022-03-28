package example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExam {

	public static void main(String[] args) {

		try {
			File file = new File("Output.txt");

			FileReader fileReader = new FileReader(file);
			int cur = 0;

			while ((cur = fileReader.read()) != -1) {
				System.out.println((char) cur);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

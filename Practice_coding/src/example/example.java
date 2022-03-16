package example;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class example {

	public static void main(String[] args) {

		Writer fw = null;

		try {
			fw = new FileWriter("test.txt", true); 

			fw.write(97);
			fw.write(65);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}	
		}

	}
}
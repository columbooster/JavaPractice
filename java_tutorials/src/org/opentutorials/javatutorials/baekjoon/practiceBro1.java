package org.opentutorials.javatutorials.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.io.IOException;
import java.util.StringTokenizer;

public class practiceBro1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String a = br.readLine();
		a = a.trim();
		String[] b = a.split(" ");
		
		if(b.length==1 && b[0].equals("")) {
			System.out.println(0);
			
		} else { System.out.println(b.length); }
		

	}

}

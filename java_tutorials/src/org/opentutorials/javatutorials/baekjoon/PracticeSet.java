package org.opentutorials.javatutorials.baekjoon;

import java.util.TreeSet;
import java.util.Scanner;
import java.util.Iterator;

public class PracticeSet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();

			int i = 0;

			TreeSet<Integer> set = new TreeSet<Integer>();

			while(i < N) {
	
				set.add(sc.nextInt());
				i++;
			}
			
			Iterator<Integer> iter = set.iterator();
			while(iter.hasNext()) {
				System.out.print(iter.next()+" ");
			}

		sc.close();	

	}

}
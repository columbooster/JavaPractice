package example;

import java.util.ArrayList;

public class ArrayEx {

	public static void main(String[] args) {
		ArrayList<Integer>[] arr = new ArrayList[100];
		for(int i=0; i < 100; i ++) {
			arr[i] = new ArrayList<Integer>();
		}
		arr[0].add(1);
		arr[3].add(2);
		
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < arr[i].size(); j++) {
				System.out.println(arr[i].get(j));
			}
		}
	}

}

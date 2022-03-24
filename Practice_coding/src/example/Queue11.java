package example;

import java.util.LinkedList; //import
import java.util.Queue; //import

public class Queue11 {

	public static void main(String[] args) {
	
		Queue<Integer> queue = new LinkedList<>(); 

		Queue<Integer> stack = new LinkedList<>(); //int형 queue 선언
		queue.add(1);     // queue에 값 1 추가
		queue.add(2);     // queue에 값 2 추가
		queue.offer(3);   // queue에 값 3 추가

	}

}

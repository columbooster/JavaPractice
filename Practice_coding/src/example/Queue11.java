package example;

import java.util.LinkedList; //import
import java.util.Queue; //import

public class Queue11 {

	public static void main(String[] args) {
	
		Queue<Integer> queue = new LinkedList<>(); 

		Queue<Integer> stack = new LinkedList<>(); //int�� queue ����
		queue.add(1);     // queue�� �� 1 �߰�
		queue.add(2);     // queue�� �� 2 �߰�
		queue.offer(3);   // queue�� �� 3 �߰�

	}

}

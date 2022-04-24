package example;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // ������ ���� 
		int m = sc.nextInt(); // ������ ���� 
		int v = sc.nextInt(); // Ž���� ������ ������ ��ȣ 

		boolean visited[] = new boolean[n + 1]; // �湮 ���θ� �˻��� �迭 

		LinkedList<Integer>[] adjList = new LinkedList[n + 1];

		for (int i = 0; i <= n; i++) {
			adjList[i] = new LinkedList<Integer>();
		}

		// �� ���� ���̿� ���� ���� ������ ���� �� �ִ�.
		// �Է����� �־����� ������ ������̴�.
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			adjList[v1].add(v2);
			adjList[v2].add(v1);
		}

		for (int i = 1; i <= n; i++) { 
			Collections.sort(adjList[i]); // �湮 ������ ���� �������� ���� 
		}

		System.out.println("BFS - ��������Ʈ");
		bfs_list(v, adjList, visited);
	}

	// BFS - ��������Ʈ 
	public static void bfs_list(int v, LinkedList<Integer>[] adjList, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[v] = true; 
		queue.add(v);

		while(queue.size() != 0) { 
			v = queue.poll(); 
			System.out.print(v + " ");

			Iterator<Integer> iter = adjList[v].listIterator();
			while(iter.hasNext()) { 
				int w = iter.next(); 
				if(!visited[w]) { 
					visited[w] = true; 
					queue.add(w); 
				} 
			}
		}

	}

}
package example;

public class DFSExample {
	// �� ��尡 �湮�� ������ 1���� �迭 �ڷ������� ǥ��
	public static boolean[] visited = { false, false, false, false, false, false, false, false, false };
	// �� ��尡 ����� ������ 2���� �迭 �ڷ������� ǥ��
	public static int[][] graph = { {}, { 2, 3, 8 }, { 1, 7 }, { 1, 4, 5 }, { 3, 5 }, { 3, 4 }, { 7 }, { 2, 6, 8 },
			{ 1, 7 } };

	public static void main(String[] args) {
		int start = 1; // ���� ���
		dfs(start);
	}

	/*
	 * dfs �˰����� �����ϴ� �Լ�
	 * 
	 * @param v Ž���� ���
	 */
	public static void dfs(int v) {
		// ���� ��� �湮 ó��
		visited[v] = true;
		// �湮 ��� ���
		System.out.print(v + "");

		// ���� ��� Ž��
		for (int i : graph[v]) {
			// �湮���� ���� ���� ��� �� ���� ���� ��带 ���ÿ� �ֱ�
			if (visited[i] == false) {
				dfs(i);
			}
		}

	}

}
